#include "NimBLEDevice.h"
#include <ArduinoJson.h>
#include <WiFi.h> // Include the Wi-Fi library
#include <HTTPClient.h>

NimBLEScan* pBLEScan;


const char* ssid = "Starbucks";
const char* password = "starbucks2019";
const char* apiUrl = "http://20.62.111.133:80/api/receive_data";
const char* localUrl = "hhttp://95.183.155.86:80/data";
//String rawData = "C005052500000000310C9541000023";
const char* unit_kg="2";

String payloadToString(const uint8_t* payload, size_t length) {
    String result = "";
    for (size_t i = 0; i < length; i++) {
        char hex[3];
        sprintf(hex, "%02X", payload[i]);
        result += hex;
    }
    return result;

}

String rawDataKG(String data){
  String kg = data.substring(8,12);
  long decimalValue = strtol(kg.c_str(), NULL, 16);
  char* point = ".";
  String stringKg = String(decimalValue);
  char lastChar = stringKg.charAt(stringKg.length() - 1);
  stringKg =   stringKg.substring(0,stringKg.length()-1) + point + lastChar;
  return stringKg;
}

String unitOfMeasure(String data){
  String unit = data.substring(20,21);
  if(unit.equals(unit_kg)){
    return "kg";
  }
  else{
    return "pound";
  }

}

int measureDone(String data){
  String measured = data.substring(21,22);
  return measured.toInt();
}




class MyAdvertisedDeviceCallbacks : public NimBLEAdvertisedDeviceCallbacks {
    void onResult(NimBLEAdvertisedDevice* advertisedDevice) {
       if (advertisedDevice->haveName() &&
            advertisedDevice->getName() == "OMIYA-C39-HW" &&
            advertisedDevice->getAddress().equals(NimBLEAddress("0c:95:41:00:00:23"))) { 
            String rawData = payloadToString(advertisedDevice->getPayload(), advertisedDevice->getPayloadLength());
            Serial.println(rawData);
            
            // Create a JSON object to store your data
            StaticJsonDocument<200> jsonDoc;
            if(measureDone(rawData) == 1 ){
            //jsonDoc["device_name"] =  "OMIYA-C39-HW"; //advertisedDevice->getName();
              jsonDoc["user_id"] = advertisedDevice->getAddress().toString();
              jsonDoc["measure"] = rawDataKG(rawData);
              jsonDoc["unit"] = unitOfMeasure(rawData);

              String jsonData;
              serializeJson(jsonDoc, jsonData);

              // Send the data to your Flask API
              sendToFlaskAPI(jsonData);
            }
        }
    }

    void sendToFlaskAPI(const String& data) {
    HTTPClient http;
    http.begin(apiUrl);
    http.addHeader("Content-Type", "application/json");

    int httpResponseCode = http.POST(data);
    if (httpResponseCode > 0) {
        Serial.print("HTTP Response code: ");
        Serial.println(httpResponseCode);
    } else {
        Serial.print("Error sending data. HTTP error code: ");
        Serial.println(httpResponseCode);
        Serial.println(http.errorToString(httpResponseCode).c_str());
    }

    http.end();
}
};


void setup() {

  Serial.begin(115200);
  Serial.println("Connecting to Wi-Fi...");

  // Connect to Wi-Fi
  WiFi.begin(ssid, password);

  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Connecting to Wi-Fi...");
  }

  Serial.println("Connected to Wi-Fi");

  Serial.begin(115200);
  Serial.println("Scanning...");

  NimBLEDevice::setScanFilterMode(CONFIG_BTDM_SCAN_DUPL_TYPE_DEVICE);

  NimBLEDevice::setScanDuplicateCacheSize(200);

  NimBLEDevice::init("");

  pBLEScan = NimBLEDevice::getScan(); //create new scan
  // Set the callback for when devices are discovered, no duplicates.
  pBLEScan->setAdvertisedDeviceCallbacks(new MyAdvertisedDeviceCallbacks(), false);
  pBLEScan->setActiveScan(true); // Set active scanning, this will get more data from the advertiser.
  pBLEScan->setInterval(97); // How often the scan occurs / switches channels; in milliseconds,
  pBLEScan->setWindow(37);  // How long to scan during the interval; in milliseconds.
  pBLEScan->setMaxResults(0); // do not store the scan results, use callback only.
}


void loop() {
  // If an error occurs that stops the scan, it will be restarted here.
  if(pBLEScan->isScanning() == false) {
      // Start scan with: duration = 0 seconds(forever), no scan end callback, not a continuation of a previous scan.
      pBLEScan->start(0, nullptr, false);
  }

  delay(2000);
}
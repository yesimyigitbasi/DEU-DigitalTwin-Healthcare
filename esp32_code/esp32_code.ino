#include "NimBLEDevice.h"
#include <ArduinoJson.h>
#include <WiFi.h> // Include the Wi-Fi library
#include <HTTPClient.h>


NimBLEScan* pBLEScan;


const char* ssid = "Zyxel_4A61";
const char* password = "QXLYLP83ML";
const char* apiUrl = "20.62.111.133:80/api/receive_data";



class MyAdvertisedDeviceCallbacks : public NimBLEAdvertisedDeviceCallbacks {
    void onResult(NimBLEAdvertisedDevice* advertisedDevice) {
       /* if (advertisedDevice->haveName() &&
            advertisedDevice->getName() == "OMIYA-C39-HW" &&
            advertisedDevice->getAddress().equals(NimBLEAddress("0c:95:41:00:00:23"))) { */
            
            // Create a JSON object to store your data
            StaticJsonDocument<200> jsonDoc;
            jsonDoc["device_name"] =  "OMIYA-C39-HW"; //advertisedDevice->getName();
            jsonDoc["device_address"] = "0c:95:41:00:00:23"; //advertisedDevice->getAddress().toString();

            // Convert JSON to a string
            String jsonData;
            serializeJson(jsonDoc, jsonData);

            // Send the data to your Flask API
            sendToFlaskAPI(jsonData);
        //}
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

/*
void onResult(NimBLEAdvertisedDevice* advertisedDevice) {
    // Regardless of the device, always create and send the JSON data
    StaticJsonDocument<200> jsonDoc;
    jsonDoc["device_name"] = advertisedDevice->getName();
    jsonDoc["mac_address"] = advertisedDevice->getAddress().toString();
    jsonDoc["raw_data"] = payloadToString(advertisedDevice->getPayload(), advertisedDevice->getPayloadLength());
    
    // Serialize the JSON object to a string
    String jsonString;
    serializeJson(jsonDoc, jsonString);
    
    // Send JSON data to the server
    sendJsonToServer(jsonString);

    if (advertisedDevice->haveName() && 
        advertisedDevice->getName() == "OMIYA-C39-HW" &&
        advertisedDevice->getAddress().equals(NimBLEAddress("0c:95:41:00:00:23"))) {
            Serial.println("Raw Data:");
            const uint8_t* payload = advertisedDevice->getPayload();
            size_t payloadLength = advertisedDevice->getPayloadLength();
            for (size_t i = 0; i < payloadLength; i++) {
                Serial.printf("%02X ", payload[i]);
            }
            Serial.println();
    }
    
}
*/


String payloadToString(const uint8_t* payload, size_t length) {
    String result = "";
    for (size_t i = 0; i < length; i++) {
        char hex[3];
        sprintf(hex, "%02X", payload[i]);
        result += hex;
    }
    return result;
}

/*
void sendJsonToServer(String jsonString) {
    HTTPClient http;
    http.begin("http://20.62.111.133/receive_data");
    http.addHeader("Content-Type", "application/json");

    int httpResponseCode = http.POST(jsonString);

    if (httpResponseCode == 200) {
        Serial.println("HTTP Response code: 200 - Data sent successfully");
    } else {
        Serial.print("HTTP Error: ");
        Serial.println(httpResponseCode);
    }

    http.end();
}
*/


void loop() {
  // If an error occurs that stops the scan, it will be restarted here.
  if(pBLEScan->isScanning() == false) {
      // Start scan with: duration = 0 seconds(forever), no scan end callback, not a continuation of a previous scan.
      pBLEScan->start(0, nullptr, false);
  }

  delay(2000);
}

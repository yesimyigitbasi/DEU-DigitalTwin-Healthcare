#include <BLEDevice.h>
#include <BLEUtils.h>
#include <BLEScan.h>
#include <BLEAdvertisedDevice.h>

int scanTime = 5; // In seconds
BLEScan* pBLEScan;

class MyAdvertisedDeviceCallbacks: public BLEAdvertisedDeviceCallbacks {
    void onResult(BLEAdvertisedDevice advertisedDevice) {
        // Check if the device name and address match the target
        if (advertisedDevice.haveName() && 
            advertisedDevice.getName() == "OMIYA-C39-HW" &&
            advertisedDevice.getAddress().equals(BLEAddress("0c:95:41:00:00:23"))) {

            Serial.println("Raw Data:");
            const uint8_t* payload = advertisedDevice.getPayload();
            size_t payloadLength = advertisedDevice.getPayloadLength();
            for (size_t i = 0; i < payloadLength; i++) {
                Serial.printf("%02X ", payload[i]);
            }
            Serial.println();
        }
    }
};

void setup() {
    Serial.begin(115200);
    Serial.println("Scanning...");

    BLEDevice::init("");
    pBLEScan = BLEDevice::getScan(); // Create new scan
    pBLEScan->setAdvertisedDeviceCallbacks(new MyAdvertisedDeviceCallbacks());
    pBLEScan->setActiveScan(true); // Active scan uses more power, but gets results faster
    pBLEScan->setInterval(100);
    pBLEScan->setWindow(99);  // Less than or equal to setInterval value
}

void loop() {
    BLEScanResults foundDevices = pBLEScan->start(scanTime, false);
    pBLEScan->clearResults(); // Clear results before starting the next scan
    delay(2000);
}

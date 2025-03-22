#include <SPI.h>
#include <MFRC522.h>

#define SS_PIN 10
#define RST_PIN 9

MFRC522 rfid(SS_PIN, RST_PIN);

// **Liste der erlaubten Karten (kann erweitert werden)**
byte allowed_uid[][4] = {
  {0x73, 0x9A, 0xB1, 0x01}, // Hauptkarte
  {0x12, 0x34, 0x56, 0x78}  // Wartungskarte (Beispiel)
};
const int count_allowed_cards = sizeof(allowed_uid) / sizeof(allowed_uid[0]);

bool is_allowed_card(byte uid[]) {
  for (int i = 0; i < count_allowed_cards; i++) {
    bool match = true;
    for (int j = 0; j < 4; j++) {
      if (allowed_uid[i][j] != uid[j]) {
        match = false;
        break;
      }
    }
    if (match) return true; // Sobald eine Karte passt -> Zugang gewährt
  }
  return false; // Keine Übereinstimmung gefunden
}

bool locked = false; // Sperrstatus
int counter = 0; // Fehlversuche zählen

void setup() {
  Serial.begin(9600);
  SPI.begin();
  rfid.PCD_Init();
  Serial.println("🔄 Scanner bereit...");
}

void loop() {
  if (locked) {
    Serial.println("🚫 Scanner gesperrt! Keine weiteren Versuche möglich.");
    return;
  }

  if (counter > 10) {
    Serial.println("❌ Anmeldung gesperrt (zu viele Fehlversuche)");
    locked = true; // Sperrt den Scanner nach 10 Fehlversuchen
    return;
  }
  
  if (!rfid.PICC_IsNewCardPresent()) {
    Serial.println("🔍 Keine Karte gefunden");
    return;
  }
  
  if (!rfid.PICC_ReadCardSerial()) {
    Serial.println("⚠️ Karte konnte nicht gelesen werden!");
    return;
  }

  Serial.println("📍 Karte gefunden! UID:");
  for (byte i = 0; i < rfid.uid.size; i++) {
    Serial.print(rfid.uid.uidByte[i] < 0x10 ? " 0" : " ");
    Serial.print(rfid.uid.uidByte[i], HEX);
  }
  Serial.println();

  // **Nur Karten aus der Liste werden akzeptiert**
  if (is_allowed_card(rfid.uid.uidByte)) {
    Serial.println("✅ Zugang gewährt!");
    counter = 0; // Fehlversuche zurücksetzen
  } else {
    Serial.println("❌ Zugang verweigert!");
    counter++;
  }

  Serial.println();
  delay(2000);
}

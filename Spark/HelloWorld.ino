//Blink on and off 5 times then stop for 3 seconds
//Each blink should be 0.5s


int ledPin = D0;

void setup() {
  pinMode(ledPin, OUTPUT);
}

void loop() {

  for (int x = 0; x < 5; x++) {

    digitalWrite(ledPin, HIGH);
    delay(500);

    digitalWrite(ledPin, LOW);
    delay(500);
  }

  delay(3000);

}

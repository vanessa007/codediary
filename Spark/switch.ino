int ledPin = D1;
int switchPin = D0;

void setup() {
  pinMode (switchPin, INPUT_PULLUP);
  pinMode (ledPin, OUTPUT);
}

void loop() {
  int buttonState = digitalRead (switchPin);
  if (buttonState == LOW) {
    digitalWrite(ledPin, HIGH);
  } else {
    digitalWrite(ledPin, LOW);
  }
}

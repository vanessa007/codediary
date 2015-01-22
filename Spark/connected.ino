int ledPin = D0;

void setup() {
  Spark.function("led", ledControl);
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, LOW);
}

void loop() {
}

int ledControl(String command) {
  int state = LOW;

  if(command == "HIGH") state = HIGH;
  else if(command == "LOW") state = LOW;
  else return -1;

  digitalWrite(ledPin, state);
  return 1;
}

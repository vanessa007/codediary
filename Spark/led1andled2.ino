//Program the LED’s to alternate blinks
//i.e. when LED 1 turns on, LED 2 turns off, then when LED 2 turns on, LED 1 turns off

int ledPin1 = D0;
int ledPin2 = D1;

void setup() {
  pinMode(ledPin1, OUTPUT);
  pinMode(ledPin2, OUTPUT);
}

void loop(){

  digitalWrite(ledPin1, HIGH);
  digitalWrite(ledPin2, LOW);
  delay(1000);

  digitalWrite(ledPin1, LOW);
  digitalWrite(ledPin2, HIGH);
  delay(1000);
}


int redPin = A0;
int greenPin = D0;
int bluePin = D1;
int redValue = 255;
int greenValue = 255;
int blueValue = 255;

void setup() {
  pinMode(redPin, OUTPUT);
  pinMode(greenPin, OUTPUT);
  pinMode(bluePin, OUTPUT);

  Spark.function("led", ledControl);

  analogWrite(redPin, redValue);
  analogWrite(greenPin, greenValue);
  analogWrite(bluePin, blueValue);
}

void loop() {
}

int ledControl (String command) {
  String colors[3];
  colors[0]="";
  colors[1]="";
  colors[2]="";

  int index = 0;
  for (int i = 0; i < command.length(); i++) {
    if (index < 3) {
      char c = command.charAt(i);
      colors[index] += c;

      if (c==',') index++;
    }
  }

  redValue = colors[0].toInt();
  greenValue = colors[1].toInt();
  blueValue = colors[2].toInt();

  analogWrite(redPin, redValue);
  analogWrite(greenPin, greenValue);
  analogWrite(bluePin, blueValue);

  return 1;
}

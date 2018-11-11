void setup() {
  size(300, 300);
}


void draw() {
  noFill();
  for(int i=150; i>15; i-=15) {
  ellipse(100, 150, i, i);
  }
  for(int i=150; i>15; i-=15) {
  ellipse(200, 150, i, i);
  }
}
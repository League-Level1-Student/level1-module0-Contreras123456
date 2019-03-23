void setup(){
 size(600,600);
 background(26,255,42);
}
void draw(){
  makeMagical();
  for(int i = 0; i<1000;i++){
      fill(i,frameCount,i);
    ellipse(getWormX(i),getWormY(i),10,10);
  }
}
float frequency = .001;
float noiseInterval = 5;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
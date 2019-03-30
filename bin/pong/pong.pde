PImage backgroundImage;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
int elmo = 3;
int nani = 100;
int speed = 3;
int ball = 50;
void setup(){
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  size(600,600);
//  background(3,244,455);
  backgroundImage = loadImage("image.jpg");
}
void draw(){
//  background(3,244,255);
  image(backgroundImage, 0,0);
  image(backgroundImage,0,0,600,600);
  fill(255,255,255);
  stroke(255,255,255);
  ellipse(ball,nani,50,50);
  rect(mouseX,575,200,50);
  ball+=speed;
  nani+=elmo;
  if (ball>=575 || ball<=25)
    speed*=-1;
  if(nani>=575 || nani<= 25)
    elmo*=-1;
  if(nani>=575)
    sound.trigger();
  if(intersects(ball, nani + 25, mouseX, 575, 200))
    elmo*=-1;
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
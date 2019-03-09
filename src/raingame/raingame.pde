int raindrop = 50;
int randomNumber;
int score = 1;
void setup(){
size(600,600);
}
void draw(){
 background(20,0,255);
  fill(0,255,219);
  stroke(0,255,219);
  ellipse(randomNumber,raindrop,50,100);
  rect(mouseX,500,100,100);
  raindrop+=5;
  if(raindrop>600){
    raindrop=50;
  
randomNumber = (int) random(width);

  }
checkCatch(randomNumber);
 
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
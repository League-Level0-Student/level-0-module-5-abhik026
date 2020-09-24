int x = 250;
int x1 = 750;
int a = 1;
int b = -1;
void setup() {
  size(1000,500);
}

void draw() {
 background(#FFFFFF);
  for(int i = 400; i>10; i-=30){
     noFill();
    ellipse(x,250,i,i);
  }
  for(int i = 400; i>10; i-=30){
     noFill();
    ellipse(x1,250,i,i);
  }
   for(int j =0; j<2;j++){
     if(x>800){
     a = -a;
     b =-b;
    }
    else if(x<200){
     a = -a;
     b = -b;
  }
  
  x+= a;
  x1+= b; 
 }  
   // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}

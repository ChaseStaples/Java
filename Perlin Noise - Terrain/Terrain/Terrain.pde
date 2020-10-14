int columns, rows;
int scale = 20;

void setup(){
    size(600,600, P3D);
    int width = 600;
    int height = 600;
    columns = width/scale;
    rows = height/scale;
    
}

void draw(){
  background(0);
  
  for(int i = 0; i < columns; i++){
      for(int j = 0; j < rows; j++){
        stroke(255);
        noFill();
        rect(i*scale, j*scale, scale, scale);
      }
  }
}

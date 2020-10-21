//Global variables
int columns, rows;
int scale = 20;
int w = 3500;
int h = 1500;

float flying = 0;

float[][] terrain;
   
//Drawing window
void setup(){
    size(600, 600, P3D);
    columns = w / scale;
    rows = h / scale;
    terrain = new float[columns][rows];
}

//Drawing Terrain
void draw(){
  
    flying -= 0.1; //Giving that flying over experience
  
    float iOffset = flying;
    for(int i = 0; i < rows; i++){
      float jOffset = 0;
      for(int j = 0; j < columns; j++){
        terrain[j][i] = map(noise(jOffset,iOffset), 0, 1, -100, 100);  //Using perlin noise
        jOffset += 0.15; //Adjust Heights
      }
      iOffset += 0.3; //Adjust widths
    }
  
  background(0);
  stroke(150,255,150);
  noFill();
  
  //Centering grid
  translate(width/2, height/2-250);
  rotateX(PI/3);
  translate(-w/2, -h/2);
  
  //Drawing triangles
  for(int i = 0; i < rows - 1; i++){
      beginShape(TRIANGLE_STRIP);
      for(int j = 0; j < columns; j++){
        vertex(j * scale, i * scale, terrain[j][i]);
        vertex(j * scale, (i + 1) * scale, terrain[j][i + 1]);
      }
      endShape();
  }
}

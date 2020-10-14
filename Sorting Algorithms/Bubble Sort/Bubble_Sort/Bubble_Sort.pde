float[] values;
int i = 0;
int j = 0;

void setup(){
  size(1500, 1000);
  values = new float[width];
  for (int i = 0; i < values.length; i++){
      values[i] = noise(i/100.0) * height;
  }
}

void draw(){
  background(0);
  
  if(i < values.length){
      for (int j = 0; j < values.length-i-1; j++){
           
           float x = values[j]; //First Value
           stroke(0,255,0);
           float y = values[j + 1]; //Second Value
           if (x > y){
               swap(values, j, j + 1); //Swap values
           }
      }
  }
  else{
      println("Finished"); 
      noLoop();
  }
  
  i++;

  for(int i = 0; i < values.length; i++){
      stroke(255,0,0);
      line(i, height, i, height - values[i]);
  }
}

void swap(float[] arr, int x, int y){
  float tempValue = arr[x];
  arr[x] = arr[y];
  arr[y] = tempValue;
}

float[] values;
int i = 0;
int j = 0;

void setup(){
  size(1000, 1000);
  values = new float[width];
  for (int i = 0; i < values.length; i++){
      values[i] = random(height);
  }
}

void draw(){
  background(0);
  
  if(i < values.length){
      for (int j = 0; j < values.length-i-1; j++){
           
           float x = values[j]; //First Value
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
      stroke(255);
      line(i, height, i, height - values[i]);
  }
}

void swap(float[] arr, int x, int y){
  float tempValue = arr[x];
  arr[x] = arr[y];
  arr[y] = tempValue;
}

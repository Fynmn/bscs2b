class Activity6 { 
 
  public static void main(String args[]){
    int array[] = new int[]{10, 1, 5, 2, 3, 9};
 
    
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
   
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
 

  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
 
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}

import java.util.Random;

public class BubbleSort{
  public static void main (String... args){
    int size = 10;
    int[] array = new int[size];

    // create an array of integers
    createIntArray(array);
    // print the array before Sorting
    printArray(array);
    // sort the array descending order
    bubbleSortArray(array, size);
    // print the array agian
    printArray(array);

  }// end of main

// create an array of inetegers
  public static void createIntArray(int[]array){
    Random rng = new Random();
    for (int i = 0; i < array.length; i++){
      array[i] = rng.nextInt(10);
    }
  }
// print the array
  public static void printArray(int[]array){
    for (int i = 0; i < array.length; i++){
      System.out.println("Array element is: " + array[i]);
    }
    System.out.println("-------------------");
  }
// bubble sort code to sort array
  public static void bubbleSortArray(int[] array, int n){
    if (n == 1)
      return;
    else{
      for (int i = 0; i < n-1; i++){
        if(array[i] > array[i+1]){
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
        }
      }
      bubbleSortArray(array, n - 1);
    }
  }

}

import java.util.Random;
public class SelectionSorter {
  public static void main(String[] args) {
    int[] numbers = makeRandomArray(10);
    System.out.println("Before sorting: ");
    printArray(numbers);
    selectionSort(numbers);
    System.out.println("\nAfter sorting: ");
    printArray(numbers);
  }

  private static int[] makeRandomArray(int size) {
    Random rng = new Random();
    int[] numbers = new int[size];
    for (int i=0; i<size; i++) {
      numbers[i] = rng.nextInt(10);
    }
    return numbers;
  }

  private static void printArray(int[] numbers) {
    for(int n: numbers) {
      System.out.print(n);
    }
  }


  public static void selectionSort(int[] numbers) {
    selectionSortHelper(numbers, 0, numbers.length);
  }

  private static void selectionSortHelper(int[] numbers, int beginIndex, int lengthOfSubarray) {
    // base case: when subarray is of  length 0
    if (lengthOfSubarray == 0) return;

    // subproblem 1: select the minimum for the array, and swap it with the one at beginIndex
    int minIndex = findMinimum(numbers, beginIndex, lengthOfSubarray);
    swap(numbers, beginIndex, minIndex);
    // subproblem 1: sort the subarray starting at beginIndex + 1
    selectionSortHelper(numbers, beginIndex + 1, lengthOfSubarray - 1);
  }

  private static int findMinimum(int[] numbers, int beginIndex, int lengthOfSubarray) {
    int minIndex = beginIndex;
    int minValue = numbers[minIndex];

    for (int i = beginIndex + 1; i < beginIndex + lengthOfSubarray; i ++) {
        if (numbers[i] < minValue) {
          minIndex = i;
          minValue = numbers[i];
        }
    }
    // return the index of the minimum numbers in the array
    return minIndex;
  }


  private static void swap(int[] numbers, int beginIndex, int minIndex) {
    int tmp;
    tmp = numbers[beginIndex];
    numbers[beginIndex] = numbers[minIndex];
    numbers[minIndex] = tmp;
  }
}

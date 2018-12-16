/**
 * The sample program from Chapter 13 in
 *   Liang Y Daniel, Introduction to Java Programming, 11st Edition
 * which is revised to use the Bubble sort
 */
public class BubbleSortingArrays {
  public static void main(String[] args) throws Exception {
    // Create an Integer array
    Integer[] intArray = {
      Integer.valueOf(8), Integer.valueOf(4), Integer.valueOf(3),
    Integer.valueOf(7), Integer.valueOf(9),Integer.valueOf(5)};

    // // Create a Double array
    // Double[] doubleArray = {
    //   Double.valueOf(3.4), Double.valueOf(1.3), Double.valueOf(-22.1)
    // };
    //
    // // Create a Character array
    // Character[] charArray = {
    //   Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r')
    // };
    //
    // // Create a String array
    // String[] stringArray = {"Tom", "John", "Fred"};

    // Sort the arrays
    printList(intArray, 0, intArray.length);
    sort(intArray);
    printList(intArray, 0, intArray.length);
//    sort(doubleArray);
//    sort(charArray);
//    sort(stringArray);

    // Display the sorted arrays
    // System.out.print("Sorted Integer objects: ");
    // printList(intArray);
    // System.out.print("Sorted Double objects: ");
    // printList(doubleArray);
    // System.out.print("Sorted Character objects: ");
    // printList(charArray);
    // System.out.print("Sorted String objects: ");
    // printList(stringArray);
  }

  /** Sort an array of comparable objects using the Bubble sort algorithm */
  // public static void sort(Comparable[] list) {
  //   Comparable currentMin;
  //   int currentMinIndex;
  //
  //   // select subarray (the range of the array) where we bubble up the greatest in the subarray
  //   for (int i = 0; i < list.length - 1; i++) {
  //     // bubble up the greast in the subarray (in the range of the array)
  //     for (int j=0; j <list.length - i - 1; j++) {
  //       if (list[j].compareTo(list[j+1]) > 0) {
  //         Comparable tmp = list[j];
  //         list[j] = list[j+1];
  //         list[j+1] = tmp;
  //       }
  //     }
  //   }
  // }
  //
  public static void sort(Comparable[] list){
    sort(list, 0, list.length - 1);
  }
  public static void sort(Comparable[]list, int lhs, int rhs){
    // print out input array
    //printList(list);

    // subproblem 1 write in a method
  //  doSelection();
    // print out array

    // subproblem
  //  sort();


    if(lhs < rhs){
      int indexOfMin = lhs;
      Comparable min = list[lhs];

      for (int i = lhs; i <= rhs; i++){
        System.out.print(list[i] + " ");
      }
      System.out.println();
      for (int i = lhs; i <= rhs; i++){
          if(list[i].compareTo(min) < 0 ){
            min = list[i];
            indexOfMin = i;
          }
      }
      list[indexOfMin] = list[lhs];
      list[lhs] = min;
      printList(list,lhs,rhs);
      sort(list, lhs + 1, rhs);
    }
  }

  /** Print an array of objects */
  public static void printList(Object[] list, int lhs, int rhs) {
    
    for (int i = lhs; i < rhs; i++)
      System.out.print(list[i] + " ");
    System.out.println("\n");
  }

}

public class RecursiveSelectionSort{

  public static void sort(double[] list){
    sort(list, 0, list.length - 1);
  }

  private static void sort(double[] list, int lhs, int rhs){
    if(lhs < rhs){
      int indexOfMin = lhs;
      double min = list[lhs];
      for (int i = 0; i <= rhs; i++){
          if(list[i] < min){
            min = list[i];
            indexOfMin = i;
          }
      }
      list[indexOfMin] = list[lhs];
      list[lhs] = min;

      sort(list, lhs + 1, rhs);
    }
  }

}// end of class

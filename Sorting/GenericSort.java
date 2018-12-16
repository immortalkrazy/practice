public class GenericSort{
  public static void main (String[]args){

    Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};
    Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};
    Character[] charArray = {new Character('a'), new Character('r'), new Character('j')};
    String[] stringArray = {"Tom", "Susan", "Kim"};

    print(intArray);
    sort(intArray);
    print(intArray);

    print(doubleArray);
    sort(doubleArray);
    print(doubleArray);

    print(charArray);
    sort(charArray);
    print(charArray);

    print(stringArray);
    sort(stringArray);
    print(stringArray);

  }// end of main

  public static <E extends Comparable<E>> void sort(E[] list){
    E currentMin;
    int currentMinIndex;

    for (int i = 0; i < list.length-1; i++){
      currentMin = list[i];
      currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++){
        if (currentMin.compareTo(list[j]) > 0){
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      if (currentMinIndex != i){
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }

  public static void print(Object[] list){
    for(int i = 0; i < list.length; i++){
      System.out.print(list[i] + " ");
    }
    System.out.println();
  }

}

import java.util.ArrayList;
import java.util.Collections;

public class SortObjects{
  public static void main(String[]args){
    ArrayList<Object> listObject = new ArrayList<>();

      ComparableCircle circle1 = new ComparableCircle(5);
      ComparableCircle circle2 = new ComparableCircle(4);
      ComparableCircle circle3 = new ComparableCircle(7);
      ComparableCircle circle4 = new ComparableCircle(9);
      listObject.add(circle1);
      listObject.add(circle2);
      listObject.add(circle3);
      listObject.add(circle4);

    System.out.println("Before Sorting");
    printList(listObject);
    //
    //Collections.sort(listObject);
    //
    // System.out.println("After Sorting");
    // printList(listCircles);
  }// end of main
  public static void printList(ArrayList <GeometricObject> listObject){
    for (int i = 0; i < listObject.size(); i++){
      System.out.println(listObject.get(i)+ " ");
    }
  }// end of printList

}// end of class

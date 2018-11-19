import java.util.*;


public class Sort {
  public static void main(String[]args){
    ArrayList<GeometricObject> objects = new ArrayList<>(Arrays.asList(
                                         new ComparableCircle(5),
                                         new ComparableCircle(4),
                                         new ComparableCircle(7),
                                         new ComparableCircle(9),
                                         new ComparableRectangle(3.4, 5.4),
                                         new ComparableRectangle(13.24, 55.4),
                                         new ComparableRectangle(7.4, 35.4),
                                         new ComparableRectangle(1.4, 25.4)));

    Collections.sort(objects , new Comparator<GeometricObject>()
    {
      public int compare(GeometricObject o1, GeometricObject o2){
        return Double.compare(o1.getArea(), s2.getArea());
      }
    });

    System.out.println("Before Sorting");
    printList(listObject);
    //
    Collections.sort(listObject);
    //
    // System.out.println("After Sorting");
    // printList(listCircles);
  }// end of main
  public static void printList(ArrayList <Comparable> listObject){
    for (int i = 0; i < listObject.size(); i++){
      System.out.println(listObject.get(i)+ " ");
    }
  }// end of printList

}// end of class

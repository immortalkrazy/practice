public class SortRectangles{
  public static void main(String[]args){

    ComparableRectangle [] rectangles = {
        new ComparableRectangle(3.5, 5.0),
        new ComparableRectangle(2.0, 3.4),
        new ComparableRectangle(3.6, 6.2),
        new ComparableRectangle(2.0, 6.0),
        new ComparableRectangle(8.0, 1.5),
    };

    java.util.Arrays.sort(rectangles);

    for (int i = 0; i < rectangles.length; i++){
      System.out.println(rectangles[i]);
    }

  }
}

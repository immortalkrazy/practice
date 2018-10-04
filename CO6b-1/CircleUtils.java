package p1;
public class CircleUtils {


  public static void printCircle(Circle c) {
    System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
  }



  public static void printCircle(Circle circle, int times) {
    Circle c = new Circle(circle);
    System.out.println("Radius \t\t Area");
    for (int i = 0; i < times; i ++) {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
    }
  }
}

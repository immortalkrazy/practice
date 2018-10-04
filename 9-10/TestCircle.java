public class TestCircle {
  public static void main (String[]args){
    Circle c1 = new Circle();

    System.out.println(c1.getArea());
    System.out.println(c1.getRadius());

    Circle c2 = new Circle(5.0);
    System.out.println(c2.getArea());
    System.out.println(c2.getRadius());

    System.out.println("Number of circles created are:  "
      + Circle.getNumberOfObjects());
  }
}

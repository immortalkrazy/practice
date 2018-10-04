public class TestPassingObjects {
  public static void main(String[]args){
    Circle myCircle = new Circle(5.0);
    printCircle(myCircle);
  }

  public static void printCircle(Circle c){
    System.out.println("area of the circle of radius  " +
      c.getRadius() + " is " + c.getArea());
  }
}

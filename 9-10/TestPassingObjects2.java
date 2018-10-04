public class TestPassingObjects2 {
  public static void main (String[]args) {
    Circle myCircle = new Circle(1);
    // Print areas for the radius 1,2,3,4,5
    int n = 5;
    printAreas(myCircle, n);
  }
  public static void printAreas (Circle c, int times){
    System.out.println("Radius \t\t Area");
    while (times >= 1){
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
      times--;
    }
  }
}

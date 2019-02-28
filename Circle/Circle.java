public class Circle {


  private final double PI = 3.14159;
  private double radius;

  public Circle() {

  }
  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * PI;
  }
}

public class Circle {
  private double radius;
  private static int numberOfObjects = 0;
  Circle(){
    radius = 1;
    numberOfObjects++;
  }
  Circle (double myRadius){
    radius = myRadius;
    numberOfObjects++;
  }
  public void setRadius(double myRadius){
    radius = myRadius;
  }
  public double getRadius(){
    return radius;
  }
  public double getArea(){
    return radius * radius * Math.PI;
  }
  public double getParameter(){
    return 2 * radius * Math.PI;
  }
  public static int getNumberOfObjects(){
    return numberOfObjects;
  }
}

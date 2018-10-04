public class Circle {

  /* the radius of the circle*/
  private double radius;

  /*The number of objects created*/
  private static int numberOfObjects = 0;

  /*Construct a circle with radius 1*/
  public Circle(){
    numberOfObjects++;
  }

  /*Construct a circle with specified radius*/
  public Circle(double newRadius){
    radius = newRadius;
    numberOfObjects++;
  }

  /*get number of Objects*/
  public static int getNumberOfObjects(){
    return numberOfObjects;
  }

  /*Resturn radius*/
  public double getRadius(){
    return radius;
  }

  /*Set radius of the circle*/
  public void setRadius(double newRadius){
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  /*return area of the circle*/

  public double getArea(){
    return radius * radius * Math.PI;
  }
}

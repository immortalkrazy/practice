public class TestCircleWithPrivateDataFields {
  /*Main Method*/
  public static void main (String[]args){
    /*Creat a circle with radius 5.0*/
    Circle myCircle = new Circle(5.0);
    System.out.println("Area of the circle of radius " +
      myCircle.getRadius() + " is " + myCircle.getArea());

    /* Increase myCircle's radius by 10 % */
    myCircle.setRadius(myCircle.getRadius() * 1.1);
    System.out.println("Area of the circle of radius " +
      myCircle.getRadius() + " is " + myCircle.getArea());

    System.out.println("Number of Objects created is " +
      Circle.getNumberOfObjects());
  }
}

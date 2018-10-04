public class TestCircleWithPrivateDataFields {

  /*main method*/
  public static void main (String[] args){

    /*Creat a circle with radius 5*/
    Circle myCircle = new Circle(5.0);
    System.out.println("The are of the circle of radius "
      + myCircle.getRadius() + " is " + myCircle.getArea());

    /*Increase the radius of myCircle by 10% */
    myCircle.setRadius(myCircle.getRadius() * 1.1 );
    System.out.println("The are of the circle of radius "
      + myCircle.getRadius() + " is " + myCircle.getArea());

    /*Print the numberOfObjects created*/
    System.out.println("The number of objects created is: "
      + Circle.getNumberOfObjects());
  }
}

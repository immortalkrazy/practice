public class TestCircle{
  /** main method */
  public static void main(String[]args){

    /** create a circle with radius 1*/
    Circle c1 = new Circle();
    System.out.println("The area of the circle of radius "
      + c1.radius + " is " + c1.getArea());
      System.out.println("The Perimeter of the circle of radius "
        + c1.radius + " is " + c1.getPerimeter());

    // Creat a Circle with radius 25
    Circle c2 = new Circle(25);
    System.out.println("The area of the circle of radius "
      + c2.radius + " is " + c2.getArea());
    System.out.println("The Perimeter of the circle of radius "
        + c2.radius + " is " + c2.getPerimeter());

    // Creat a circle with radius 125
    Circle c3 = new Circle(125);
    System.out.println("The area of the circle of radius "
      + c3.radius + " is " + c3.getArea());

    //Modify newRadius
    c2.setRadius(100);
    System.out.println("The area of the circle of radius "
      + c2.radius + " is " + c2.getArea());


  }
}
// Define the Circle class with 2 constructors
class Circle {
  double radius;

  /** no-argument constructor */
  Circle() {
    radius = 1;
  }

  /** contructor with argument */
  Circle(double newRadius){
    radius = newRadius;
  }

  double getArea(){
    return radius * radius * Math.PI;
  }
  double getPerimeter(){
    return 2 * radius * Math.PI;
  }
  void setRadius(double newRadius){
    radius = newRadius;
  }
}

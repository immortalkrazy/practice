public class TestCircleWithStaticMembers{
  /*main method*/
  public static void main (String[]args){
    System.out.println("Before Creating Objects");
    System.out.println("The Number of the circle objects is:  "
      + Circle.getNumberOfObjects());
    /*Instantiate an obejts with default constructor*/
    Circle c1 = new Circle();
    System.out.println("The area of the Circle of radius: "
      + c1.radius + " is " + c1.getArea());
    /*Number of circles after creating c1*/
    System.out.println("Number of circles after creating c1:  "
      + Circle.getNumberOfObjects());
  }
}

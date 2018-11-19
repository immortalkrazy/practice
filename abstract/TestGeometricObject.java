public class TestGeometricObject{
  public static void main(String [] args){

    GeometricObject circle1 = new Circle(2);
    Circle circle2 = new Circle(3);
    System.out.println(circle1.toString());
    System.out.println(circle1.getArea());
    if (circle1 instanceof Circle){
      ((Circle)circle1).printCircle();
    }
    circle2.printCircle();

    GeometricObject rectangle = new Rectangle(2,3);

    System.out.println("Two object have the same area? " + isEqual(circle1, rectangle));

  }// end of main
  public static boolean isEqual(GeometricObject obj1, GeometricObject obj2){
    if (obj1.getArea() == obj2.getArea())
    return true;
    else
    return false;
  }


}// end of class

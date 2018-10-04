public class ShapeClient {
  /** Main method */
  public static void main(String[] args) {
    GeometricObject object;
    object = new Circle(100, "red", true);
    System.out.println("Created on "
    	+ object.getDateCreated()
    	+ ". Color is " + object.getColor());

    object = new Rectangle(100, 100, "blue", true);
    System.out.println("Created on "
    	+ object.getDateCreated()
    	+ ". Color is " + object.getColor());

  }
}

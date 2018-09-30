/**
 * From Chapter 11 in Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */
import java.util.Date;
public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius,
      String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /** Get dateCreated */
  public Date getDateCreated() {
    System.out.println("Executing getDateCreated() defined in the Circle class.");
    return dateCreated;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created (using the superclass's method) " + super.getDateCreated() +
      " and the radius is " + radius);
    System.out.println("The circle is created (using the this class's method) " + getDateCreated() +
      " and the radius is " + radius);
  }
}

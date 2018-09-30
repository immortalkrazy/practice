public class Circle{
  private double radius = 3;

  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }
  public String toString() {
    return "radius: " + this.radius
    + "area:  " + this.getArea();
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  public double getRadius(){
    return  radius;
  }
}

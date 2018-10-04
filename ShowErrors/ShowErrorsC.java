class Circle{
  int radius = 1;
  Circle(){

  }
  int getRadius(){
  return radius;
  }
}
public class ShowErrorsC{
  public void method1(){
    Circle c;
    c = new Circle();
    System.out.println("What is the radius: "
      + c.getRadius());
  }
}

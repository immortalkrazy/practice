public class C {
    public static void main (String[]args){
    method1();
  }

  public void method1(){
    method2();
  }

  public static void method2(){
    System.out.println("What is the radius: " + c.getRadius());
  }

  Circle c = new Circle();
}

import java.util.Scanner;
public class TestICalculator{
  public static void main(String[]args){

    ICalculator c = new ICalculator();
    ICalculator2 c2 = new ICalculator2();
    Scanner input = new Scanner(System.in);
    System.out.println("  ");
    int num1 = 6;
    int num2 = 10;
    int num3 = 25;
    int num4 = 40;
    c.setCurrentValue(-20);
    System.out.println(" add: " + c.add(num2));
    if (c instanceof ICalculator){
        System.out.println(" negate: " + ((ICalculator)c).negate());
    }


  }


}

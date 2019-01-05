import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZero {

  private double numerator;
  private double denominator;
  private double quotient;

  public static void main(String...args){

      DivideByZero oneTime = new DivideByZero();
      oneTime.doIt();

  }

  private void doIt(){

    try{
      System.out.println("Enter Numerator: ");
      Scanner sc = new Scanner(System.in);
      numerator = sc.nextDouble();
      System.out.println("Enter Denominator");
      denominator = sc.nextDouble();

      if(denominator == 0){
        throw new DivideByZeroException();
      }

      quotient = numerator / denominator;
      System.out.println(numerator + "/" + denominator + " = " + quotient);
    }
    catch(DivideByZeroException ex){
      System.out.println(ex.getMessage());
      giveSecondChance();
    }
    catch(InputMismatchException ex){
      System.out.println("Only Numbers are allowed!");
      giveSecondChance();
    }
    System.out.println();
    System.out.println("End of program.");
  }

  private  void giveSecondChance(){
    try{
      System.out.println("Enter Numerator: ");
      Scanner sc = new Scanner(System.in);
      numerator = sc.nextDouble();
      System.out.println("Enter Denominator");
      denominator = sc.nextDouble();

      if(denominator == 0){
        throw new DivideByZeroException();
      }

      quotient = numerator / denominator;
      System.out.println(numerator + "/" + denominator + " = " + quotient);
    }catch(DivideByZeroException ex){
      System.out.println(ex.getMessage());
      giveThirdChance();
    }
  }

  private  void giveThirdChance(){

    System.out.println("Enter Numerator: ");
    Scanner sc = new Scanner(System.in);
    numerator = sc.nextDouble();
    System.out.println("Enter Denominator");
    denominator = sc.nextDouble();

    if(denominator == 0){
      System.out.println("SORRY divide by Zero is not allowed!");
      System.exit(0);
    }

    quotient = numerator / denominator;
    System.out.println(numerator + "/" + denominator + " = " + quotient);

  }

}

import java.util.Scanner;
import java.util.InputMismatchException;
public class ComputeFactorial{
  public static void main(String[]args){
    try(Scanner sc = new Scanner(System.in)){
      System.out.println("Please enter a non-negative number:  ");
      int num = sc.nextInt();
      System.out.println("please eneter the message:  ");
      String message = sc.next();
      System.out.println("How many times:  ");
      int times = sc.nextInt();
      System.out.println("Factorial of " +num+ " is "+computeFactorial(num));
      System.out.println("\nYour message\n");
      printMsg(message, times);

    }catch(InputMismatchException e){
      System.out.println(e.toString());
    }
  }// end of main

  public static long computeFactorial(int num){
    if(num == 0){
      return 1;
    }
    else{
      return num * computeFactorial(num - 1);
    }
  }
  public static void printMsg(String message, int times){
    if (times >= 1){
      System.out.println("message");
      printMsg(message, times -1);
    }
  }

}//end of calss

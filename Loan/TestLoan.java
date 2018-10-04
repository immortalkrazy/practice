import java.util.Scanner;

public class TestLoan {

  /*main method*/
  public static void main (String[]args){

    /*Create a scanner*/
    Scanner input = new Scanner(System.in);

    /*get the user information*/
    System.out.print("Eneter annual interest rate plaese: " );
    double annualInterestRate = input.nextDouble();

    System.out.print("Eneter number of years plaese: " );
    int numberOfYears = input.nextInt();

    System.out.print("Eneter loan amount plaese: " );
    double loanAmount = input.nextDouble();

    /*Create a loan object*/
    Loan loan =
      new Loan(annualInterestRate, numberOfYears, loanAmount);

    /*display the loan*/
    System.out.println("           Date: " + loan.getLoanDate());
    System.out.println("Monthly payment: " + loan.getMonthlyPayment());
    System.out.println(" Toatal payment: " + loan.getTotalPayment());
  }
}

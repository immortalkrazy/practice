import java.util.Scanner;

public class TestLoanTryCatch {

    /*main method*/
    public static void main (String[]args){
        boolean done = false;
        do {
            try{
                /*Create a scanner*/
                Scanner input = new Scanner(System.in);

                /*get the user information*/
                System.out.printf("%-40s", "Enter annual interest rate plaese: " );
                double annualInterestRate = input.nextDouble();

                System.out.printf("%-40s", "Enter number of years plaese: " );
                int numberOfYears = input.nextInt();

                System.out.printf("%-40s", "Enter loan amount plaese: " );
                double loanAmount = input.nextDouble();

                /*Create a loan object*/
                Loan loan =
                new Loan(annualInterestRate, numberOfYears, loanAmount);

                /*display the loan*/
                System.out.println("           Date: " + loan.getLoanDate());
                System.out.println("Monthly payment: " + loan.getMonthlyPayment());
                System.out.println(" Toatal payment: " + loan.getTotalPayment());
                done = true;
            }
            catch(Exception e){
                System.out.println("\nYou Entry is not Correct");
            }
            finally{
                System.out.println("\nWeldone faisal\n");
            }
        } while (done != true);
    }
}

import java.util.Scanner;
public class FederalIncomeTaxClient {

  public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your status: \n" +
              "            Single Press 1: \n" +
              "   Married Jointly Press 2: \n" +
              "Married Seperately Press 3: \n" +
              " Head of Household Press 4:   ");
    int status = input.nextInt();

    System.out.print("  Please enter your income:   ");
    double income = input.nextDouble();

    FederalIncomeTax tax = new FederalIncomeTax(status, income);

    System.out.println("You entered Status:   " + tax.getStatus());
    System.out.println("You entered income:   " + tax.getIncome());
    System.out.println("As of:(Today's Date)  " + tax.getDate());
    System.out.println("Calculated Tax is:    " + tax.getTaxAmount());
  }
}

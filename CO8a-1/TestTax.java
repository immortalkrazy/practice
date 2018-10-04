import java.util.Scanner;
public class TestTax {

  public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your status: ");
    int status = input.nextInt();

    System.out.print("Please enter your income: ");
    double income = input.nextDouble();

    FederalIncomeTax tax = new FederalIncomeTax(status, income);

    System.out.println(tax.getStatus());
    System.out.println(tax.getIncome());
    System.out.println(tax.getDate());
    System.out.println(tax.getTaxAmount());



  }
}

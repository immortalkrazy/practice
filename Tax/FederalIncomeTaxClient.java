import java.util.Scanner;
 class FederallncomeTaxClient{
public static void main(String[] args) {
    //ate a Scanner
  Scanner input = new Scanner(System.in);


  // Prompt the user to enter filing status
  System.out.print(" enter 0 if you are a single filer");
  System.out.print(" enter 1 if you are filling married jointly");
  System.out.print(" enter 2 if you are a filling married separetely");
  System.out.print(" enter 3 if you are the head of the household");

  int status = input.nextInt();

  // Prompt the user to enter taxable income
  System.out.print("Enter the taxable income that you earned: ");

  double income = input.nextDouble();

      FederallncomeTax t1=new FederallncomeTax(status, income);
}
}

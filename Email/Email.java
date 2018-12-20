import java.util.Scanner;
import java.util.InputMismatchException;

public class Email {

  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private int mailboxCapacity;
  private String alternateEmail;

  public Email(){
    this.firstName = setFirstName();
    this.lastName = setLastName();
    this.department = setDepartment();

  }

  private String setFirstName(){
    System.out.println("Please Enter your First Name: ");
    try(Scanner kb = new Scanner(System.in)){
      String firstName = kb.next();
    }catch(InputMismatchException ex){
      System.out.println("Please enter the name");
    }
    return firstName;
  }
  private String setLastName(){
    System.out.println("Please Enter your LastName: ");
    try(Scanner kb = new Scanner(System.in)){
      String lastName = kb.next();
    }catch(InputMismatchException ex){
      System.out.println("Please enter the name");
    }
    return lastName;
  }

  private String setDepartment(){
    System.out.println("Please Enter your Department: \n1 for Sales: \n2 for Development: \n3 for Accounting: ");

      Scanner kb = new Scanner(System.in);
      int departmentChoice = kb.nextInt();
      if (departmentChoice == 1)
        return "sal";
      else if(departmentChoice == 2)
        return "dev";
      else if (departmentChoice == 3)
        return "acc";
      else
        return "";

  }



}

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Email {

  private ArrayList<Email> emailList = new ArrayList<Email>();

  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int defaultPasswordLength = 16;
  private int mailboxCapacity = 500;
  private String alternateEmail;
  private String companySuffix = "company.com";

  public Email(){

    this.firstName = setFirstName();
    this.lastName = setLastName();
    this.department = setDepartment();
    this.password = setPassword(defaultPasswordLength);
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@" +
            department + "." + companySuffix;
    System.out.println("Your email is: " + email);
    System.out.println("and  Password: " + this.password);

  }

  private String setFirstName(){
    System.out.println("Please Enter your First Name: ");
    Scanner kb = new Scanner(System.in);
    String firstName = kb.next();

    return firstName;
  }

  private String setLastName(){
    System.out.println("Please Enter your LastName: ");
    Scanner kb = new Scanner(System.in);
    String lastName = kb.next();

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

  private String setPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
    char[] password = new char[length];
    for (int i = 0; i < length; i++){
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }

  public void setMailboxCapacity(int capacity){
    this.mailboxCapacity = capacity;
  }

  public void setAlternateEmail(String altEmail){
    this.alternateEmail = altEmail;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public int getMailboxCapacity(){
    return mailboxCapacity;
  }

  public String getAlternateEmail(){
      return alternateEmail;
  }

  public String getPassword(){
    return password;
  }

}

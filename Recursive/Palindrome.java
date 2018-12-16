import java.util.Scanner;

public class Palindrome{

  public static boolean isPalindrome(String s){

    return isPalindrome(s, 0, s.length() - 1);
    // if (s.length() <= 1)
    //   return true;
    // else if (s.charAt(0) != s.charAt(s.length() - 1))
    //   return false;
    // else
    //   return isPalindrome(s.substring(1, s.length() - 1));
  }

  public static boolean isPalindrome(String s, int lhs, int rhs){
    if (lhs <= rhs)
      return true; //base case
    else if (s.charAt(0) != s.charAt(s.length() - 1))
      return false;
    else
      return isPalindrome(s, lhs + 1, rhs - 1);
  }

  public static void main(String[]args){

    try(Scanner sc = new Scanner(System.in)){

      System.out.println("Please enter the string you want to test: ");
      String inputS = sc.next();

      System.out.println("Is "+inputS + " a palindrome? " + isPalindrome(inputS));

    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }

}

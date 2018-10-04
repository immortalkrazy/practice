import java.util.Scanner;
class Break{
  public static void main (String[]args){
    Scanner input = new Scanner (System.in);
    while (true){
      System.out.println("Enter a number: ");
      if (input.hasNextDouble()){
        break;
      }
      String word = input.next();
      System.err.println (word + " is not a number");
    }
    double x = input.nextDouble();
  }
}

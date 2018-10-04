import java.util.Scanner;
public class TriangleClientUserInput {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Please Enter the three sides: ");
    double sideOne = input.nextDouble();
    double sideTwo = input.nextDouble();
    double sideThree = input.nextDouble();

    System.out.println("Please enter the color: ");
    String colorU = input.next();

    System.out.println("Is it filled with color?:  enter Y/N");
    String fill = input.next();


  }


}

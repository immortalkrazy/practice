import java.util.Scanner;
public class TotalArea{
  public static void main(String[]args){
    // Declare Circle array
//    Circle[] circleArray;
    // Creat Circle array
//    circleArray = creatCircleArray();
    // print circle array
//    printCircleArray(circleArray);
    populateArray();

//    printCircleArray(circleArrayC);

  }
  // Creat populate area method by USER
  public static void populateArray(){
    try{
    Scanner input = new Scanner(System.in);
    System.out.println("Please eneter how big array");
    int n = input.nextInt();
    System.out.println("Please eneter " + n + " values:  \n");

    Circle[] circleArrayC = new Circle[n];
      for (int i = 0; i < n; i++){
        System.out.println("please enter the radius");
        double r = input.nextDouble();
        circleArrayC[i] = new Circle(r);
      }
      printCircleArray(circleArrayC);
    }
    catch(Exception e){
      System.out.println("You did something wrong");
    }
    finally{
      System.out.println("Welldone");
    }


  }


  // Creat an array of circle objects
  public static Circle[] creatCircleArray(){
    Circle[] circleArray = new Circle[5];

    for (int i = 0; i < circleArray.length; i++){
      circleArray[i] = new Circle(Math.random() * 100);
    }
    return circleArray;
  }
  // print an array of circles and their total getArea
  public static void printCircleArray(Circle[] circleArray){
    System.out.printf("%-30s%-15s\n" , "Radius", "Area");

    for (int i = 0; i < circleArray.length; i++){
      System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
        circleArray[i].getArea());
    }

    System.out.println("___________________________________");

    System.out.printf("%-30s%-15f\n", "The Toatal area of circles is: ",
      sum(circleArray));
  }
  public static double sum(Circle[] circleArray){
    double sum = 0;
    for (int i = 0; i < circleArray.length; i++){
      sum += circleArray[i].getArea();
    }
    return sum;
  }

}

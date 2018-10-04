import java.util.Scanner;
public class Continue{
  public static void main (String[]args){

    Scanner in = new Scanner(System.in);
    int x = -1;
    int sum = 0;
    while (x != 0) {
      x = in.nextInt();
      if (x <= 0) {
          continue;
        }
        else
          break;
    System.out.println("Adding " + x);
    sum += x;
    System.out.println(sum);
    }
  }
}

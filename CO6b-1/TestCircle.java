package p1;
import java.CircleUtils.*;
public class TestCircle {
  public static void main(String[] args) {
    Circle myCircle = new Circle (1.0);
    int n = 5;
    System.out.println("----------printCircle(myCircle, n)-------------");
    printCircle(myCircle, n);
    System.out.println("----------printCircle(myCircle)-------------");
    printCircle(myCircle);
  }
}

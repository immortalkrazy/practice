import java.util.Random;
public class TestRandom{
  public static void main(String[]args){
    Random random1 = new Random();
    System.out.println(random1.nextDouble());
    System.out.println(random1.nextInt(9));
    System.out.println(random1.nextInt());
    System.out.println(random1.nextBoolean());

    // generate number of random objects
    Random generator1 = new Random(4);
    Random generator2 = new Random(4);
    Random generator3 = new Random(3);
    //seed like 4 in the constructor is important
    // if seed is the same for 2 generators they will produce same numbers
    System.out.print("For gen 1: ");
    for (int i = 0; i < 10; i++){
      System.out.print(generator1.nextInt(1000) + " ");
    }
    System.out.print("\nFor gen 2: ");
    for (int i = 0; i < 10; i++){
      System.out.print(generator2.nextInt(1000) + " ");
    }
    System.out.print("\nFor gen 3: ");
    for (int i = 0; i < 10; i++){
      System.out.print(generator3.nextInt(1000) + " ");
    }
  }
}

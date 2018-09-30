class Count {
  public int count;

  public Count(){
    count = 1;
  }
  public Count(int c){
    count = c;
  }
}


public class Test{
  public static void main(String []args){
    Count myCount = new Count();
    int times = 0;

    for (int i = 0; i < times; i++)
    increment(myCount, times);
    System.out.println("Count is: " + myCount.count);
    System.out.println("times is: " + times);
  }
  public static void increment(Count c, int times){
    c.count++;
    times++;
  }
}

public class TestDate{
  public static void main (String[]args){
    java.util.Date date = new java.util.Date();
    System.out.println("Date is " + date);
    System.out.println("Date is in millies" + date.getTime());
    System.out.println("System in millies " + System.currentTimeMillis());
  }
}

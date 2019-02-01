public class App{
  public static void main (String []args){
    Contact c1 = new Contact("Faisal", "Ibrahim", "917-459-9398");
    System.out.println(c1);
    Contact c2 = new Contact("faisal", "Ibrahim", "917-459-9398");
    System.out.println(c2);
    System.out.println();
    System.out.println("YES or NO " + c1.compareTo(c2));
  }
}

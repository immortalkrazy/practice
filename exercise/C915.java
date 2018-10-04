
public class C915 {
  public boolean x;
  public static void main (String[]args){
    C915 c = new C915();
    System.out.println(c.x);
    System.out.println(c.convert());
  }
    public int convert(){
    return x ? 1 : -1;
  }
}

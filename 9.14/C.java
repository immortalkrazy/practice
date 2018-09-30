public class C {
  private int p;

  public C(){
    this(0);
    System.out.println("C's no-arg contructor invoked");

  }
  public C (int p) {
    this.p = p;
  }
  public void setP(int p){
    this.p = p;
  }
}

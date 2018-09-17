class Test{
  public static void main (String[]args){
    A a = new A();
    a.print();
  }
}
class A{
  A(){

  }
  String s;

  void A(String newS){
    s = newS;
  }
  public void print(){
    System.out.print(s);
  }
}

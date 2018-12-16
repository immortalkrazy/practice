
// Program 1:
// public class Q1133 {
//   public static void main(String[] args) {
//     Object a1 = new A();
//     Object a2 = new A();
//     System.out.println(a1.equals(a2));
//   }
// }
//
// class A {
//   int x;
//
//   public boolean equals(Object a) {
//     return this.x == ((A)a).x;
//   }
// }


// Program 2:
public class Q1133 {
  public static void main(String[] args) {
    Object a1 = new A();
    Object a2 = new A();
    System.out.println(a1.equals(a2));
  }
}

class A {
  int x;

  public boolean equals(A a) {
    return this.x == a.x;
  }
}

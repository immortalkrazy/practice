// I:
// public class Test {
//   public static void main(String[] args) {
//     A a = new A();
//     System.out.println(a.getValue());
//   }
// }
//
// class B {
//   public String getValue() {
//     return "Any object";
//   }
// }
//
// class A extends B {
//   public Object getValue() {
//     return "A string";
//   }
// }

// II
public class Q1110 {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.getValue());
  }
}

class B {
  public Object getValue() {
    return "Any object";
  }
}

class A extends B {
  public String getValue() {
    return "A string";
  }
}

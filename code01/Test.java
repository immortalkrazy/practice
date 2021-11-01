import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.add(1, 2));
        Scanner sc = new Scanner(System.in);
        System.out.println("Please: ");
        int a = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(b.add(a, c));
    }
}

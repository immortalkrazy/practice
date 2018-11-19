import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class C17a4 {
  public static void main(String[]args)throws Exception{
    File file = new File("test.txt");

    System.out.println(file.exists());
    System.out.println(file.canRead());
    System.out.println(file.canWrite());


    PrintWriter pw = new PrintWriter(file);

    pw.print("John T Smith");
    pw.println("90");

    System.out.println(file.exists());
    System.out.println(file.canRead());
    System.out.println(file.canWrite());
    pw.close();
  }
}

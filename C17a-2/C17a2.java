import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class C17a2{
  public static void main(String[]args)throws Exception{
    // confirm the arguments
//    if (args.length != 2) {
//      System.out.println("Usage: java filename name");
//      System.exit(1);
//    }
    String s = "john";
    // creat a keyboard scanner object
    Scanner kb = new Scanner(System.in);
    //
    File filename = new File("filename.txt");
    if(!filename.exists()){
      System.out.println("File " + filename + " does not exist");
    }
    ArrayList <String> list = new ArrayList<>();
    Scanner input = new Scanner(filename);
    while (input.hasNext()){
      list.add(input.next());
    }
    for (int i = 0; i < list.size(); i++){
      System.out.println("Names are: " + list.get(i));
    }
    System.out.println();
    for (int i = 0; i < list.size(); i++){
      if (list.get(i).equals(s)){
        list.remove(i);
      }
    }
    for (int i = 0; i < list.size(); i++){
      System.out.println("Names are: " + list.get(i));
    }
    if(filename.exists()){
      filename.delete();
    }

    PrintWriter pw = new PrintWriter(filename);
    if(filename.exists()){
      System.out.println("TRUE");
    }
    for (int i = 0; i < list.size(); i++){
      pw.println(list.get(i));
    }
    System.out.println("DONE");





    input.close();
    kb.close();
    pw.close();

  }//end of main
}//end of class

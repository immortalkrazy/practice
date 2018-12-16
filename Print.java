import java.io.PrintWriter;
public class Print{
  public static void main (String[]args) throws Exception{
    try(PrintWriter output = new PrintWriter("output.txt");){
      output.println("WelcomeTo");
    }
  }
}

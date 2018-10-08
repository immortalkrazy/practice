import java.util.Objects;
public final class GoldenDelicious extends Apple{
  private String name = "GoldenDelicious";

  public GoldenDelicious(){

  }
  public String toString(){
    return super.toString();
  }
  public boolean equals(Object obj){
    if (obj instanceof GoldenDelicious){
      return name.equals(((GoldenDelicious)obj).name);
    }
    else{
      return false;
    }
  }
  public int hashCode(){
    return Objects.hash(name);
  }
}

import java.util.Objects;
public final class McIntosh extends Apple{
  private String name = "McIntosh";

  public McIntosh(){

  }
  public String toString(){
    return super.toString() + " of type " + name;
  }
  public boolean equals(Object obj){
    if (obj instanceof McIntosh){
      return name.equals(((McIntosh)obj).name);
    }
    else{
      return false;
    }
  }
  public int hashCode(){
    return Objects.hash(name);
  }

}

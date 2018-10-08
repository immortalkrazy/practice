import java.util.Objects;
public class Orange extends Fruit{
  public String name = "Orange";

  public Orange(){

  }
  public Orange(String s){
    super(s);
  }

  public String toString(){
    return super.toString();
  }
  public String getOrangeJuiceRecipe(){
    return "This is orange juice recipe";
  }
  public boolean equals(Object obj){
    if (obj instanceof Orange){
      return name.equals(((Orange)obj).name);
    }
    else {
      return false;
    }
  }
  public int hashCode(){
    return Objects.hash(name);
  }

}

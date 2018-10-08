import java.util.Objects;
public class Apple extends Fruit{
  private String name = "Apple";

  public Apple(){
  }
  public Apple(String s){
    super(s);
  }
  public String toString(){
    return super.toString() + " called " + name;
  }
  public String getApplePieRecipe(){
    return "This is apple pie recipe";
  }
  public boolean equals(Object obj){
    if (obj instanceof Apple){
      return name.equals(((Apple)obj).name);
    }
    else {
      return false;
    }
  }
  public int hashCode(){
    return Objects.hash(name);
  }

}

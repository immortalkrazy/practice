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
}
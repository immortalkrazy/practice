public class Orange extends Fruit{
  public String name = "Orange";

  public Orange(){

  }
  public Orange(String s){
    super(s);
  }

  public String toString(){
    return super.toString() + " called " + name;
  }
  public String getOrangeJuiceRecipe(){
    return "This is orange juice recipe";
  }

}

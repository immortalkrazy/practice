public class Fruit{
    private String name = "Fruit";

    public Fruit(){
    }
    public Fruit(String name){
      this.setName(name);
      System.out.println("A new fruit added named: " + getName());
    }
    // protected final methods, specified constructor used
    // if specified fruit const. is used, name cannot be changed
    protected final void setName(String name){
      this.name = name;
    }

    protected String getName(){
      return this.name;
    }

    public String toString(){
      return super.toString() + ": This is a " + getName();
    }
}
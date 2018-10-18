import java.util.Objects;
public class Fruit{
    // private variable name
    private String name;

    public Fruit(){
    }
    public Fruit(String name){
      this.name = name;
    }

    protected void setName(String name){
      this.name = name;
    }

    protected String getName(){
      return this.name;
    }

    public String toString(){
      return "Class name is:  " + "Fruit"
             + "\nValue is the variable name is:  " + name;
    }

    public boolean equals(Object obj){
      if (obj instanceof Fruit){
        return name.equals(((Fruit)obj).name);
      }
      else{
        return false;
      }
    }

    public int hashCode(){
      return Objects.hash(name);
    }
    
}

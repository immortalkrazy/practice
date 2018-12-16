public abstract class Fruit implements Edible{

    private String name;

    public void setName(String name){
      this.name = name;
    }

    public String getName(){
      return name;
    }

    public abstract String howToEat();
}

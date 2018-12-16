public abstract class Animal{

  private String name;

  public Animal(){

  }
  public Animal(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }

  public string getName(){
    return name;
  }

  public void sleep(){
    Sytem.out.println("Sleep...........");
  }

  // abstract methods
  public abstract makeNoise();

}// end of class

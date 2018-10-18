public class Person{

  protected String name;
  protected String id;
  protected String address;

//  public Person(){
//  }

  public Person(String name, String id, String address){
    this.name = name;
    this.id = id;
    this.address = address;
  }
  public void changeAddress(String address){
    this.address = address;
  }
  public String getName(){
    return name;
  }
  public String getId(){
    return id;
  }
  public String getAddress(){
    return address;
  }
  public String toString(){
    return "person (name= " + name + ", id= " + id + ", address=" + address + ")";
  }
}

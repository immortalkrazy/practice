public class UserName {

  private String name;
  private  Password password;

  public UserName(String name){
    this.name = name;
    this.password = new Password();

  }

  public String toString(){
    return "The name is: " + name + "\nPassword is: " + password;
  }

}

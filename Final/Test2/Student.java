public class Student extends Person implements Status{

  private String status;

  public Student(){    
  }

  public Student(String name, String address, String phoneNumber, String email, String status){
    super(name, address, phoneNumber, email);
    this.setStatus(status);
  }

  public void setStatus(String status){
    this.status = status;
  }
}

public class Student implements PhoneNumber {
  private int id;
  private String firstName;
  private String lastName;
  private double gpa;

  public Student(){
  }

  public Student(int id, String firstName, String lastName, double gpa){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gpa = gpa;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setGpa(double gpa){
    this.gpa = gpa;
  }

  public int getId(){
    return id;
  }

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public double getGpa(){
    return gpa;
  }

  public String toString(){
    return "Student [id= " + id + ", First Name= " + firstName +
            ", Last Name= " + lastName + ", gpa= " + gpa + " ] ";
  }

  @Override
  public String myPhoneNumber(int myPhoneNumber){
    return "myPhoneNumber";
  }

}

import java.util.Date;
public class Employee extends Person{

  private int office;
  private double salary;
  private Date dateHired;

  public Employee(){
  }

  public Employee(String name, String address, String phoneNumber, String email,
                  int office, double salary, Date dateHired){
    super(name, address, phoneNumber, email);
    this.office = office;
    this.salary = salary;
    this. dateHired = dateHired;
  }

  
}

public class Faculty extends Employee{
  public static void main(String[]args){
    new Faculty();
  }
  public Faculty(){
    System.out.println("(4) Performs Faculty's Tasks");
  }
}
class Employee extends Person{
  public Employee(){
    this("(2) Invoke Employee's Overload constructor");
    System.out.println("(3) Performs employee's tasks");
  }
  public Employee(String s){
    System.out.println(s);
  }
}
class Person{
  public Person(){
    System.out.println("(1) Performs Person's task");
  }
}

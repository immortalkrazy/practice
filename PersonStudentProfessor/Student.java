public class Student extends Person{
  private String[] classTaken;
  private int vacant;

//  public Student(){
//  }
  public Student(String name, String id, String address){
    this(name,id,address,10);
  }
  public Student(String name, String id, String address, int capacity){
    super(name, id, address);
    classTaken = new String[capacity];
    vacant = 0;
  }

  public boolean addClassTaken(String className){
    if (vacant < classTaken.length){
      classTaken[vacant] = className;
      vacant++;
      return true;
    }
    else{
      return false;
    }
  }

  public void showClassTaken(){
    System.out.println(name + " has taken " + vacant + " classes.");
    for (int i = 0; i < vacant; i++){
      System.out.println("\t\t" + classTaken[i]);
    }
  }
  public String toString(){
    return "Student (name=" + name + ", id=" + id + ", address=" + address
    + ", coursesTaken=[" + String.join(", ", classTaken) + "])";
  }
}

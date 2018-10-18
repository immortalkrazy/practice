public class PersonClient{
  public static void main(String[]args){

    Person obj1 = new Person("faisal", "7865", "2900 Bedford Ave");
    Person obj2 = new Professor("chen", "5674", "2202 Bedford Ave",1990);
    Person obj3 = new Student("john", "8765", "2903 Bedford Ave", 5);

    System.out.println("Print 1:  " + obj1.toString());
    System.out.println("Print 2:  " + obj2.toString());
    obj2.changeAddress("30 Ave C");
    System.out.println("Print 2:  " + obj2.toString());
    //System.out.println("Print 3:  " + obj3.toString());

    System.out.println("");
//    if (obj2 instanceof Professor){
//        ((Professor)obj2).applySabbatical(1997);
//    }
    System.out.println("");
    if (obj3 instanceof Student){
        ((Student)obj3).addClassTaken("Accounting1");
        ((Student)obj3).addClassTaken("Accounting2");
        ((Student)obj3).addClassTaken("Accounting3");
        ((Student)obj3).addClassTaken("Accounting4");
        ((Student)obj3).addClassTaken("Accounting5");
        ((Student)obj3).addClassTaken("Accounting6");
        ((Student)obj3).showClassTaken();
    }
  }
}

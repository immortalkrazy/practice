class Student{
  String studentName;
  int age;
  boolean isScienceMajor;
  char gender;
}
public class TestStudent{
   public static void main(String[]args){

     Student student = new Student();
     System.out.println("name  : " + student.studentName);
     System.out.println("age   : " + student.age);
     System.out.println("major : " + student.isScienceMajor);
     System.out.println("gender: " + student.gender);
   }
}

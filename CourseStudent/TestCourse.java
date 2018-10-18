public class TestCourse{
  public static void main(String[]args){

    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    course1.addStudent("Peter Jones");
    course1.addStudent("Kim Smith");
    course1.addStudent("Ann Keneedy");
    course1.dropStudent("Kim Smith");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    System.out.println("Number of students in Course1 is: "
                        + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++){
      System.out.println(students[i]);
    }

    System.out.println("Number of students in Course1 is: "
                        + course2.getNumberOfStudents());

  }
}

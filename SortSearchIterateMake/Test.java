import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
  public static void main (String[]args){
    Test t = new Test();
    final int SIZE = 5;
    System.out.println("---------ArrayList---------------");
    // make an ArrayList
    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    t.makeRandomStudentList(studentArrayList, SIZE);
    t.printList(studentArrayList);
    Collections.sort(studentArrayList, new SortByLastName());
    System.out.println("------------------------");
    t.printList(studentArrayList);

    // make a linked list
    System.out.println("----------LinkedList--------------");
    LinkedList<Student> studentLinkedList = new LinkedList<Student>();
    t.makeRandomStudentList(studentLinkedList, SIZE);
    t.printList(studentLinkedList);
    Collections.sort(studentLinkedList, new SortByLastName());
    System.out.println("------------------------");
    t.printList(studentLinkedList);
    System.out.println("------------------------");

    // another List
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new ComparableStudent(23, "John", "coner", 3.74));
    list.add(new ComparableStudent(24, "Lisa", "Bush", 3.50));
    list.add(new ComparableStudent(25, "james", "Cameron", 3.50));
    list.add(new ComparableStudent(26, "Jack", "Reacher", 3.50));
    list.add(new ComparableStudent(27, "James", "Bond", 3.50));

    t.printList(list);
    Student s1 = new ComparableStudent(23, "John", "coner", 3.74);
    //Collections.sort(list);
    // // System.out.println(Collections.binarySearch(list, s1, new SortByLastName()));
    // System.out.println(Collections.binarySearch(list, s1));

    System.out.println("----------Iterator--------------");
    t.listIterateAndPrint(studentArrayList);
  }

  private List<Student> makeRandomStudentList(List<Student> list, int SIZE){
    Random rng = new Random();
    for (int i = 0; i < SIZE; i ++){
      String firstName = String.valueOf((char)('A' + rng.nextInt(26)));
      String lastName = String.valueOf((char)('A' + rng.nextInt(26)));
      double gpa = rng.nextDouble() * 4.0;
      Student s = new Student(i+10, firstName, lastName, gpa);
      list.add(s);
    }
    return list;
  }

  private void printList(List<Student> list){
    for (Student s: list){
      System.out.println(s.toString());
    }
  }

  private int binarySearchLastName(List<Student> list, String key){
    return binarySearchLastNameHelper(list, 0, list.size() -1, key);
  }
  private int binarySearchLastNameHelper(List<Student> list, int beginIndex,
                                          int endIndex, String key){
    return 1;
  }

  private void listIterateAndPrint(List<Student> list){
    ListIterator listIterator = list.listIterator();
    while (listIterator.hasNext()){
      System.out.println(listIterator.next() + " ");
    }
  }




}

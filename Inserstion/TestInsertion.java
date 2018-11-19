import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public class TestInsertion{
  public static void main (String []args){
    TestInsertion test = new TestInsertion();

    final int size = 10;
    final int max  = 50;

    // make  a very long ArrayList
    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    test.makeRandomList(intArrayList, size, max);

    // make a very long LinkedList
    LinkedList<Integer> intLinkedList = new LinkedList<Integer>();
    test.makeRandomList(intLinkedList, size, max);
    // measure time to do many insertions in ArrayList
    test.printRandomList(intArrayList);
    // measure time to do many insertions in Linkedlist


  }// end of main
  private List<Integer> makeRandomList(List<Integer> list, int size, int max){
     Random rng = new Random();
     for (int i = 0; i < size; i++){
       Integer n = rng.nextInt(max);
       list.add(n);
     }
     return list;
  }
  private void printRandomList(List<Integer> list){
    for (int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }

}// end of class

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestArrayAndLinkedList{

  public static void main (String[]args){

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(8);
    arrayList.add(3);
    arrayList.add(5);
    arrayList.add(4);
    arrayList.add(9);
    arrayList.add(1);

    System.out.println(arrayList);
    Collections.sort(arrayList);

    LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);

    linkedList.add(1, "Red");
    linkedList.addFirst("Green");

    System.out.println("Displays the linked list forward");
    ListIterator listIterator = linkedList.listIterator();
    while (listIterator.hasNext()){
      System.out.print(listIterator.next() + " ");
    }

    System.out.println("\nDisplays the Linked list backward");
    listIterator = linkedList.listIterator(linkedList.size());
    while (listIterator.hasPrevious()){
      System.out.print(listIterator.previous() + " ");
    }
  }

  private static void printList(List<Object> list){
    for(Object o: list){
      System.out.print(o + " ");
    }
  }
}
// just added the comment to check difftool

import java.util.*;

public class MyLinkedList<E>  {

  private static class DListNode<E> implements MyList<E> {

    private E data;
    private DListNode<E> previous;
    private DListNode<E> next;

    public DListNode(E data, DListNode<E> previous, DListNode<E> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
    }

    public E getData() {
      return data;
    }
    public DListNode<E> getPrevious(){
      return previous;
    }
    public DListNode<E> getNext(){
      return next;
    }
    public void setData(E data){
      this.data = data;
    }
    public void setPrevious(DListNode<E> previous){
      this.previous= previous;
    }
    public void setNext(DListNode<E> next){
      this.next = next;
    }

  } // end of DLISTNODE CLASS

  private DListNode<E> head;
  private DListNode<E> tail;
  private int numElements;

  public MyLinkedList() {
    head = null;
    tail = null;
    numElements = 0;
  }

  public void addFirst(E e) {
    DListNode<E> temp = new DListNode<E>(e,null,null);
    if (head == null){
      head = temp;
      tail = temp;
    }
    else {
      temp.setNext(head);
      head.setPrevious(temp);
      head = temp;
    }
    numElements++;
  }

  private class MyLinkedListIterator implements Iterator<E> {

    private DListNode<E> pointer;

    public MyLinkedListIterator() {
      pointer = head;
    }
    public E next() {
      E old = pointer.getData();
      pointer = pointer.getNext();
      return old;
    }
    public boolean hasNext() {
      return pointer != null;
    }
    public void remove() {
      throw new UnsupportedOperationException();
    }


  }// end of Iteraraor class

}

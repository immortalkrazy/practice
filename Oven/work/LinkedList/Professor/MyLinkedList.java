import java.util.*;

public class MyLinkedList<E> implements MyList<E> {

  private static class DListNode<E> {
    // data fields
    private E data;
    private DListNode<E> previous;
    private DListNode<E> next;
    // class constructor
    public DListNode (E data, DListNode<E> previous, DListNode<E> next) {
      this.data = data;
      this.previous = previous;
      this.next = next;
    }
    // getters
    public E getData() {
      return data;
    }
    public DListNode<E> getPrevious(){
      return previous;
    }
    public DListNode<E> getNext() {
      return next;
    }
    // setters
    public void setData(E data) {
      this.data = data;
    }
    public void setPrevious(DListNode<E> previous) {
      this.previous = previous;
    }
    public void setNext(DListNode<E> next) {
      this.next = next;
    }
  }// end of doubly node class

  // data filds for linked list class
  private DListNode<E> head;
  private DListNode<E> tail;
  private int numElements;
  // constructor
  public MyLinkedList() {
    head = null;
    tail = null;
    numElements = 0;
  }



}

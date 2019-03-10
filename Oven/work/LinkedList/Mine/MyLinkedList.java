import java.util.*;

public class MyLinkedList <E> implements MyList<E> {

    // private class MyLinkedListIterator implements Iterator<E> {
    //
    // }// end of Iterator class

    private static class DListNode<E> {
      private E data;
      private DListNode<E> previous;
      private DListNode<E> next;

      public DListNode() {
        this.data = null;
        this.previous = null;
        this.next = null;
      }

      public DListNode(E data, DListNode<E> previous, DListNode<E> next) {
        this. data = data;
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
        this.previous = previous;
      }
      public void setNext(DListNode<E> next){
        this.next = next;
      }

    } // end of node class

    public boolean add(E e) {
      return false;
    }
    public boolean add(int index, E Element) {
      return false;
    }
    public void clear() {

    }
    public boolean contains(Object obj) {
      return false;
    }
    public boolean equals(Object obj) {
      return false;
    }
    public E get(int index) {
      return null;
    }
    public E set(int index, E element) {
      return null;
    }
    public int indexOf(Object obj) {
      return -1;
    }
    public boolean isEmpty() {
      return false;
    }
    public Iterator<E> iterator() {
      return null;
    }
    public int lastIndexOf(Object obj){
      return -1;
    }
    public E remove(int index){
      return null;
    }
    public boolean remove(Object obj){
      return false;
    }
    public int size() {
      return -1;
    }


}

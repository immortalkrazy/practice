public class MyLinkedList <E> implements MyList<E> {

    private class MyLinkedListIterator implements Iterator<E> {

    }// end of Iterator class

    private static class DListNode<E> {
      private E data;
      private DListNode<E> previous;
      private DListNode<E> next;

      public DlistNode(E data, DlistNode<E> previous, DlistNode<E> next) {
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


}

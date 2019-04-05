import java.util.*;

public class MyLinkedList <E> implements MyList<E> {

    private class MyLinkedListIterator implements Iterator<E> {

        private DListNode<E> pointer;

        public MyLinkedListIterator () {

            pointer = sentinel.getNext();

        }
        public E next() {

            E old = pointer.getData();
            pointer = pointer.getNext();
            return old;

        }
        public boolean hasNext() {

            return pointer != sentinel;

        }

        public void remove() {
            throw new UnsupportedOperationException();
        }


    }// end of Iterator class

    private class DListNode<E> {

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

    // data fields for Linkedlist class
    private DListNode<E> sentinel;
    private int numElements;

    public MyLinkedList() {

        numElements = 0;
        sentinel = new DListNode<E>();
        sentinel.setData(null);
        sentinel.setNext(sentinel);
        sentinel.setPrevious(sentinel);

    }

    public void addFirst(E e) {

        DListNode<E> temp = new DListNode<>(e, null, null);

        if (sentinel.next == sentinel) {

            sentinel.setNext(temp);
            temp.setPrevious(sentinel);

        }
        else {

            sentinel.next.setPrevious(temp);
            sentinel.setNext(temp);
            temp.setPrevious(sentinel);
        }
        numElements++;

    }

    public void addLast(E e) {

        DListNode<E> temp = new DListNode<>(e, null, null);

        if (sentinel.next == sentinel) {

            sentinel.setNext(temp);
            temp.setPrevious(sentinel);

        }
        else {

            temp.setPrevious(sentinel.previous);
            sentinel.previous.setNext(temp);
            temp.setNext(sentinel);
        }
        numElements++;
    }

    public E removeFirst() {

        if (sentinel.next == sentinel) {
            throw new NoSuchElementException();
        }

        E answer = sentinel.next.getData();


        return answer;

    }
    // toDo
    public boolean add(E e) {
        return false;
    }
    // toDo
    public boolean add(int index, E Element) {
        return false;
    }
    // toDo
    public void clear() {

    }
    // toDo
    public boolean contains(Object obj) {
        return false;
    }
    // toDo
    public boolean equals(Object obj) {
        return false;
    }
    // toDo
    public E get(int index) {
        return null;
    }
    // toDo
    public E set(int index, E element) {
        return null;
    }
    // toDo
    public int indexOf(Object obj) {
        return -1;
    }
    // toDo
    public boolean isEmpty() {
        return false;
    }
    // toDo
    public Iterator<E> iterator() {
        return null;
    }
    // toDo
    public int lastIndexOf(Object obj){
        return -1;
    }
    // toDo
    public E remove(int index){
        return null;
    }
    // toDo
    public boolean remove(Object obj){
        return false;
    }

    public int size() {
        return numElements;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[ ");

        for(E e: this) {
            sb.append(e + " ");
        }

        sb.append("]");

        return sb.toString();

    }


}

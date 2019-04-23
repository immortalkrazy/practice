import java.util.*;
import java.io.*;

public class MyHeapQueue<E> implements MyPriorityQueue<E> {

    private ArrayList<E> theHeap;
    private Comprator<E> comp;

    public MyHeapQueue() {
        this(null);
    }

    public MyHeapQueue(Comparator<E> comp) {
        this.theHeap = new ArrayList<>();
        this.comp = comp;
    }

    public boolean isEmpty() {
        return theHeap.isEmpty();
    }

    public boolean add(E e) {
        theHeap.add(e);

        bubbleUp(size() - 1);

        return true;
    }

    public E peek() {
        return theHeap.get(0);
    }

    private void bubbleUp(int index) {

        while(index > 0 && myCompareFn(theHeap.get(index), theHeap.get(parent)) < 0) {

            swap(theHeap, index, parent);

            index = parent;
            parent = parentIndex(index);
        }
    }

    private int myCompareFn(E e1, E e2) {
        if (comp == null) {
            return ((Comparable<E>)e1).compareTo(e2);
        }
        else {
            return comp.compare(e1, e2);
        }
    }

    private static int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private static int leftChildIndex(int index) {
        return 2*index + 1;
    }

    private static int rightChildIndex(int index) {
        return 2*index + 2;
    }

    private static <E> void swap(ArrayList<E> arr, int index1, int index2) {
        E e = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, e);
    }




























}

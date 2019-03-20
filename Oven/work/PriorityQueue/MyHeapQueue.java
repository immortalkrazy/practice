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

      
}

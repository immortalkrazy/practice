import java.util.*;

public class StringUsePriorityQueue {

      public static void main(String[] args) {

            PriorityQueue<String> pQueue;
            pQueue = new PriorityQueue<String>(10, new StringLengthComparator());

            for (String arg: args) {
                  pQueue.add(arg);
            }
            while (!pQueue.isEmpty()) {
                  System.out.println(pQueue.poll());
            }

            System.out.println(pQueue.contains("abc"));
      }
}

import java.util.*;

public class InsertionSort <E> implements Comparable<E> {

      public int compareTo(E e) {
            return 1;
      }

      public <E> void insertionSort (E[] e) {

            for (int i = 0; i < e.length; i++) {

                  E key = e[i];
                  int loc = i - 1;

                  while (loc >= 0 && key.compareTo(e[loc]) < 0) {

                        e[loc + 1] = e[loc];
                        loc--;
                  }

                  e[loc + 1] = key;
            }

      }

      public static void main(String[]args) {

      }
}

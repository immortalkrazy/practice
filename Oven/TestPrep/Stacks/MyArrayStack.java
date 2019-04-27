import java.util.*;

public class MyArrayStack<E> implements MyStack<E> {

    private ArrayList<E> list = new ArrayList<E>();

    // doDo
    public boolean isEmpty() {
        return size() == 0;
    }

    //toDo
    public void push(E item) {
        list.add(item);
    }

    //toDo
    public E peek() {
        return list.get(size() - 1);
    }

    //toDo
    public E pop() {
        return list.remove(size() - 1);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("top\n");
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i) + "\n");
        }
        sb.append("bottom");

        return sb.toString();
    }


}

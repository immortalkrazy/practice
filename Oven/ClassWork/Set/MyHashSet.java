import java.util.*;

public class MyHashSet<E> implements Iterable<E> {

    private ArrayList<LinkedList<E>> theTable;

    public MyHashSet() {
        theTable = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            theTable.add(new LinkedList<>());
        }
    }

    public boolean add(E item) {

        if (contains(item))
            return false;

        int index = item.hashCode();
        index% = theTable.size();

        theTable.get(index).addFirst(item);

        return true;

    }

    public boolean contains (Object obj) {
        int index = obj.hashCode();
        index % = theTable.size();

        return theTable.get(index).contains(obj);
    }

    public Iterator<E> iterator() {
        return new SetIterator();
    }

    private class SetIterator implements Iterator<E>  {
        
    }
}

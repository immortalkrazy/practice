import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {

  public Iterator<E> iterator();

  public boolean add(E e);
  public void add(int index, E element);
  public void clear();
  public boolean contains(Object o);
  public boolean equals(Object obj);
  public E get(int index);
  public E set(int index, E element);
  public int indexOf(Object obj);
  public boolean isEmpty();
  public int lastIndexOf(Object obj);
  public E remove(int index);
  public boolean remove(Object obj);
  public int size();

}

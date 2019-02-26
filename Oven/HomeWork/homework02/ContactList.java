import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactList <Contact> implements Iterable<Contact> {

  List<Contact> contactList = new ArrayList<Contact>();

  @Override
  public Iterator<Contact> iterator() {
    return new CustomIterator<Contact>(contactList);
  }

  public class CustomIterator<E> implements Iterator<E> {

    private int indexPosition;
    List<E> internalList;

    public CustomIterator(List<E> internalList) {
      this.internalList = internalList;
      indexPosition = 0;
    }

    @Override
    public boolean hasNext() {
      if(internalList.size() >= indexPosition + 1){
        return true;
      }
      return false;
    }

    @Override
    public E next() {
      E val = internalList.get(indexPosition);
      indexPosition++;
      return val;
    }

  } // end of custom iterator class


}// end of custom array clss

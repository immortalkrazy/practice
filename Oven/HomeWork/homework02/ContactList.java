import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactList <Contact> implements Iterable<Contact> {

  private List<Contact> contactList;

  @Override
  public Iterator<Contact> iterator() {
    return new ContactIterator<Contact>(contactList);
  }

  public class ContactIterator<Contact> implements Iterator<Contact> {

    private int indexPosition;
    List<Contact> internalList;

    public ContactIterator(List<Contact> internalList) {
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
    public Contact next() {
      Contact contact = internalList.get(indexPosition);
      indexPosition++;
      return contact;
    }

  } // end of custom iterator class

  private Contact[] array;
  private int numElements;

  public ContactList() {
    numElements = 0;
    List<Contact> contactList = new ArrayList<Contact>();
  }

  // public Contactlist(Contact[] array){
  //   numElements = 0;
  //
  // }

  public int searchByLastName(String lastName){

  }

}// end of custom array clss

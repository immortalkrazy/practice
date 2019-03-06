import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactList <Contact> implements Iterable<Contact> {

  private List<Contact> contactList;

  @Override
  public Iterator<Contact> iterator() {
    return new ContactIterator();
  }

  private class ContactIterator implements Iterator<Contact> {

    private int indexPosition;

    public ContactIterator() {
      indexPosition = 0;
    }

    @Override
    public boolean hasNext() {
      return indexPosition < size();
    }

    @Override
    public Contact next() {
            indexPosition++;
            return arr[indexPosition - 1];
    }

  } // end of custom iterator class

  private Contact[] arr;
  private int logicalLength;

  public ContactList(int initialCapacity) {
    arr = (Contact[]) new Object[initialCapacity];
    logicalLength = 0;
  }

  public ContactList() {
    this(10);
  }

  public boolean addContact (Contact contact) {
    if(isFull()) {
      grow();
    }
    arr[logicalLength] = contact;
    logicalLength++;
    return true;
  }

  public void addContactAtIndex (int index, Contact contact) {
    if (isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException(index + " does not exist");
    }
    if (isFull()) {
      grow();
    }
    for (int i = arr.length - 1; i >= index; i-- ) {
      arr[i+1] = arr[i];
    }
    arr[index] = contact;
    logicalLength++;
  }

  public void clearConatctList () {
    logicalLength = 0;
  }

  public Contact getContact (int index) {
    if (isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException(index + " does not exist");
    }
    return arr[index];
  }

  public Contact setContact (int index, Contact newContact) {
    if (isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException(index + " does not exist");
    }
    Contact oldContact = arr[index];
    arr[index] = newContact;
    return oldContact;
  }

  public int indexOfContact (Contact contact) {

    for (int i = 0; i < size(); i++) {
      if (arr[i].equals(contact)) {
        return i;
      }
    }
    return -1;
  }

  public int size() {
    return logicalLength;
  }

  public boolean equals(Object obj) {
    if (! (obj instanceof ContactList)) {
      return false;
    }
    ContactList<Contact> another = (ContactList<Contact>)obj;
    if (size() != another.size()) {
      return false;
    }
    for (int i = 0; i < size(); i++) {
      if (! (arr[i].equals(another.arr[i]))) {
        return false;
      }
    }
    return true;
  }

  // some private helper methods
  private void grow() {
    int newCapacity = 2 * arr.length;
    Contact[] temp = (Contact[]) new Object[newCapacity];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    arr = temp;
    logicalLength = newCapacity;
  }

  private boolean isFull() {
    return logicalLength == arr.length;
  }

  private boolean isOutOfBounds(int index) {
    return index < 0 || index >= logicalLength;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < logicalLength; i++) {
      sb.append(arr[i]);
    }
    return sb.toString();
  }
  public Contact removeContact (int index) {
    if(isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException(index + " doesn't exist");
    }
    Contact oldContact = arr[index];
    for (int i = index + 1; i < size(); i++) {
      arr[i-1] = arr[i];
    }
    logicalLength--;
    return oldContact;
  }

  public boolean removeContact (Contact contact) {
    int index = indexOfContact(contact);
    if(index == -1) {
      return false;
    }
    removeContact(index);
    return true;
  }

  public int searchByLastName(Contact[] list, String lastName) {
    for (int i = 0; i < logicalLength; i++) {
      if (list.getContact(i).equals("name")) {
        return i;
      }
    }
    return -1;
  }

  public int searchByPhone(String phoneNumber) {
    return -1;
  }


}// end of custom array clss

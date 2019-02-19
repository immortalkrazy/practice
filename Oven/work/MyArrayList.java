public class MyArrayList <E> {

  private E[] arr;
  private int numOfElements;

  // constructor for MyArrayList
  public MyArrayList() {
    numOfElements = 0;
    arr = (E[]) new Object[20];
  }

  // add elements to the array
  public boolean add (E e) {
    // first check if space is available
    if (numOfElements == arr.length) {
    // method to change the size of array
      grow();
    }
    arr[numOfElements] = e;
    numOfElements++;
    // return true if element is added
    return true;
  }

  private void grow () {
    // create a new array but double the size
    E[] temp = (E[]) new Object[2 * arr.length];
    // put each elemt from arr into temp
    for (int i = 0; i < arr.length; i++){
      temp[i] = arr[i];
    }
    // make ref of arr to temp
    arr = temp;
  }

  // give the size of arraylist
  public int size () {
    return numOfElements;
  }

  // check if the arraylist is empty
  public boolean empty () {
    return numOfElements == 0;
  }

  // get the index of a specific elements
  public int indexOf (Object obj) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(obj)) {
        return i;
      }
    }
    return -1;
  }

  // clear the arraylist
  public class



}// end of class

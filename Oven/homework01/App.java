public class App{
  public static void main (String []args){

    // create a contact using default constructor with no data fields
    Contact contact1 = new Contact();
    System.out.println("This the the object with no data fields\n" + contact1);

    // create 2 contacts with the same data fiels
    Contact contact2 = new Contact("John", "Smith", "917-459-9398");
    Contact contact3 = new Contact("John", "Smith", "917-459-9398");
    Contact contact4 = new Contact("Harry", "Potter", "718-123-4321");
    Contact contact5 = new Contact("Nancy", "Smith", "917-459-9398");
    // comparing the two contacts if they are equals
    printWithPriority(contact2, contact5);
    System.out.println(contact2.compareTo(contact5));

  }

  public static void printWithPriority(Contact c1, Contact c2){
    if (c1.compareTo(c2) > 0){
      System.out.println(c1.getFirstName() + "\n comes before " + c2.getFirstName());
    }
    if (c1.compareTo(c2) < 0){
      System.out.println(c2 + "\n comes before " + c1);
    }
    else {
      System.out.println(c2 + "\n and " + c1 + "\n are equal");
    }
  }

}

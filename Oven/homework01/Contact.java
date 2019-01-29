import java.io.Serializable;
import java.io.*;
import java.util.*;

public class Contact implements Comparable<Contact>, Serializable{
  //
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String address;
  private String city;
  private String state;

  // default constructor
  public Contact(){

  }

  // constructor with all the information
  public Contact (String firstName, String lastName, String phoneNumber,
                  String address, String city, String state){

    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.city = city;
    this.state = state;
  }

  //constructor with onliy name and phoneNumber
  public Contact(String firstName, String lastName, String phoneNumber){

    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;

  }
  // setter methods for the data fields
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public int compareTo(Contact c){
    return 1;
  }

}

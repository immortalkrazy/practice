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

  // constructor with all the data fields (information)
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

  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public void setCity(String city){
    this.city = city;
  }

  public void setState(String state){
    this.state = state;
  }

  // getter methods for all the data fields
  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public String getPhoneNumber(){
    return phoneNumber;
  }

  public String getAddress(){
    return address;
  }

  public String getCity(){
    return city;
  }

  public String getState(){
    return state;
  }

  public boolean equals(Object obj){
    return true;
  }
  @Override
  //Override compareTo metho
  public int compareTo(Contact other){
    if (getLastName().compareTo(other.getLastName()) > 0)
      return 1;
    else if (getLastName().compareTo(other.getLastName()) < 0)
      return -1;
    else if (getLastName().compareTo(other.getLastName()) == 0
            && getFirstName().compareTo(other.getFirstName()) == 0)
      return 0;
    else
      return 7;
  }

  @Override
  public String toString(){
    return "Name: " + getFirstName() + " " + getLastName();
  }

}

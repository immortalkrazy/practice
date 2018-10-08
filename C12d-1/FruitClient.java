import java.util.ArrayList;

public class FruitClient{
  public static void main (String[]args){

    Orange orange = new Orange();
    Apple apple = new Apple();
    System.out.println(orange.getOrangeJuiceRecipe());
    System.out.println(apple.getApplePieRecipe());
    /*Fruit g is greated and called getName method*/
    Fruit g = new Fruit("'gala'");
    System.out.println(g.getName());

    System.out.println("\n-----Polymorphism-----");
    System.out.println("------Inheretence------");
    /*Polymirphism examples: all are created as Fruit but the
    later print statements show that f1....f5 are all different*/
    Fruit fOrg = new Orange();
    Fruit fApp = new Apple();
    Fruit fMci = new McIntosh();
    Fruit fGds = new GoldenDelicious();
    Fruit fFrt = new Fruit();
    /*toString methos of Object class is also implemented
    in all the to string methods to show inheretence*/
    System.out.println(fOrg.toString());
    System.out.println(fApp.toString());
    System.out.println(fMci.toString());
    System.out.println(fGds.toString());
    System.out.println(fFrt.toString());

    System.out.println("\n-----Casting----- \n");
    printRecipe(fGds, "tang");
    printRecipe(fOrg, "malta");
    printRecipe(new Orange(), "Kinnu");
    Fruit cali = new Apple("cali");
    printRecipe(cali, "Cali");
    //printRecipe(Fruit apple);
    //printRecipe(Fruit apple);
/*****************************************************************/

    System.out.println("");

    if (fApp instanceof Fruit){
      System.out.println(" is an Apple");
    }
    else{
      System.out.println(" is not Apple");
    }
    if (fFrt instanceof Fruit){
      System.out.println(" is an Fruit");
    }
    else{
      System.out.println(" is not Fruit");
    }
    if (fGds instanceof Apple){
      System.out.println(" is an Apple");
    }
    else{
      System.out.println(" is not Apple");
    }

    System.out.println("\n-----Dyanamic Bonding----- \n");
    /*Dynamic binding: which toString method is invoked by x is
    dependent on how the object was declared. In the print statemnet
    x refers to the particular object created not just any toString*/
    m(new Fruit());           // it prints Fruit toString
    m(new Apple("{crisp}"));  // new apple with specified arg
    m(new Orange());          // new Orange object
    m(new GoldenDelicious()); //
    m(new McIntosh());        //

    System.out.println("\n-------------------------------\n");
    ArrayList<String> cityList = new ArrayList<String>();
    cityList.add((new Fruit()).toString());
    cityList.add((new Orange()).toString());
    cityList.add((new Apple()).toString());
    cityList.add((new Fruit()).toString());
    //cityList.add("Paris");
    //cityList.add("New York");
    //cityList.add("Chicago");
    //cityList.add("Tokyo");
    System.out.println("cities: " +cityList.toString());
  } ///////////////////////////////////////////main method brace
  // method to print referenced object
  public static void m(Fruit x){
    System.out.println(x.toString());
  }
  /*********CASTING******************/

  public static void printRecipe(Fruit rFruit, String s){
    System.out.println();

    if (rFruit instanceof Orange){
      Orange tempOrange = (Orange) rFruit;
      System.out.println(tempOrange.getOrangeJuiceRecipe() +
       " for " + s);
    }
    else if (rFruit instanceof Apple){
      Apple tempApple = (Apple) rFruit;
      System.out.println(tempApple.getApplePieRecipe() +
       " for " + s);
    }
    else{
      System.out.println("Error");
    }
  }

}

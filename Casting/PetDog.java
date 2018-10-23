/**
 * Pet Dog has an extra method dogName()
 */
public class PetDog extends Dog{
   public String getType () {
      System.out.println("I am a PetDog");
      return "PetDog";
   }
   public String dogName () {
      System.out.println("I don't have Name !!");
      return "NO Name";
   }   
 }

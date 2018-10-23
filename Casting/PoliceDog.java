/**
 * Police Dog has an extra method secretId()
 */
public class PoliceDog extends PetDog{

 public String secretId() {
    System.out.println("ID police");
    return "ID";
 }

 public String getType () {
     System.out.println("I am a Police Dog");
     return "Police Dog";
 }
}

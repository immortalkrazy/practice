public class TestDog{
  public static void main (String[] args) {
      /**
       * Creating the different objects with super class Reference
       */
     Dog obj1 = new Dog();
            /**
           *  Object of Pet Dog is created with Dog Reference since
           *  Upcasting is done automatically for us we don't have to worry about it
           *
           */
     Dog obj2 = new PetDog();
           /**
           *  Object of Police Dog is created with Dog Reference since
           *  Upcasting is done automatically for us we don't have to worry
           *  about it here even though we are extending PoliceDog with PetDog
           *  since PetDog is extending Dog Java automatically upcast for us
           */
      Dog obj3 = new PoliceDog();

      obj1.getType();
      obj2.getType();
      obj3.getType();
      System.out.println("");
      // the if part is to be sure of right casting
      if (obj3 instanceof PoliceDog)
        ((PoliceDog)obj3).secretId();
        
        ((PetDog)obj2).dogName();
      System.out.println("");
      obj1.sayHello();
      obj2.sayHello();
      obj3.sayHello();

    }
}

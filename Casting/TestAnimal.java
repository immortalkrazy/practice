class Animal {
    public String move() {
        return "Going to somewhere";
    }
}

class Cat extends Animal{
    public String makeNoise() {
        return "Meow!";
    }
}

public class TestAnimal {

    public static void main(String[] args) {

    //1.- Upcasting
    //  __Type_____tag________object
        Animal animalCat = new Cat();
    //Some animal movement
        System.out.println(animalCat.move());
        //prints "Going to somewhere"

    //2.- Downcasting
    //Now you wanna make some Animal noise.
        //First of all: type Animal hasn't any makeNoise() functionality.
        //But Cat can do it!. I wanna be an Animal Cat now!!

        //___________________Downcast__tag_____ Cat's method
        String animalNoise = ( (Cat) animalCat ).makeNoise();

        System.out.println(animalNoise);
        //Prints "Meow!", as cats usually done.

    //3.- An Animal may be a Cat, but a Dog or a Rhinoceros too.
        //All of them have their own noises and own functionalities.
        //Uncomment below and read the error in the console:

    //  __Type_____tag________object
        //Cat catAnimal = new Animal();

    }

}

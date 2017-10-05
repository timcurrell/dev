/**
 * Created by Tim on 8/4/2017.
 */
public class Inheritance01 {

    public static void main(String[] args) {

        Animal myAnimal = new Animal("Tigger", 1, 1, 5, 5);

        Dog myDog = new Dog("Irish Red & White", 18, 40, 2, 4, 1, 32, "Soft, double");

        myDog.eat();

        myDog.walk();

        myDog.run();
    }
}

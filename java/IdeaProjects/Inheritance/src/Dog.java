/**
 * Created by Tim on 8/4/2017.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {

        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        super.eat();
        chew();
        System.out.println("NOMNOMNOMNOM!");
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Tail wagging, tongue derping...");
    }


    // If you call the name of the method without the 'super.' prefix, Java will look
    // within the class itself for an overridden method, and if none is found it will
    // look to the appropriate superclasses.

    public void walk() {
        System.out.println("Dog.walk() called.");
        move(4);
    }


    // You can specifically short-circuit the behavior described above by explicitly
    // inserting the 'super.' prefix. This will go directly to the appropriate
    // superclass and ignore any overridden methods in the current class.

    public void run() {
        System.out.println("Dog.run() called.");
        super.move(10);
    }
}

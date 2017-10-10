public class AbstractClass {

    abstract class Automobile{

        // An abstract class has one or more abstract methods in it.
        // All of these methods must have implementation in any class
        // that inherits from it.

        abstract void goForward();

        abstract void goBackward();

        abstract void turnLeft();

        abstract void turnRight();

        abstract void stop();

        // Note that not all of the methods in an abstract class must
        // be abstract. We can have fully-implemented methods in an
        // abstract class as well. These *do not* have to be
        // implemented by the inheriting class.

        public void honkHorn(){ System.out.println("BEEP BEEP!"); }

    }

    // Now the Ferrari class, and any class which extends Automobile,
    // must have full implementations of the abstract classes in the
    // class it is inheriting from. Failure to implement any of the
    // abstract methods, and the class will not compile.

    public class Ferrari extends Automobile{

        public void goForward(){ System.out.println("ZOOOOOOOOOOOOM!"); }

        public void goBackward(){ System.out.println("Pbbbbbbbbtttttt..."); };

        public void turnLeft(){ System.out.println("SCREEEEEEEEEEECH!"); };

        public void turnRight(){ System.out.println("HCEEEEEEEEEEEERCS"); };

        public void stop(){ System.out.println("RRRRRRRREEEEEEEEVVVVVVVVV!"); };

        // Note that the honkHorn() method is not implemented.
        // If the honkHorn() method is called within Ferrari, the
        // parent class method is invoked.

    }
}

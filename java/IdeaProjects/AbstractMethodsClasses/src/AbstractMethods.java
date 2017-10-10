abstract class AbstractMethods {

    // An abstract method is a method that has a signature but no body.

    public abstract int sumOfTwo(int i, int j);

    // The purpose of this is to serve as a mandate for classes that
    // are inheriting from the class where the abstract method exists.
    // Any classes extending that class *must* implement that abstract
    // method.

    class Demo extends AbstractMethods{

        // This class now must implement the sumOfTwo method

        public int sumOfTwo(int num1, int num2){
            return num1 + num2;
        }
    }

}

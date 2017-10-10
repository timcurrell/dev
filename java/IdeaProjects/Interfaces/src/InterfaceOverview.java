public class InterfaceOverview {

    public static void main(String[] args) {

    }


    // An interface is a special type of abstract class. The contents of an
    // interface are restricted to nothing but abstract methods -- methods
    // with no bodies.

    interface Bicycle {

        //  wheel revolutions per minute
        void changeCadence(int newValue);

        void changeGear(int newValue);

        void speedUp(int increment);

        void applyBrakes(int decrement);
    }


    class Bianchi implements Bicycle {

        // The compiler will now require that methods changeCadence, changeGear,
        // speedUp, and applyBrakes all be implemented. Compilation will
        // fail if those methods are missing from this class.
        // Note also that while you 'extend' from a parent class, you
        // 'implement' an interface.

        int cadence = 0;
        int speed = 0;
        int gear = 1;

        public void changeCadence(int newValue) { cadence = newValue; }

        public void changeGear(int newValue) {
            gear = newValue;
        }

        public void speedUp(int increment) {
            speed = speed + increment;
        }

        public void applyBrakes(int decrement) {
            speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("cadence:" +
                    cadence + " speed:" +
                    speed + " gear:" + gear);
        }
    }

}

/**
 * Created by Tim on 7/30/2017.
 */
public class Classes1 {

    public static void main(String[] args) {

        // A class is a template or blueprint for describing objects.
        //
        // Objects generally have two characteristics: state and behavior.
        // State is represented (and exposed to the world) through variables;
        // Behavior is represented and exposed through methods.
        //
        // Source code for a class is in files with the *.java extension.


        Car porsche = new Car();
        Car holden = new Car();


        // Using the setters to set the values of the private 'model' field

        porsche.setModel("918");

        holden.setModel("Commodore");


        // Using the getters to retrieve those values

        System.out.println("The model of the Porsche is a " + porsche.getModel());

        System.out.println("The model of the Holden is a " + holden.getModel());

    }

}

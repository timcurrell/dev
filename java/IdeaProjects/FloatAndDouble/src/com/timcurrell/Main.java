package com.timcurrell;

public class Main {

    /*
        Integers and floats use 4 bytes of memory; doubles use 8. However, when using a decimal point in your
        code, Java recommends that you use a double. On most modern computers running 64-bit operating systems,
        doubles are actually faster than floats. Additionally, many of the internal functions in the Java
        language use doubles instead of floats for better precision.
    */

    public static void main(String[] args) {
	    int myIntValue = 5;
	    float myFloatValue = 5f;
	    double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("");

        int myIntValue2 = 5 / 2;
        float myFloatValue2 = 5f / 2f;
        double myDoubleValue2 = 5d / 2d;

        System.out.println("myIntValue2 = " + myIntValue2);
        System.out.println("myFloatValue2 = " + myFloatValue2);
        System.out.println("myDoubleValue2 = " + myDoubleValue2);
        System.out.println("");

        int myIntValue3 = 5 / 3;
        float myFloatValue3 = 5f / 3f;
        double myDoubleValue3 = 5d / 3d;

        System.out.println("myIntValue3 = " + myIntValue3);
        System.out.println("myFloatValue3 = " + myFloatValue3);     // Floats have 7 decimal places of precision
        System.out.println("myDoubleValue3 = " + myDoubleValue3);   // Doubles have 16 decimal places of precision
        System.out.println("");


        // CHALLENGE!!!
        //
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number of pounds and store in a variable
        // 3. Print out the result
        //
        // NOTE: 1 pound is equal to 0.45359237 kilograms

        double convertPounds = 265d;
        double convertKilos = 0d;

        convertKilos = convertPounds * 0.45359237;

        System.out.println(convertPounds + " pounds is equal to " + convertKilos + " kilograms.");
    }
}

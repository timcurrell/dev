public class StandardNotation {

    public static void main(String[] args) {

        // There are numerous ways to express numeric literals in java.
        // The normal ones are covered here.

        byte b = 100;           // Range is -128 to 127
        short s = 1000;         // Range is -32,768 to 32,767
        int i = 1000000;        // Range is -2^31 to 2^31 - 1
        long l = 1000000000L;    // Range is -2^63 to 2^63 - 1

        float f = 3.14159f;
        double d = 123456789.987654321d;


        // All uninitialized numeric variables are automatically assigned
        // a value of zero. However, this is only true in the main block.
        // Local values are never assigned a default initialization value.

    }

}

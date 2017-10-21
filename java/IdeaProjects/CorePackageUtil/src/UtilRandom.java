import java.util.*;

public class UtilRandom {

    public static void main(String[] args) {

        // The Random class provides a means to obtain a pseudo-random number
        // from the java system. The system can generate integers, floats,
        // longs, doubles, bytes, and booleans.

        Random myRand = new Random();


        // The means of obtaining a new value from the Random object is to
        // use one of the 'next' methods.

        System.out.println(myRand.nextInt());
        System.out.println(myRand.nextDouble());
        System.out.println(myRand.nextFloat());
        System.out.println(myRand.nextLong());
        System.out.println(myRand.nextBoolean());


        // It is possible to provide a seed to the Random function with the
        // setSeed(long i) method. But this hardly seems necessary.

        // The Random generator can also provide a series of bytes to be
        // saved in a byte array provided for that purpose.

        byte[] newBytes = new byte[10];
        myRand.nextBytes(newBytes);
        System.out.println(newBytes);
    }
}

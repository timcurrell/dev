/**
 * Created by timcurrell on 4/29/2017.
 */
public class Primitives {
    public static void main(String[] args) {

        // size in memory of 8
        byte myByteValue = 10;  // Possible numeric range -128 through 127

        // size in memory of 16
        short myShortValue = 12345;  // Possible numeric range -32,768 through 32,767

        // size in memory of 32
        int myIntMinValue = -2147483648;
        int myIntMaxValue = 2147483647;

        // size in memory of 64
        // notice the 'L' on the end of the numeric value
        long myLongValue = 123456789L;

        // CHALLENGE!!!

        byte challengeByte = 7;
        short challengeShort = 20000;
        int challengeInt = -12345678;
        long challengeLong = 50000 + ( 10 * (challengeByte + challengeShort + challengeInt));

        // When you are dealing with a byte or short, any math must include a cast to the
        // desired type. Java automatically converts to an integer, which cannot be
        // assigned to a byte or short. For some reason, the long data type will accept an
        // integer without casting.

        System.out.println(challengeByte);
        System.out.println(challengeShort);
        System.out.println(challengeInt);
        System.out.println(challengeLong);

    }
}

/**
 * Created by Tim on 7/29/2017.
 */
public class isPrimeChallenge {

    public static void main(String[] args) {

        int myNumber = 997;

        if(isPrimeNumber(myNumber)){
            System.out.println(myNumber + " is a prime number! WOO-HOO!");
        } else {
            System.out.println(myNumber + " is not a prime number. Bummer...");
        }
    }


    // Method isPrimeNumber checks to see if the number is less than 3, then
    // if it is divisible by either 2, 3, 5, and returns 'false' in any
    // of those instances. It then divides target number by 3, adds one, rounds
    // to the nearest whole number, and begins the modulus process for all
    // numbers between 7 and that divisor limit.

    public static boolean isPrimeNumber(int pTarget) {

        if(pTarget % 2 == 0)
            return false;
        if(pTarget % 3 == 0)
            return false;
        if(pTarget % 5 == 0)
            return false;

        int targetDivisor = (int)(pTarget / 3) + 1;

        for(int x = 7; x <= targetDivisor; x += 2){

            if(pTarget % x == 0)
                return false;
        }

        return true;
    }
}

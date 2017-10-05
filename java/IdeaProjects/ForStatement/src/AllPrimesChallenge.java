/**
 * Created by Tim on 7/29/2017.
 */
public class AllPrimesChallenge {

    public static void main(String[] args) {

        int upperLimit = 1000000;
        int primeCount = 99999;

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        int foundCount = 3;

        for(int x = 7; x <= upperLimit; x+= 2){

            if(isPrimeNumber(x)) {
                System.out.println(x);
                foundCount++;
            }

            if(foundCount >= primeCount) break;
        }
    }


    public static boolean isPrimeNumber(int pTarget) {

        if(pTarget % 2 == 0) return false;
        if(pTarget % 3 == 0) return false;
        if(pTarget % 5 == 0) return false;

        int targetDivisor = (int)(pTarget / 3) + 1;

        for(int x = 7; x <= targetDivisor; x += 2){

            if(pTarget % x == 0)
                return false;
        }

        return true;
    }

}

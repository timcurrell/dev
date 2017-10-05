/**
 * Created by Tim on 7/29/2017.
 */
public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 1;
        int finishNum = 40;
        int evenNumCount = 0;
        int evenNumLimit = 25;

        while(number <= finishNum){
            if(!isEvenNumber(number)){
                number++;
                continue;       // jumps to next iteration of 'while' loop
            }

            System.out.println(number + " is an even number.");
            number++;

            evenNumCount++;
            if(evenNumCount >= evenNumLimit) break;

        }

        System.out.println(evenNumCount + " even numbers were found.");
    }


    public static boolean isEvenNumber(int pNumber){

        return (pNumber % 2 == 0);
    }
}

/**
 * Created by Tim on 7/29/2017.
 */
public class SwitchStatementChallenge {

    public static void main(String[] args) {

        char charValue = 'H';

        switch(charValue){
            case 'A':
                System.out.println("A is for apple.");
                break;
            case 'B':
                System.out.println("B is for bear.");
                break;
            case 'C':
                System.out.println("C is for cabbage.");
                break;
            case 'D':
                System.out.println("D is for duodenum.");
                break;
            case 'E':
                System.out.println("E is for eggplant.");
                break;
            case 'F': case 'G': case 'H':
                System.out.println("Some other letter was identified.");
            default:
                System.out.println("Character found is not part of the alphabet. Sorry.");
                break;
        }
    }
}

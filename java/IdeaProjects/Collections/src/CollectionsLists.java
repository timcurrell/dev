import java.lang.*;
import java.util.*;

public class CollectionsLists {

    // A List is an ordered collection, one which can contain duplicate elements.
    // Lists have several additional functional advantages over Sets, which include
    // positional access, search capabilities, iterations, and range-operations.
    // The Lists implemented in Java 8 are ArrayList and LinkedList.

    public static void main(String[] args) {

        String stripes[] = {"The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
        String ghostbusters[] = {"We", "came", "we", "saw", "we", "kicked", "its", "ass"};

        List stripesAList = new ArrayList();
        List ghostLList = new LinkedList();

        for(int i = 0; i < stripes.length; i++) {
            stripesAList.add(stripes[i]);
        }

        for(int j = 0; j < ghostbusters.length; j++) {
            ghostLList.add(ghostbusters[j]);
        }

        System.out.println(stripesAList);
        System.out.println(ghostLList);

        stripesAList.add(3, "sexy");
        ghostLList.remove(2);

        System.out.println(stripesAList);
        System.out.println(ghostLList);

        // The primary difference between the two types is the speed of different
        // types of element access. For front- and end- access, a LinkedList will
        // be faster. For internal access, an ArrayList will be faster.

    }

}

import java.lang.*;
import java.util.*;

public class CollectionsSets {

    // A Set is a collection that has no duplicates. It has three implementations
    // in Java 8: HashSet, TreeSet, and LinkedHashSet.

    public static void main(String[] args) {

        String stripes[] = {"The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
        String ghostbusters[] = {"We", "came", "we", "saw", "we", "kicked", "its", "ass"};

        try{
            // The HashSet stores its elements in a hash. This provides for
            // fast retrieval, but provides no guarantees of order.

            Set<String> stripesSet = new HashSet<String>();
            Set<String> ghostSet = new HashSet<String>();

            for(int i = 0; i < stripes.length; i++) {
                stripesSet.add(stripes[i]);
            }

            for(int j = 0; j < ghostbusters.length; j++) {
                ghostSet.add(ghostbusters[j]);
            }

            System.out.println(stripesSet);
            System.out.println(ghostSet);

            // The TreeSet stores its elements using a tree, placing them and
            // maintaining them in ascending order. The implementation has very
            // little overhead, making it a fast way to store and retrieve
            // information that must be located quickly.

            TreeSet stripesTree = new TreeSet<String>(stripesSet);
            TreeSet ghostTree = new TreeSet<String>(ghostSet);

            System.out.println(stripesTree);
            System.out.println(ghostTree);

            // The LinkedHashSet stores its elements using a linked list, and
            // maintains the elements in insertion order. The implementation has
            // greater overhead, making for longer retrieval times.

            Set<String> stripesLinkedHash = new LinkedHashSet<String>();
            Set<String> ghostLinkedHash = new LinkedHashSet<String>();

            for(int k = 0; k < stripes.length; k++) {
                stripesLinkedHash.add(stripes[k]);
            }

            for(int p = 0; p < ghostbusters.length; p++) {
                ghostLinkedHash.add(ghostbusters[p]);
            }

            System.out.println(stripesLinkedHash);
            System.out.println(ghostLinkedHash);

        } catch(Exception e) {}
    }

}

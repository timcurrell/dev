import java.util.*;

public class MapsTreeMap {

    // A TreeMap stores key->value pairs using a tree. This means it has two primary
    // differences from either a HashMap or a LinkedHashMap. First, it does not allow
    // null key values. And secondly, it maintains elements by ascending order of
    // keys in the key->value pairs.

    public static void main(String[] args) {

        // Create and populate linked hash map
        Map<Integer, String> map = new TreeMap<Integer, String>();

        map.put(103, "Lord Of The Flies");
        map.put(105, "The Great Gatsby");
        map.put(104, "Heart Of Darkness");
        map.put(102, "To Kill A Mockingbird");

        System.out.println("Values before remove: "+ map);

        // Remove value for key 102
        map.remove(102);

        System.out.println("Values after remove: "+ map);

        // Insert additional value with key 105
        map.put(101, "The Catcher In The Rye");

        System.out.println("Values after insert: "+ map);

        // Replace value for existing key 103
        map.replace(103, "Of Mice And Men");

        System.out.println("Values after replace: "+ map);
    }
}

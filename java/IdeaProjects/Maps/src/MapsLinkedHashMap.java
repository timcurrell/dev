import java.util.*;

public class MapsLinkedHashMap {

    // A LinkedHashMap implements the same way as a HashMap, with the difference
    // being that the LinkedHashMap maintains insert order.

    public static void main(String[] args) {

        // Create and populate linked hash map
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(103, "Lord Of The Flies");
        map.put(101, "The Great Gatsby");
        map.put(104, "Heart Of Darkness");
        map.put(102, "To Kill A Mockingbird");

        System.out.println("Values before remove: "+ map);

        // Remove value for key 102
        map.remove(102);

        System.out.println("Values after remove: "+ map);

        // Insert additional value with key 105
        map.put(105, "The Catcher In The Rye");

        System.out.println("Values after insert: "+ map);

        // Replace value for existing key 103
        map.replace(103, "Of Mice And Men");

        System.out.println("Values after replace: "+ map);
    }

}

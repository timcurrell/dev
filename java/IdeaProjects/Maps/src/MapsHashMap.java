import java.util.*;

public class MapsHashMap {

    // A HashMap stores key->value pairs using a hashtable. It contains unique elements
    // only. The HashMap allows for one null key and multiple null values. The HashMap
    // maintains no set order.

    public static void main(String args[]) {

        // Create and populate hash map

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(101,"Let us C");
        map.put(102, "Operating System");
        map.put(103, "Data Communication and Networking");

        System.out.println("Values before remove: "+ map);

        // Remove value for key 102
        map.remove(102);

        System.out.println("Values after remove: "+ map);

        // Insert additional value with key 104
        map.put(104, "Data Analysis For Dummies");

        System.out.println("Values after insert: "+ map);

        // Replace value for existing key 101
        map.replace(101, "Learn C Programming In 12 Minutes");

        System.out.println("Values after replace: "+ map);

    }

}

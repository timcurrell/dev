import java.lang.String;
import java.lang.System;
import java.util.*;

public class CollectionsDeque {

    // A Deque is a special type of Queue (collection) that allows access to both "ends"
    // of the line. Methods are available to add, inspect, or remove elements in either
    // the "first" or "last" position in line.

    public static void main(String[] args) {

        // Create ArrayDeque  object.

        Deque arrayDeque  = new ArrayDeque();

        // Adding objects to the ArrayDeque. Notice the "first" and "last" designation
        // specifies which "end" of the Deque they are inserted on.

        arrayDeque.addLast("with");
        arrayDeque.addFirst("alive");
        arrayDeque.addLast("the");
        arrayDeque.addFirst("are");
        arrayDeque.addLast("sound");
        arrayDeque.addFirst("hills");
        arrayDeque.addLast("of");
        arrayDeque.addFirst("The");
        arrayDeque.addLast("music");

        // Print the ArrayDeque object.
        System.out.println("ArrayDeque elements:");
        System.out.println(arrayDeque);

        // Print the ArrayDeque elements using iterator.
        Iterator iterator1=arrayDeque.iterator();
        System.out.println("ArrayDeque elements " +
                "using iterator:");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        // Print the first element of the ArrayDeque.
        System.out.println("First element: "
                + arrayDeque.getFirst());

        // Print the last element of the ArrayDeque.
        System.out.println("Last element: "
                + arrayDeque.getLast());

        // Remove the first element of the ArrayDeque.
        arrayDeque.pollFirst();

        // Remove the last element of the ArrayDeque.
        arrayDeque.pollLast();

        // Print the ArrayDeque object.
        System.out.println("ArrayDeque elements " +
                "after manipulation:");
        System.out.println(arrayDeque);

        // Print the ArrayDeque elements using iterator.
        Iterator iterator2=arrayDeque.iterator();
        System.out.println("ArrayDeque elements after " +
                "manipulation using iterator:");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }

}

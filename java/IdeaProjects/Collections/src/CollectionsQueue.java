import java.lang.*;
import java.util.*;

public class CollectionsQueue {

    // A Queue is a collection ordered by insertion sequence. Apart from obscure implementations,
    // it generally has a FIFO order: first in, first out -- like a standard line at the
    // supermarket.

    public static void main(String[] args) {

        // The first main implementation of the Queue interface is LinkedList. As confusing
        // as it may be, LinkedList implements both List and Queue. Instantiating a LinkedList
        // as a Queue exposes only the methods available in the Queue interface.

        Queue elvis = new LinkedList();

        // Elements can only be added to a Queue from the "back of the line". Insertion
        // using index placement is not offered.

        elvis.add("Hunka");     // add places an item on the queue; error throws exception
        elvis.add("hunka");
        elvis.add("burnin'");
        elvis.offer("blue");    // offer places an item on the queue; error returns false
        elvis.offer("suede");
        elvis.offer("cheese");

        System.out.println(elvis);

        // A Queue only provides access to the "front of the line" element. The system can
        // only get to one element at a time from one end of the queue.

        elvis.remove();         // removes first item from the queue; error throws exception
        elvis.poll();           // removes first item from the queue; error returns false

        System.out.println(elvis);

        // The system allows you to "look" at the next element in the queue. These methods
        // show, but do not remove, the "front of the line" element.

        System.out.println(elvis.element());    // shows first item in queue; empty queue throws exception
        System.out.println(elvis.peek());       // shows first item in queue; empty queue returns null

        System.out.println(elvis);

        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

        // The other implementation of the Queue interface is the PriorityQueue. This is a queue
        // that maintains element order based on a Comparator defined within the program. The
        // Comparator provides a means to compare any two elements in the PriorityQueue and
        // order them relative to one another based on established criteria.

        StudentComparator studentComparator = new StudentComparator();

        PriorityQueue<Student> priorityQueue =
                new PriorityQueue<Student>(10, studentComparator);

        //Adding elements in the PriorityQueue
        priorityQueue.offer(new Student("John Kena", 26));
        priorityQueue.offer(new Student("Dija Pone", 24));
        priorityQueue.offer(new Student("Ninja Panda", 27));
        priorityQueue.offer(new Student("Ninja AK", 18));
        priorityQueue.offer(new Student("Ninja CC", 25));
        priorityQueue.offer(new Student("Ninja F6F8", 25));
        priorityQueue.offer(new Student("Andy Druffens", 18));

        //Removing the Student Objects from the PriorityQueue
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }

    public static class Student {
        String name;
        int age;
        public Student(String name, int age) {
            this.name= name;
            this.age= age;
        }

        // This is actually to override the toString method in the Object class.

        @Override
        public String toString() {
            return "Student name is : "+ name + " and age is : " + age;
        }
    }

    // The Comparator we are defining allows the PriorityQueue to compare two
    // elements based on age. The Comparator subtracts one Student age from
    // another and returns the difference. The order is determined based on
    // whether the return value is positive or negative.

    public static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s2.age - s1.age;
        }
    }

}

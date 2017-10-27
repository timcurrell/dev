public class NewExceptions {

    // Dealing with Strings is the primary exception to the rules surrounding
    // the "new" keyword. You can, but do not have to, use the "new" keyword
    // when creating a new String. But behind the scenes there are differences
    // that occur when you perform each operation.

    public static void main(String[] args) {

        // When you create a String without using the "new" keyword, a new
        // String literal is created in the background and placed on the
        // heap. The overall collection of these String literals created
        // through any given program is called the String Pool. When a
        // String with content identical to one that already exists in
        // the String Pool, it turns the object into a pointer and points
        // it at the location of that string literal in memory.

        // We are going to create two Strings with the same series of
        // characters, then compare them.

        String str1 = "Pomegranate";
        String str2 = "Pomegranate";

        System.out.println("Two identical strings without new keyword ---");

        System.out.println(str1.equals(str2) ? "Same" : "Different" );

        // When we print out the memory location code for each object, we
        // see that both of the objects are pointing to the same String
        // memory location on the heap. Instead of two String objects existing,
        // what really exists is two pointers and a single String literal.

        System.out.println("Memory location: " + Integer.toHexString(str1.hashCode()));
        System.out.println("Memory location: " + Integer.toHexString(str2.hashCode()));

        System.out.println("Identity hash code: " + System.identityHashCode(str1));
        System.out.println("Identity hash code: " + System.identityHashCode(str2));

        // When we create two identical Strings using the "new" keyword,
        // we are actually creating two separate objects in memory that
        // have their own memory location, regardless of the content they
        // contain.

        String str3 = new String("Cumquat");
        String str4 = new String("Cumquat");

        System.out.println("Two identical strings with new keyword ---");

        System.out.println(str3.equals(str4) ? "Same" : "Different" );

        System.out.println("Memory location: " + Integer.toHexString(str3.hashCode()));
        System.out.println("Memory location: " + Integer.toHexString(str4.hashCode()));

        // So everything is the same up until this point, but when we look at
        // how the system identifies the objects, we see they are distinct.

        System.out.println("Identity hash code: " + System.identityHashCode(str3));
        System.out.println("Identity hash code: " + System.identityHashCode(str4));

    }

    // So does it matter which one you use? In most cases, not even a little bit.
    // But with respect to memory, there is a substantial difference between the
    // two. So when we're talking about 16 bytes, who cares. But when we're talking
    // 16 MB, it matters a lot.

}

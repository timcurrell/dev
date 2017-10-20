import java.io.*;

public class IntegerMethods {

    public static void main(String[] args) {

        // The compareTo(Object o) method compares the String to the parameter
        // object, which is most often another String. The return value is an
        // integer -- 0 if the strings are identical, otherwise it returns the
        // lexicographical representation of the comparison. There is also
        // a compareToIgnoreCase(String s) version which operates similarly.

        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");

        int cResult1 = str1.compareTo(str2);
        System.out.println(cResult1);

        int cResult2 = str2.compareTo(str3);
        System.out.println(cResult2);


        // The hashcode() method returns a hashcode for a given String. The hash
        // is calculated using a pre-determined and fixed algorithm. It is *not*
        // an encryption method.

        String HCString = new String("Welcome to Tutorialspoint.com");
        System.out.println("Hashcode for HCString :" + HCString.hashCode() );


        // The indexOf( ___ ) method has four iterations. The method returns an
        // integer representing the position of the given character or String
        // fragment in the parent String. The iterations are:
        //
        //     indexOf(char c)
        //     indexOf(char c, int fromIndex)
        //     indexOf(String str)
        //     indexOf(String str, int fromIndex)

        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Found character 'o' at index: " );
        System.out.println(Str.indexOf( 'o' ));

        System.out.print("Found character 'o' past index 5 at index: " );
        System.out.println(Str.indexOf( 'o', 5 ));

        String SubStr1 = new String("to");
        System.out.println("Found substring 'to' at index: " +
                Str.indexOf( SubStr1 ));

        System.out.println("Found substring 'to' past index 10 at index: " +
                Str.indexOf( SubStr1, 10 ));


        // The lastIndexOf( ___ ) method works similarly, and also has four
        // iterations -- identical to those for indexOf(). The difference is
        // two-fold. The iterations without the fromIndex parameter search for
        // the right-most (i.e. last) instance of the char or String. The
        // iterations with the fromIndex parameter search backwards starting at
        // the specified index.

        String Poem = "Mares eat oats and does eat oats and little lambs eat ivy.";

        System.out.print("Found last character 's' at index: " );
        System.out.println(Poem.lastIndexOf( 's' ));

        System.out.print("Found character 's' backwards from index 40 at index: " );
        System.out.println(Poem.lastIndexOf( 's', 40 ));

        String SubPoem = "eat";
        System.out.println("Found last substring 'eat' at index: " +
                Poem.lastIndexOf( SubPoem ));

        System.out.println("Found substring 'eat' backwards from index 40 at index: " +
                Poem.lastIndexOf( SubPoem, 40 ));


        // The length() method returns the length of the string in bytes.

        System.out.print("Str string length: " );
        System.out.println(Str.length());

        System.out.print("Poem string length: " );
        System.out.println(Poem.length());
    }

}

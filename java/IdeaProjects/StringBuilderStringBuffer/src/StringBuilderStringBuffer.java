import java.lang.*;

public class StringBuilderStringBuffer {

    public static void main(String[] args) {

        // Strings are constants; both StringBuilder and StringBuffer can be
        // changed -- altered, replaced, lengthened, and shortened.
        // The StringBuilder and StringBuffer classes are identical, with two
        // exceptions. StringBuilder is faster, but is not thread-safe.
        // StringBuilder is safe for multi-threading, but is slower.
        // All methods are identical and have identical signatures, so we
        // will only cover the StringBuilder class in these examples.

        StringBuilder SB1 =
                new StringBuilder("Mares eat oats and does eat oats and little lambs eat ivy.");
        StringBuilder SB2 =
                new StringBuilder("The quick brown fox jumped over the lazy dog.");
        StringBuilder SB3 =
                new StringBuilder("Supercalifragilisticexpialidocious");
        StringBuilder SB4 =
                new StringBuilder("The sixth sick sheik's sixth sheep's sick.");

        // The append( ___ ) method has 13 different implementations -- at
        // least one for each primitive data type, plus Object and String.
        // See the java documentation for all relevant details.

        System.out.println(SB2.append(" Sir!"));


        // The delete(int start, int end) method removes the characters in the
        // StringBuilder from the start point to the end point.

        System.out.println(SB1.delete(14, 32));


        // The insert( ___ ) method has as many implementations as append(),
        // with similar signatures. The primary difference is the ability to
        // specify the location of the insert. See the java documentation for
        // all the relevant details.

        System.out.println(SB4.insert(14, " swift"));


        // The replace(int start, int end, String str) method works just as
        // you would expect it to with the associated parameters.

        SB3.replace(9, 20, "thisisstupid");
        System.out.println(SB3);


        // The reverse() method does exactly what you expect it to.

        SB3.reverse();
        System.out.println(SB3);


        // Some of the methods available to String are also available to
        // StringBuilder and StringBuffer. These include indexOf(String str),
        // lastIndexOf(String str), length(), and substring(int start, int end)

        System.out.println(SB1.length());
        System.out.println(SB1.indexOf("eat"));
        System.out.println(SB1.lastIndexOf("eat"));
        StringBuilder shortPoem = new StringBuilder(SB1.substring(15, 25));
        System.out.println(shortPoem);

    }
}

public class StringPlusSign {

    // Apart from using the StringBuffer and StringBuilder classes, there are
    // two ways to concatenate Strings in java. The first is the plus sign.

    public static void main(String[] args) {

        String oneString = "Early ";
        String twoString = "Birdy ";
        String threeString = "Curly ";
        String fourString = "Whirly";

        // Two strings may be concatenated together, in the order shown,
        // by using the '+' operator.

        oneString = oneString + twoString;
        System.out.println(oneString);

        // String literals are also allowed using the '+' operator

        oneString = oneString + "came by in his ";
        System.out.println(oneString);

        // The '+=' abbreviation works the same with Strings as it does in
        // mathematics:
        //
        // a += b                       a = a + b;
        // str1 += str2                 str1 = str1 + str2

        oneString += threeString;
        System.out.println(oneString);

        // Order also matters with the '+' operator; Strings are concatenated
        // in the order listed. Additionally, you can use the '+' operator
        // multiple times in the same expression.

        oneString = "And little " + oneString + fourString;
        System.out.println(oneString);

        // The one primary difference from the concat() operator is that
        // the '+' operator will perform type conversion on the SECOND or
        // subsequent arguments if the first argument is a string. You do
        // not need to perform an explicit cast.

        String testString = threeString + 8;            // Will compile
        String nextString = fourString + (3.14159 / 2); // Will compile
        System.out.println(testString + " " + nextString);
    }

}

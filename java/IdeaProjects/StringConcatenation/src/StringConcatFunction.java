public class StringConcatFunction {

    // Apart from using the StringBuffer and StringBuilder classes, there are
    // two ways to concatenate Strings in java. The first is the built-in
    // concat() function.

    public static void main(String[] args) {

        String oneString = "Early ";
        String twoString = "Birdy ";
        String threeString = "Curly ";
        String fourString = "Whirly";

        // The String.concat(String s) function adds the String s on to the end
        // of the original String.

        System.out.println(oneString);
        oneString = oneString.concat(twoString);
        System.out.println(oneString);
        System.out.println(twoString);

        // The String to be concatenated can be in either object (variable)
        // form or literal form.

        oneString = oneString.concat("came by in his ");
        System.out.println(oneString);
        oneString = oneString.concat(threeString);
        System.out.println(oneString);
        System.out.println(twoString);
        System.out.println(threeString);

        // One restriction to the concat() function is that the order is
        // fixed. The second string will always be added at the end of the
        // first string, there is no way to put the first string last, or
        // perform an insert in the middle.

        oneString = oneString.concat(fourString);
        System.out.println(oneString);

        // String literals can also use the concat() function, as shown below:

        oneString = "And little ".concat(oneString);
        System.out.println(oneString);

        // The other restriction to the concat() function is that the parameter
        // must always be a String. The function does not perform any type
        // conversion; the compiler will throw an error.

        // String testString = threeString.concat(8);       <== Will not compile

    }
}

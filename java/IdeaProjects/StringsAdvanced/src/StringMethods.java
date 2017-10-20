public class StringMethods {

    public static void main(String[] args) {

        // The concat(String str) method concatenates the parameter string on
        // to the end of the String.

        String s = "Strings are immutable";
        System.out.println(s);
        s = s.concat(" all the time");
        System.out.println(s);


        // There are three methods to perform replacement operations within a
        // String. The first is replace(char old, char new), which replaces all
        // occurrences of a given char with the new specified char.

        String repTest = "Well you can't have everything, where would you put it?";

        System.out.print("String replacing 't' with 'Z': " );
        System.out.println(repTest.replace('t', 'Z'));

        System.out.print("String replacing 'e' with 'X': " );
        System.out.println(repTest.replace('e', 'X'));

        // The second is replaceAll(String regex, String subString), which replaces
        // all character strings that match the conditions specified in the regular
        // expression with the specified subString.

        System.out.print("String replacement matching regular expression: " );
        System.out.println(repTest.replaceAll("ou +", "ea "));

        // The third is replaceFirst(String regex, String subString), which works
        // the same as replaceAll(String regex, String subString) except it only
        // affects the first occurrence of a substring specified in the regular
        // expression.

        System.out.print("First replacement matching regular expression: " );
        System.out.println(repTest.replaceFirst("ou +", "ea "));


        // The split(String regex) method splits the String around substrings
        // matching the conditions specified in the regular expression. The
        // method returns an array of Strings. The method removes the
        // substrings that match the regular expression. Adding a second
        // int parameter restricts the number of splits the method will make.

        String tongueTwister = "The sixth sick sheik's sixth sheep's sick.";
        System.out.println("Original string: " + tongueTwister);

        for(String eachStr: tongueTwister.split(" s[aehou]")) {
            System.out.println(eachStr);
        }


        // The subString(int index) method and subString(int start, int end)
        // methods will return substrings based on the indexes in the String.

        System.out.println(repTest.substring(15));
        System.out.println(repTest.substring(15, 30));


        // The toLowerCase(), toUpperCase(), and trim() methods all work as
        // you would expect them to. trim() removes both leading and trailing
        // whitespace.

        String trimCaseTest = "      The hills are alive with the sound of music...       ";

        System.out.println(trimCaseTest);
        System.out.println(trimCaseTest.toLowerCase());
        System.out.println(trimCaseTest.toUpperCase());
        System.out.println(trimCaseTest.trim());
    }

}

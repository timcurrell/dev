public class BooleanMethods {

    public static void main(String[] args) {

        // The contains(CharSequence s) method checks to see if the CharSequence
        // s is present in the String

        String str1 = "tutorials point", str2 = "http://";
        CharSequence cs1 = "int";

        boolean retval = str1.contains(cs1);
        System.out.println("Method returns: " + retval);

        retval = str2.contains("_");
        System.out.println("Method returns: " + retval);


        // The contentEquals(CharSequence s) method checks to see if the String
        // is equal to the CharSequence s. The same method is available to use
        // with a StringBuffer parameter.

        String str3 = "amrood admin";
        CharSequence cs = "amrood admin";

        System.out.println("Method returns: " + str3.contentEquals(cs));


        // The endsWith(String suffix) method tests to see if the String ends
        // with the String specified by suffix.

        String str = "www.tutorialspoint.com";
        System.out.println(str);

        String endstr1 = ".com";
        String endstr2 = ".org";

        boolean retval1 = str.endsWith(endstr1);
        boolean retval2 = str.endsWith(endstr2);

        System.out.println("ends with " + endstr1 + " ? " + retval1);
        System.out.println("ends with " + endstr2 + " ? " + retval2);


        // The startsWith(String prefix) method tests to see if the String starts
        // with the String specified by prefix.

        String startStr1 = "www";
        String startStr2 = "http://";

        boolean retval3 = str.startsWith(startStr1);
        boolean retval4 = str.startsWith(startStr2);

        System.out.println("starts with " + startStr1 + " ? " + retval3);
        System.out.println("starts with " + startStr2 + " ? " + retval4);


        // The equals(Object a) method compares the String with the object
        // a -- which can be another String. The equalsIgnoreCase(Object b)
        // performs the same operation without respect to case.

        String eStr1 = "naughty monkey";
        String eStr2 = "bad capuchin";
        String eStr3 = "bad capuchin";
        String eStr4 = "bAd CaPuChIn";

        boolean strEquals1 = eStr1.equals(eStr2);
        boolean strEquals2 = eStr2.equals(eStr3);
        boolean strEquals3 = eStr2.equals(eStr4);

        boolean strEqIgC1 = eStr1.equalsIgnoreCase(eStr2);
        boolean strEqIgC2 = eStr2.equalsIgnoreCase(eStr3);
        boolean strEqIgC3 = eStr2.equalsIgnoreCase(eStr4);

        System.out.println("str1 is equal to str2 = " + strEquals1);
        System.out.println("str2 is equal to str3 = " + strEquals2);
        System.out.println("str3 is equal to str4 = " + strEquals3);

        System.out.println("str1 is equal to str2 ignoring case = " + strEqIgC1);
        System.out.println("str2 is equal to str3 ignoring case = " + strEqIgC2);
        System.out.println("str3 is equal to str4 ignoring case = " + strEqIgC3);


        // The isEmpty() returns true if the String length() is 0.

        String someString = "This string isn't empty.";
        String anotherString = "";

        System.out.println("String = [" + someString + "]");
        System.out.println("Length of string is " + someString.length());
        System.out.println("Is the string empty? " + someString.isEmpty());

        System.out.println("String = [" + anotherString + "]");
        System.out.println("Length of string is " + anotherString.length());
        System.out.println("Is the string empty? " + anotherString.isEmpty());
    }

}

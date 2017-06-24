package com.timcurrell;

public class Main {

    // There are multiple sources online listing the codes needed for Unicode character display

    public static void main(String[] args) {

        char myChar = 'a';
        char myUcode = '\u00A9';        // Copyright character

        System.out.println("Standard character output is " + myChar);
        System.out.println("Unicode character output is " + myUcode);

        boolean myBool = true;
        boolean yourBool = false;
    }
}

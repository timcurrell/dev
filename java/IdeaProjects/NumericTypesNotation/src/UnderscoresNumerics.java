public class UnderscoresNumerics {

    public static void main(String[] args) {

        // In order to make numbers more readable, java has allowed the programmer
        // to insert underscore characters [ "_" ] in between numeric digits in
        // number values. This can be done for any numeric primitive type,
        // however there are strict rules for doing so.

        int usFirst = 1_000_000;
        int usSecond = 2_000_001;
        long usSSN = 999_99_9999L;

        System.out.println(usFirst);
        System.out.println(usSecond);
        System.out.println(usFirst + usSecond);
        System.out.println(usSSN);

        // Underscores can only appear between numeric digits in a numeric
        // expression. The values above are legal, and as you see the mathematic
        // representation of them in memory is not affected.

        // Underscores can also be used to make values more readable when using
        // floats and doubles, on either side of the decimal.

        float pi = 3.141_592_653f;
        double bigNum = 123_456_789.987_654_321d;

        System.out.println(pi);
        System.out.println(bigNum);

        // Underscores can also be used to make values more readable when using
        // hex, binary, octal, or scientific notation. Remember that in hex,
        // the values A through F are numeric digits when it comes to rules
        // for underscores.

        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7FFF_FFFF_FFFF_FFFFL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        long octopus = 04321_63445;

        System.out.println(hexBytes + ", " + hexWords);
        System.out.println(maxLong);
        System.out.println(nybbles + ", " + bytes);
        System.out.println(octopus);

        // NOTE: Each underscore MUST occur between numeric digits. They may not
        // appear at the beginning or end of a number, next to a decimal, or
        // between a numeral and a type indicator (x, b, f, d, etc.). The only
        // exception to this is, you may put multiple underscores next to each
        // other. The compiler treats them as one, and ignores them both.
    }

}

public class MathGeekNotation {

    public static void main(String[] args) {

        // In addition to standard integers and floats, java allows you to use
        // various other numeric notation used in advanced math, science, and
        // computer science applications.

        // Scientific notation is usually an integer followed by "times 10 to
        // the power of" another integer. This is done in java in the following
        // way:

        double bigNumber = 123.456e5;
        System.out.println(bigNumber);


        // Hexadecimal values are mainly used in computer programming in an
        // effort to save storage space for long numbers or tracking the
        // identity of non-printable characters. Hexadecimal notation is
        // done in java in the following way:

        int hexValue = 0x8F;            // 0x prefix followed by the hex value
        System.out.println(hexValue);


        // In some instances it is useful to display numbers in binary format,
        // such as differentiating lower-case L from the numeral one. Binary
        // notation is done in java in the following way:

        int binValue = 0b11010;         // 0b prefix followed by the binary value
        System.out.println(binValue);


        // For whatever reason, java also has the ability to assign and calculate
        // numbers in octal (base-8). Why this is handy, I have no idea. At any
        // rate, octal notation is done in java in the following way:

        int octalValue = 032457;        // 0 prefix followed by octal value
        System.out.println(octalValue);

        // Be on the lookout for this, as what appears to be a normal integer
        // value prefixed by a zero is actually an octal numeric.
    }

}

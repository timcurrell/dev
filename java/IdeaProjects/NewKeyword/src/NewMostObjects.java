public class NewMostObjects {

    // In java, most objects (we'll get to the exceptions later) require that, when
    // you first create and initialize them, the "new" keyword is used. This creates
    // a new instance of the specified object and assigns it to the variable that
    // you have named.

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Jane, how do you stop this crazy thing?");
        System.out.println(sb);


        // Every time you create a new instance of an object, you need to use
        // the "new" keyword.

        Dirtbag elroy = new Dirtbag(123);

        Dirtbag judy = new Dirtbag(123);

        System.out.println(elroy == judy ? "Same" : "Different");


        // The exceptions to this rule are String, and the wrapper classes
        // for the primitive types (Integer, Double, etc.).
    }

}

class Dirtbag {

    public Dirtbag(int x) {
        int myInt = x;
    }

}

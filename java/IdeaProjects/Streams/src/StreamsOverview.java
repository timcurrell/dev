import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOverview {

    /*
        A Stream represents a sequence of objects from a source which supports aggregate
        operations. It is a new abstract layer introduced with Java 8.

        A Stream provides a set of elements of specific type in a sequential manner. It
        fetches and computes elements on demand -- it does not store the elements. A
        Stream takes Collections or I/O resources as its input source. Stream supports
        aggregate operations like filter, map, limit, etc. Most of the Stream operations
        return a Stream so that the result can be pipelined. The collect() method is
        a terminal operation normally present at the end of a pipelining operation to
        mark the end of a Stream. Stream operations perform iterations internally, as
        opposed to Collections processing where iteration must be explicit.

    **/

    public static void main(String[] args) {

        // The Collection interface provides the stream() and parallelStream()
        // methods to generate a stream.

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println(filtered);
    }

}

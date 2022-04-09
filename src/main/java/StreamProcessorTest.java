import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamProcessorTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(Arrays.asList("Peter", "Mark", "John", "Felix", "Mickle", "James", "Nick", "Reda"));
        OddStreamProcessor odsp = new OddStreamProcessor();
        System.out.println(odsp.oddWrapper(names));
        SortedStremProcessor srsp = new SortedStremProcessor();
        System.out.println(srsp.sortedProcessor(names));
        StringArrayProcessor sap = new StringArrayProcessor();
//        System.out.println(sap.cleanedArray);
        Stream.of("1, 2, 0", "4, 5")
                .flatMap(f -> Arrays.stream(f.split(",\s")))
                .sorted()
                .forEach(System.out::print);



    }
}

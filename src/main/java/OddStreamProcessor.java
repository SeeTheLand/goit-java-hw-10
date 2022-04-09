import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class OddStreamProcessor {

    public String oddWrapper(List<String> names) {
        Collector<String, StringJoiner, String> namesCollector =
                Collector.of(
                        () -> new StringJoiner(", "),
                        StringJoiner::add,
                        StringJoiner::merge,
                        StringJoiner::toString);

        return names
                .stream()
                .filter(n -> names.indexOf(n)%2 != 0)
                .map(name -> names.indexOf(name) + ". " + name)
                .collect(namesCollector);
    }

}

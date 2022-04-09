import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class SortedStremProcessor {
    public String sortedProcessor(List<String> names)  {
        Collector<String, StringJoiner, String> namesCollector =
                Collector.of(
                        () -> new StringJoiner(", "),
                        (j, p) -> j.add(p.toUpperCase(Locale.ROOT)),
                        StringJoiner::merge,
                        StringJoiner::toString);
        return names
                .stream()
                .sorted(Collections.reverseOrder())
                .collect(namesCollector);
    }
}

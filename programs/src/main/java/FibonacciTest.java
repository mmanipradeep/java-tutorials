import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciTest {

    public static void main(String args[]) {
        System.out.println(FibonacciTest.generate(10));
    }
    public static List generate(int series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]}) // lambda expression
                .limit(series)
                .map(n -> n[0])
//                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
//                    Collections.reverse(l);
//                    return l;
//                }));
                .collect(Collectors.toList());
    }

}

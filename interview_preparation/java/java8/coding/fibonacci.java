import java.util.stream.Collectors;
import java.util.stream.Stream;

class fibonacci {

    public static void main(String args[]) {
        String fibonacciSeries = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] })
                .limit(7)
                .map(t -> t[0])
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(fibonacciSeries);
    }
}
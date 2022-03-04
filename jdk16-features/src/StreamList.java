import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
    public static void main(String[] args) {


        List<String> integersAsString = Arrays.asList("1", "2", "3");
//Old Way
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.
                toList());
//From java16 onwords
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] integers = new int[] { 20, 98, 12, 7, 35 };

//        int min = Arrays.stream(integers)
//                .min()
//                .getAsInt();
//        System.out.println(min);

       // Find max or min number from list of numbers
// Get Min or Max Number
        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println(maxNumber);
    }
}

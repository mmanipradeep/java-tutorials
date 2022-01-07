import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class NearestValue {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;
        numbers[7] = 80;
        numbers[8] = 90;
        numbers[9] = 100;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        int n = 200;

        int c = list.stream()
                .min(Comparator.comparingInt(i -> Math.abs(i - n)))
                .orElseThrow(() -> new NoSuchElementException("No value present"));
        System.out.println(c);
    }
}

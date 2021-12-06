import java.util.Arrays;

public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] integers = new int[] { 20, 98, 12, 7, 35 };

        int min = Arrays.stream(integers)
                .max()
                .getAsInt();
        System.out.println(min);
    }
}

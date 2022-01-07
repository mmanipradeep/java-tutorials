import java.util.Arrays;

public class FindMissingNumbers {

    public static void main(String[] args) {
        //10 is missing
        int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};

        int N = numbers.length+1;
        int idealSum = (N * (N + 1)) / 2;
        int sum = Arrays.stream(numbers).sum();

        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);
    }
}

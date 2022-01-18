import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class NearestValue {
    public static void main(String[] args) {

       // Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

        //You must write an algorithm with O(log n) runtime complexity.
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

        System.out.println(getNearestNumber(numbers,90));
        System.out.println(search(numbers,90));
    }


    public static int search(int[] nums, int target) {
        int pivot, left = 0,
                right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target)
                return pivot;
            if (target < nums[pivot])
                right = pivot - 1;
            else
                left = pivot + 1;
        }
        return -1;
    }

    public static int getNearestNumber(int[] nums, int target){
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int n = 200;

        int c = list.stream()
                .min(Comparator.comparingInt(i -> Math.abs(i - n)))
                .orElseThrow(() -> new NoSuchElementException("No value present"));

        return c;
    }

}

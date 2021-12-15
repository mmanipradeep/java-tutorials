package com.mani.pradeep;

public class RecursiveBinary {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 8, 9, 10 };
        int target = 5;

        int left = 0;
        int right = nums.length - 1;

        int index = binarySearch(nums, left, right, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }

    public static int binarySearch(int[] nums, int left, int right, int target)
    {
        // Base condition (search space is exhausted)
        if (left > right) {
            return -1;
        }

        // find the mid-value in the search space and
        // compares it with the target

        int mid = (left + right) / 2;

        // overflow can happen. Use below
        // int mid = left + (right - left) / 2;

        // Base condition (a target is found)
        if (target == nums[mid]) {
            return mid;
        }

        // discard all elements in the right search space,
        // including the middle element
        else if (target < nums[mid]) {
            return binarySearch(nums, left, mid - 1, target);
        }

        // discard all elements in the left search space,
        // including the middle element
        else {
            return binarySearch(nums, mid + 1, right, target);
        }
    }
}

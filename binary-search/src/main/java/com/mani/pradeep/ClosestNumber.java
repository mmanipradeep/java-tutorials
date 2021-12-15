package com.mani.pradeep;

public class ClosestNumber {
    public static void main(String[] args) {

            int[] arr = new int[] { 2, 5, 6, 7, 8, 8, 9 };

            System.out.println(findClosest(arr, 5));
            System.out.println(findClosest(arr, 11));
            System.out.println(findClosest(arr, 4));
        }

        public static int findClosest(int[] intArray, int target) {
            int index = 0;
            int dist = Math.abs(intArray[0] - target);

            for (int i = 1; i< intArray.length; i++) {
                int cdist = Math.abs(intArray[i] - target);

                if (cdist < dist) {
                    index = i;
                    dist = cdist;
                }
            }

            return intArray[index];
        }


}

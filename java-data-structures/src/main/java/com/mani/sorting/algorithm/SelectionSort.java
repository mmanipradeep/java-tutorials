package com.mani.sorting.algorithm;

public class SelectionSort {

    public void selectioSort(int array[]){

        int n= array.length;
        for (int i =0; i<n-1; i++){
            int minIndex =i;
            for(int j=i+1; j<n;j++){
                if(array[j]<array[minIndex]){
                    minIndex =j;
                    int temp=array[minIndex];
                    array[minIndex] =array[i];
                    array[i] =temp;
                }
            }
        }
    }

    public static void sortAscending(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i; // Start with 0 position
            for (int j = i + 1; j < arr.length; j++) { // start from 1st postion of the Array
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }

    public static void sortDescending(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxElementIndex] < arr[j]) {
                    maxElementIndex = j;
                }
            }

            if (maxElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxElementIndex];
                arr[maxElementIndex] = temp;
            }
        }
    }
}


//    Time Complexity
//Best: ?(n^2)
//        Average: ?(n^2)
//        Worst: O(n^2)
//        Space Complexity
//        O(1)

  //  Selection Sort begins with the element in the 1st position of an unsorted array and scans through subsequent elements to find the smallest element.
//  Once found, the smallest element is swapped with the element in the 1st position.
package com.mani.sorting.algorithm;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

public class BubbleSort {

    public void oldBubbleSort(int [] unsortedArray){

        boolean swapped = false;
        for(int i=0;i<unsortedArray.length-1 ; i++){
            for(int j =0; j< unsortedArray.length -i -1 ; j++){
                if(unsortedArray[j] > unsortedArray[j+1]){
                    int temp = unsortedArray [j];
                    unsortedArray [j] = unsortedArray [ j+1];
                    unsortedArray [j+1] = temp ;
                }
            }
            if(!swapped){
                break;
            }
        }

    }

    public void bubbleSort(int[] array){
        System.out.println(Arrays.toString(array));
        BiConsumer<int[], Integer> swapValueIf = (a, j) -> {
            if (a[j] > a[j + 1]) {
                int temp =array[j];
                array[j] = a[j + 1];
                array[j + 1] = temp;
                System.out.println(Arrays.toString(array));
            }
        };

        IntStream.range(0, array.length - 1)
                .forEach(i -> IntStream.range(0, array.length - 1)
                         .forEach(j -> swapValueIf.accept(array, j)));

        System.out.println(Arrays.toString(array));
    }

    public void beforeJava8(int[] array){
        System.out.println("before 8 "+Arrays.toString(array));
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n-1; i++){
            for(int j=0; j <n -i-1 ; j++){
                if(array[j] > array[j+1]){
                    //swap elements
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        System.out.println("before 8 "+Arrays.toString(array));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> first = (t, u) -> System.out.println(t.toUpperCase() + u.toUpperCase());
        BiConsumer<String, String> second = (t, u) -> System.out.println(t.toLowerCase() + u.toLowerCase());
        first.andThen(second).accept("Edit", " learn java");

        int[] array = { 2, 1, 4, 6, 3, 5 };
        IntStream.range(0, array.length-1).forEach(i -> IntStream.range(0, array.length - 1));
    }
}

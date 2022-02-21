package com.mani.sorting.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void whenSortedWithBubbleSort_thenGetSortedArray() {
        int[] array = { 6,5,4,3,2,1};
        int[] sortedArray = { 1, 2, 3, 4, 5, 6 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array,array.length);
        assertArrayEquals(sortedArray,array);
    }
}

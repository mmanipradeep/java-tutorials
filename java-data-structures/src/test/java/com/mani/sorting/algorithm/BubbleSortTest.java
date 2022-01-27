package com.mani.sorting.algorithm;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void whenSortedWithBubbleSort_thenGetSortedArray() {
        int[] array = { 6,5,4,3,2,1};
        int[] sortedArray = { 1, 2, 3, 4, 5, 6 };
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        assertArrayEquals(sortedArray,array);
    }


    @Test
    public void whenSortedWithSelectionSort_thenGetSortedArray() {
        int[] array = { 6,5,4,3,2,1};
        int[] sortedArray = { 1, 2, 3, 4, 5, 6 };
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectioSort(array);
        assertArrayEquals(sortedArray,array);
    }
    @Test
    public void BiConsumerExample(){
        int[] array = { 2, 1, 4, 6, 3, 5 };
        int[] sortedArray = { 1, 2, 3, 4, 5, 6 };
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.beforeJava8(array);
        assertArrayEquals(sortedArray,array);

    }
}

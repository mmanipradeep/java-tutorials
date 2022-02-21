package com.mani.sorting.algorithm;

public class MergeSort {

    public static void main (String[] args){

        int [] unsortedArray = {7,6,5,4,2,1};
        int arrayLength = unsortedArray.length;
        mergeSort(unsortedArray , arrayLength);
        for (int j : unsortedArray) {
            System.out.println(j + " ");
        }
    }

    public static void mergeSort(int [] unsortedArray , int arrayLength){

        if(arrayLength <  2 ){
            return ;
        }

        int middle = arrayLength / 2 ;
        int [] left = new int [middle];
        int [] right =  new int [arrayLength - middle];
        for(int i=0 ; i < middle ; i++){
            left[i] = unsortedArray[i];
        }

       // System.arraycopy(unsortedArray, 0, left, 0, middle);
        for( int i = middle ; i < arrayLength ; i++ ){
            right[i - middle] = unsortedArray[i];
        }

        //if (arrayLength - middle >= 0)
         //   System.arraycopy(unsortedArray, middle, right, middle - middle, arrayLength - middle);

        mergeSort(left , middle);
        mergeSort(right , arrayLength - middle);
        merge(unsortedArray ,left , right , middle , arrayLength - middle );

    }

    public static void merge(int [] unsortedArray , int [] leftArray , int [] rightArray , int left , int right ){

        int i = 0 , j = 0 , k =0 ;

        while (i < left  && j < right){
            if(leftArray[i] <= rightArray[j] ){
                unsortedArray[k++] = leftArray[i++];
            }
            else
                unsortedArray[k++] = rightArray[j++];
        }

        while (i < left){
            unsortedArray[k++] = leftArray[i++];
        }
        while (j < right){
            unsortedArray[k++] = rightArray[j++];
        }

    }

}

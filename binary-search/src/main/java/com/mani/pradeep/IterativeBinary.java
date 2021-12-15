package com.mani.pradeep;

public class IterativeBinary {
    public static void main(String[] args) {
        int [] number ={2,4,6,8,3};
        int searchNo =2;
        int result = binarySearch(number,searchNo);
        if(result!=-1){
            System.out.println("Element found in array");
        }else{
            System.out.println("Element not found in array");
        }
    }

    public static int binarySearch(int [] number, int searchNo){
        int left =0;
        int right = number.length-1;

        while (left<=right){
            int mid = left + (right - left )/2;
            System.out.println("right:"+right+"left:"+left+"mid:"+mid);
            if(searchNo < number[mid]){
                right = mid -1;
            }else if(searchNo > number[mid]){
                left =mid +1 ;
            }else if (searchNo == number[mid]){
                return searchNo;
            }
        }
        return -1;
    }
}

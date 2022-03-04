package com.programs;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueNumbers {

    public static void main(String[] args) {
        int [] array = {1,1,2};
int sum= sumOfUnique2(array);
int sumMap = sumOfUnique(array);
        System.out.println(sum);
        System.out.println(sumMap);

    }
    public static int sumOfUnique2(int[] nums) {
        int[] unique = new int[101];
        int sum = 0;
        for (int num: nums) {
            unique[num-1]++;
            if (unique[num-1] == 1){
                sum += num;
            } else if (unique[num-1] == 2){
                sum -= num;
            }
        }
        return sum;
    }

    public static  int sumOfUnique(int[] nums) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) == 1)res+=nums[i];
            else if(map.get(nums[i]) == 2)res-=nums[i];
        }
        return res;
    }
}

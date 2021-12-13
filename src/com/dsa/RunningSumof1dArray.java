package com.dsa;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] arr =  {1,3,2,1};
        System.out.println(Arrays.toString(sumOneDArray(arr)));
    }
    static int[] sumOneDArray(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

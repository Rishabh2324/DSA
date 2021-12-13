package com.dsa;

import java.util.Arrays;

public class MinMaxUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {1, 4, 45, 6, 10, -8};
        System.out.println(Arrays.toString(findMinMax(nums,0,0,0)));
    }
    static int[] findMinMax(int[] nums ,int i ,int min,int max) {
        if (i < nums.length-1) {
            i++;
            return findMinMax(nums,i,Math.min(min , nums[i]), Math.max(max , nums[i]));
        }
        return new int[]{min,max};
    }
}

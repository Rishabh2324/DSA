package com.dsa;

import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffleArray(arr)));
    }
    static int[] shuffleArray(int[] nums){
        int[] newArr = new int[nums.length];
        for (int i=0 ; i<( nums.length/2) ; i++) {
            newArr[2*i] = nums[i];
        }
        for (int i = 0 ; i < (nums.length/2) ; i++) {
            newArr[2*i + 1] = nums[(nums.length / 2) + i];
        }
        return newArr;
    }
}

package com.dsa;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] op = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                op[0] = nums[i];
                op[1] = nums[i]+1;
            }
        }
        return op;
    };
}

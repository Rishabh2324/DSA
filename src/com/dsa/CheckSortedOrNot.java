package com.dsa;

public class CheckSortedOrNot {
    public static void main(String[] args) {
        int[] nums = {1,2,4,13,9,12};
        System.out.println(checkSotedOrNot(nums,0));
    }
    static boolean checkSotedOrNot(int[] nums ,int i) {
        if (i == nums.length-1) {
            return true;
        }
        return nums[i] < nums[i+1] && checkSotedOrNot(nums,i+1);
    }
}

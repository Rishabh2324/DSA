package com.dsa;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int lower_bound = 0;
        int upper_bound = nums.length - 1;
        while (nums[lower_bound] < nums[upper_bound]) {
            int mid = (lower_bound + upper_bound)/2;
            if (nums[mid] >  target) {
                upper_bound = mid-1;
            }else if (nums[mid] < target) {
                lower_bound = mid + 1;
            }else {
                if(nums[lower_bound] == nums[mid]) {
                    upper_bound--;
                }else {
                    lower_bound++;
                }
            }
        };
        if (nums[lower_bound] == nums[upper_bound] && nums[lower_bound] == target) {
            return new int[]{lower_bound,upper_bound};
        }
        return new int[]{-1,-1};
    };
}

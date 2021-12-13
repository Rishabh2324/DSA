package com.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5 ,-8};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    };
    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                ans[0] = i;
                ans[i] = map.get(target-nums[i]);
                break;
            } else map.put(nums[i] , i);
        };
        return ans;
    };
};

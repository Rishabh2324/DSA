package com.dsa;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hash_map= new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash_map.containsKey(nums[i]) && Math.abs(hash_map.get(nums[i]) - i) <= k) {
                return true;
            }else hash_map.put(nums[i],i);
        }
        return false;
    };
}

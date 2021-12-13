package com.dsa;

import java.util.Arrays;
import java.util.Hashtable;

public class SmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newSorted = nums.clone();
        Arrays.sort(nums);
        Hashtable<Integer,Integer> hash= new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) continue;
            hash.put(nums[i],i);
        }

        for (int i = 0; i < newSorted.length; i++) {
            nums[i] = hash.get(newSorted[i]);
        }
        return nums;
    }
}

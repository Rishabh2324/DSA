package com.dsa;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(getSingleNumber(nums));
    }

    static int getSingleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (freqMap.containsKey(nums[i])) freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
            else freqMap.put(nums[i], 1);
        }
        for (Map.Entry entry : freqMap.entrySet()) if(entry.getValue().equals(1)) return (int) entry.getKey();
        return 0;
    };
}

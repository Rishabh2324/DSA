package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        combinationSum(nums,target);
    }
    static void combinationSum(int[] candidates, int target) {
        int i = 0;
        int[] combin = new int[candidates.length];
        combination(candidates,target,i,combin);
    };
    static int[] combination(int[] candidates,int target,int i,int[] combin){
        if(target == 0) {
            return combin;
        }else {
            target = target- candidates[i];
            combin[i] = candidates[i];
            return combination(candidates,target,i,combin);
        }
    }
}

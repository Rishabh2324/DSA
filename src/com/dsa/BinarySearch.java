package com.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {11,13,16,19,22,25,29,30,33,35,36,39};
        int target = 111;
        int lower_bound = 0;
        int upper_bound = nums.length - 1;
        System.out.println(findElement(nums,target,lower_bound,upper_bound));
    }
    static int findElement(int[] nums,int target,int lower_bound, int upper_bound) {
        int mid=0;
        if (upper_bound >= lower_bound){
            mid = (lower_bound + upper_bound) / 2;
            if (nums[mid] == target) return mid + 1;
            else if (nums[mid] < target) return findElement(nums,target,mid+1 ,upper_bound);
            else return  findElement(nums,target,lower_bound,mid-1);
        }
        return -1;
    };
}

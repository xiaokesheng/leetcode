package com.zxb.algorithm;

/**
 * Created by USER-PC on 2016/9/24.
 */
public class TwoSumFirst {

    public int[] twoSumInOrder(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (nums[start] + nums[end] != target && start < end) {
            if (nums[start] + nums[end] > target) {
                end--;
            }
            if (nums[start] + nums[end] < target) {
                start++;
            }
        }
        return new int[] {start, end};
    }

    public int[] twoSumNoOrder(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}

package com.zxb.algorithm.sixty;

import com.zxb.algorithm.Util.PUtil;

/**
 * Created by USER-PC on 2016/9/25.
 */
public class MaximumSubarrayFiftyThree {
    public static int maxSubArray(int[] nums) {
        int max = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int innerMax = nums[i];
            for (int j = i; j < nums.length; j++) {
                innerMax = innerMax + (j == i ? 0 : nums[j]);
                if (max < innerMax) {
                    max = innerMax;
                }
            }
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        int max = -2148763;
        int curMaxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < curMaxSum + nums[i]) {
                curMaxSum = curMaxSum + nums[i];
            } else {
                curMaxSum = nums[i];
            }
            if (max < curMaxSum) {
                max = curMaxSum;
            }
        }
        return max;
    }
}

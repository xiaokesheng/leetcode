package com.zxb.algorithm.twenty;

/**
 * Created by USER-PC on 2016/9/25.
 */
public class MedianOfTwoSortedArraysForth {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] resultNums = new int[length];
        int num1Index = 0;
        int num2Index = 0;
        for (int i = 0; i < resultNums.length; i++) {
            if (num1Index >= nums1.length && num2Index <= nums2.length - 1) {
                resultNums[i] = nums2[num2Index];
                num2Index++;
                continue;
            }
            if (num2Index >= nums2.length && num1Index <= nums1.length - 1) {
                resultNums[i] = nums1[num1Index];
                num1Index++;
                continue;
            }
            if (nums1[num1Index] > nums2[num2Index]) {
                resultNums[i] = nums2[num2Index];
                num2Index++;
            } else {
                resultNums[i] = nums1[num1Index];
                num1Index++;
            }
        }

        if (length % 2 == 0) {
            return ((double) resultNums[length / 2 - 1] + (double) resultNums[length / 2]) / 2;
        } else {
            return (double) resultNums[length / 2];
        }
    }

    public static double findMedianSortedArraysMN(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        double median = 0;

        return median;
    }
}

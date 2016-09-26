package com.zxb.algorithm;

import com.zxb.algorithm.Util.PUtil;
import com.zxb.algorithm.otherbean.ListNode;
import com.zxb.algorithm.sixty.MaximumSubarrayFiftyThree;
import com.zxb.algorithm.twenty.*;

/**
 * Created by zxb on 2016/9/24.
 */
public class MainClass {
    public static void main(String[] args) {
        int[] array = new int[] {4, 8, 9, 11, 23, 35, 49, 128};

        // 第 1 题
        TwoSumFirst twoSumFirst = new TwoSumFirst();
//        int[] index = twoSumFirst.twoSumInOrder(array, 57);
        int[] index = twoSumFirst.twoSumNoOrder(array, 57);
        PUtil.p(index);

        // 第 3 题
        String s = "abcdafdacedad";
        String ss = "aa";
        String sub = LongestSubStringThird.stringOfLongestSubString(s);
        int max = LongestSubStringThird.lengthOfLongestSubString(s);
        PUtil.p(String.valueOf(max));
        PUtil.p(sub);

        int maximum = LongestSubStringThird.lengthOfLongestSubStringHashTable(s);
        PUtil.p(String.valueOf(maximum));

        // 第 53 题
        int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = new int[] {-2, 1};
        int subMax = MaximumSubarrayFiftyThree.maxSubArray2(nums);
        PUtil.p(subMax);

        // 第 2 题
        int[] numbersnode1 = new int[] {1,2,3};
        int[] numbersnode2 = new int[] {2,3,4};
        ListNode node1 = AddTwoNumbersSecond.getListNode(numbersnode1);
        ListNode node2 = AddTwoNumbersSecond.getListNode(numbersnode2);
        ListNode node = AddTwoNumbersSecond.addTwoNumbers(node1, node2);

        ListNode node3 = AddTwoNumbersSecond.getListNode(new int[] {1});
        ListNode node4 = AddTwoNumbersSecond.getListNode(new int[] {9, 9});
        AddTwoNumbersSecond.printNode(AddTwoNumbersSecond.addTwoNumbers(node3, node4));

        // 第 4 题
        int[] num1 = new int[] {1, 2};
        int[] num2 = new int[] {3, 4};
        PUtil.p(MedianOfTwoSortedArraysForth.findMedianSortedArrays(num1, num2));

        // 第 5 题
        String s1 = "abcdefe";
        int[] result = LongestPanlidromicSubStringFifth.longestPalindrome(s1);
        String resultStr = LongestPanlidromicSubStringFifth.longestPalindromeStr(s1);
        PUtil.p(resultStr);
        PUtil.p(result);
    }
}

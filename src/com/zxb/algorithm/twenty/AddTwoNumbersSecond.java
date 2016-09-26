package com.zxb.algorithm.twenty;

import com.zxb.algorithm.Util.PUtil;
import com.zxb.algorithm.otherbean.ListNode;

/**
 * Created by USER-PC on 2016/9/25.
 */
public class AddTwoNumbersSecond {
    //    "2 --> 4 --> 3"
//    "5 --> 6 --> 4"
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rootNode = null;
        ListNode currentNode = null;
        int jinwei = 0;
        while (null != l1 || null != l2) {
            int var1 = -1;
            int var2 = -1;
            if (null != l1) {
                var1 = l1.val;
            }
            if (null != l2) {
                var2 = l2.val;
            }
            if (var1 < 0) {
                var1 = 0;
            }
            if (var2 < 0) {
                var2 = 0;
            }
            int sum = var1 + var2 + jinwei;
            if (sum >= 10) {
                sum = sum - 10;
                jinwei = 1;
            } else {
                jinwei = 0;
            }

            PUtil.p("sum: --?> " + sum);

            if (rootNode == null) {
                rootNode = new ListNode(sum);
                currentNode = rootNode;
            } else {
                currentNode.next = new ListNode(sum);
                currentNode = currentNode.next;
            }

            if (null != l1 && null != l1.next) {
                l1 = l1.next;
            } else {
                l1 = null;
            }
            if (null != l2 && null != l2.next) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
            if (l1 == null && l2 == null) {
                if (jinwei == 1) {
                    currentNode.next = new ListNode(jinwei);
                }
            }
        }
        return rootNode;
    }

    public static ListNode getListNode(int[] number) {
        ListNode rootNode = new ListNode(number[0]);
        ListNode currentNode = rootNode;
        for (int i = 0; i < number.length - 1; i++) {
            currentNode.next = new ListNode(number[i + 1]);
            currentNode = currentNode.next;
        }
        return rootNode;
    }

    public static void printNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }
}

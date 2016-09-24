package com.zxb.algorithm;

import com.zxb.algorithm.Util.PUtil;
import com.zxb.algorithm.twenty.TwoSumFirst;

/**
 * Created by zxb on 2016/9/24.
 */
public class MainClass {
    public static void main(String[] args) {
        int[] array = new int[] {4, 8, 9, 11, 23, 35, 49, 128};

        TwoSumFirst twoSumFirst = new TwoSumFirst();
//        int[] index = twoSumFirst.twoSumInOrder(array, 57);
        int[] index = twoSumFirst.twoSumNoOrder(array, 57);

        PUtil.p(index);
    }
}

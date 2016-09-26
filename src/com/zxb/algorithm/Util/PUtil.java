package com.zxb.algorithm.Util;

/**
 * Created by USER-PC on 2016/9/24.
 */
public class PUtil {
    public static void p(int[] array) {
        for (int item : array) {
            System.out.print(String.valueOf(item) + ",");
        }
        System.out.println();
    }

    public static void p(String str) {
        System.out.println(str);
    }

    public static void p(int a) {
        System.out.println(String.valueOf(a));
    }

    public static void p(double a) {
        p(String.valueOf(a));
    }
}

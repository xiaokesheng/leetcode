package com.zxb.algorithm.twenty;

import java.util.Hashtable;

/**
 * Created by USER-PC on 2016/9/24.
 */
public class LongestSubStringThird {

    public static int lengthOfLongestSubString(String s) {
        int start = 0;
        int max = 1;
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        } else {
            for (int i = 1; i < s.length(); i++) {
                for (int j = i - 1; j >= start; j--) {
                    if (s.charAt(j) == s.charAt(i)) {
                        start = j + 1;
                        break;
                    } else {
                        if (max < i - j + 1) {
                            max = i - j + 1;
                        }
                    }
                }
            }
            return max;
        }
    }

    public static String stringOfLongestSubString(String s) {
        int start = 0;
        int max = 1;
        if (s.length() == 0 || s.length() == 1) {
            return s;
        } else {
            for (int i = 1; i < s.length(); i++) {
                for (int j = i - 1; j >= start; j--) {
                    if (s.charAt(j) == s.charAt(i)) {
                        start = j + 1;
                        break;
                    } else {
                        if (max < i - j + 1) {
                            max = i - j + 1;
                        }
                    }
                }
            }
        }

        int realStart = -1;
        if (max == 1) {
            return s.charAt(0) + "";
        } else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < i + max; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        break;
                    } else {
                        if (j == i + max - 1) {
                            realStart = i;
                            break;
                        }
                    }
                }
                if (realStart == i) {
                    break;
                }
            }
            return s.substring(realStart, realStart + max);
        }
    }

    public static int lengthOfLongestSubStringHashTable(String s) {
        int start = 0;
        int max = 0;
        Hashtable<Character, Integer> table = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            if (null != table.get(s.charAt(i))) {
                // 看看 start 和 当前的 char 得到的 index + 1，谁比较大
                if (start >= table.get(s.charAt(i)) + 1) {
                } else {
                    start = table.get(s.charAt(i)) + 1;
                }
            }
            if (max < i - start + 1) {
                max = i - start + 1;
            }
            table.put(s.charAt(i), i);
        }
        return max;
    }
}

package com.zxb.algorithm.twenty;

import com.zxb.algorithm.Util.PUtil;

/**
 * Created by USER-PC on 2016/9/26.
 */
public class LongestPanlidromicSubStringFifth {
    public static int[] longestPalindrome(String s) {
        int length = s.length();
        int max = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    for (int j = 0; (j <= i) && (j + i + 1 <= length - 1); j++) {
                        if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                            if (max < 2 + 2 * j) {
                                max = 2 + 2 * j;
                                index = i;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; (j <= i) && (j + i <= length - 1); j++) {
                if (s.charAt(i + j) == s.charAt(i - j)) {
                    if (max < 1 + 2 * j) {
                        max = 1 + 2 * j;
                        index = i;
                    }
                } else {
                    break;
                }
            }
        }
        return new int[] {max, index};
    }

    public static String longestPalindromeStr(String s) {
        int[] maxAndIndex = longestPalindrome(s);
        int index = maxAndIndex[1];
        int max = maxAndIndex[0];
        int type = 1 - max % 2;
        String result = "";
        for (int i = index - (max - 1) / 2; i <= index - (1 - type); i++) {
            result = result + s.charAt(i);
        }
        for (int i = index + type; i <= index + (max - 1) / 2 + type; i++) {
            result = result + s.charAt(i);
        }

        return result;
    }
}

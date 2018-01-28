package com.kristin.first.chapter1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/28 16:03
 * @desc 3.判断数组中元素是否只出现了一次
 **/
public class UniqueChar {
    //时间复杂度:O(N)  空间复杂度:O(N)
    public static boolean isUniqueString(String str) {
        char[] strArr = str.toCharArray();
        Set<String> set = new HashSet<String>();
        set.add(String.valueOf(strArr[0]));
        for (int i = 1; i < strArr.length; i++) {
            if (set.contains(String.valueOf(strArr[i]))) {
                return false;
            } else {
                set.add(String.valueOf(strArr[i]));
            }
        }
        return true;
    }

    //使用桶 时间复杂度:O(N)  空间复杂度:O(N)
    public static boolean isUniqueString2(String str) {
        if (str == null) {
            return true;
        }
        char[] strArr = str.toCharArray();
        boolean[] bucket = new boolean[256];
        for (int i = 0; i < strArr.length; i++) {
            if (bucket[strArr[i]]) {
                return false;
            }
            bucket[strArr[i]] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "123abcd2456";
        System.out.println(isUniqueString2(str));
    }
}

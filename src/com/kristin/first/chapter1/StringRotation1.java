package com.kristin.first.chapter1;


/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/28 15:23
 * @desc 6.字符串旋转 时间复杂度O(N)  空间复杂度O(N)
 **/
public class StringRotation1 {
    public static String rotaion(String str, int index) {
        String newStr = str + str;
        char[] strArr = str.toCharArray();
        char[] doubleStr = newStr.toCharArray();
        if (str == null || index <= 1 || index >= strArr.length) {
            return str;
        }
        return String.valueOf(doubleStr).substring(index + 1, index + 1 + strArr.length);
    }

    public static void main(String[] args) {
        String str = "ABCDEFGH";
        int index = 4;
        String newStr = rotaion(str, index);
        System.out.println(newStr);
    }
}

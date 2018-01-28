package com.kristin.first.chapter1;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/28 15:34
 * @desc 6.字符串旋转  时间复杂度O(N)  空间复杂度O(1)
 **/
public class StringRotation2 {
    public static String rotation1(String str, int index) {
        if (str == null || index <= 1 || index == str.length() - 1) {
            return str;
        }
        char[] arr = str.toCharArray();
        reverse1(arr, 0, index);
        reverse1(arr, index + 1, arr.length - 1);
        reverse1(arr, 0, arr.length - 1);
        return String.valueOf(arr);
    }

    private static void reverse1(char[] arr, int start, int end) {
        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = "ABCDEFGH";
        int index = 4;
        String newStr = rotation1(str, index);
        System.out.println(newStr);
    }
}

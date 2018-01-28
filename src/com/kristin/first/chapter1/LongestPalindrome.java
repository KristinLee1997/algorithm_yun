package com.kristin.first.chapter1;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/28 14:46
 * @desc 4.最长回文序列
 **/
public class LongestPalindrome {
    public static String longestPalindrome(String str, String strLps) {
        char[] chars = str.toCharArray();
        char[] charLps = strLps.toCharArray();
        char[] res = new char[2 * chars.length - charLps.length];  //  原串长:n 最长子串:m res容量:2*(n-m)+m
        int lpsLeft = 0;
        int lpsRight = charLps.length - 1;
        int charsLeft = 0;
        int charsRight = chars.length - 1;
        int resLeft = 0;
        int resRight = res.length - 1;
        while (resLeft <= resRight) {
            int tempLeft = charsLeft;   //标记chars左侧开始位置
            int tempRight = charsRight; //标记chars右侧结束位置
            while (chars[charsLeft] != charLps[lpsLeft]) { //从左至右寻找不同于最长子串的元素,直到找到最长子串的元素为止
                charsLeft++;  //跳出循环时,charLeft就是chars左侧的结束位置
            }
            while (chars[charsRight] != charLps[lpsRight]) {//从右至左寻找不同于最长子串的元素,直到找到最长子串的元素为止
                charsRight--; //跳出循环时,charsright就是chars右侧的开始位置
            }
            setTwoPartToResult(res, resLeft, resRight, chars, tempLeft, charsLeft, charsRight, tempRight);
            //将左右两个子串合并到结果串res后,记得要更新resLeft,resRight的值
            resLeft += charsLeft - tempLeft + tempRight - charsRight;
            resRight -= charsLeft - tempLeft + tempRight - charsRight;
            //将最长子串的元素添加到res中
            res[resLeft++] = chars[charsLeft++];
            res[resRight--] = chars[charsRight--];
            lpsLeft++;
            lpsRight--;
        }
        return String.valueOf(res);
    }

    //将原串中左右两部分子串添加到结果串res中
    private static void setTwoPartToResult(char[] res, int resLeft, int resRight,
                                           char[] chars, int leftStart, int leftEnd,
                                           int rightStart, int rightEnd) {
        for (int i = leftStart; i != leftEnd; i++) {
            res[resLeft++] = chars[i];
            res[resRight--] = chars[i];
        }
        for (int i = rightEnd; i != rightStart; i--) {
            res[resLeft++] = chars[i];
            res[resRight--] = chars[i];
        }
    }

    public static void main(String[] args) {
        String str = "B1G2TY34I3OPX2S1";
        String strLPS = "123I321";
        String result = longestPalindrome(str, strLPS);
        System.out.println(str + " shortest all palindrome string: " + result);
    }
}

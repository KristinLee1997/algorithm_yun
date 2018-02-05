package com.kristin.first.chapter1;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/29 10:48
 * @desc
 **/

public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        for (int i = 0; i < pushA.length / 2 + 1; i++) {
            if (pushA[i] != popA[popA.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
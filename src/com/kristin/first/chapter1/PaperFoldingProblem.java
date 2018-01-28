package com.kristin.first.chapter1;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/27 16:36
 * @desc 1.1折纸问题:输出结果是二叉树的中序遍历
 **/
public class PaperFoldingProblem {
    public static void printAllfolds(int foldTimes) {
        if (foldTimes < 1) {
            return;
        }
        printporcess(1, foldTimes, true);
        System.out.println();
    }

    private static void printporcess(int index, int foldtimes, boolean isDown) {
        if (index == foldtimes) {
            System.out.print(isDown ? "Down " : "Up ");
            return;
        }
        printporcess(index + 1, foldtimes, true);
        System.out.print(isDown ? "Down " : "Up ");
        printporcess(index + 1, foldtimes, false);
    }

    public static void main(String[] args) {
        printAllfolds(4);
    }
}

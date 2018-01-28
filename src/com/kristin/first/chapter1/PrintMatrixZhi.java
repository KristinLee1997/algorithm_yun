package com.kristin.first.chapter1;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/27 18:17
 * @desc 1.4 之字形打印矩阵
 **/
public class PrintMatrixZhi {
    public static void printMatrixZhi(int[][] matrix) {
        int upC = 0;
        int upR = 0;
        int downR = 0;
        int downC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = true;
        while (upR <= downR) {
            printLevel(matrix, upR, upC, downR, downC, fromUp);
            upR = upC == endC ? upR + 1 : upR; //当upC==endC时,说明up结点已经到了拐角
            upC = upC == endC ? upC : upC + 1;
            downC = downR == endR ? downC + 1 : downC;//当downR==endR时,说明down结点已经到了拐角
            downR = downR == endR ? downR : downR + 1;
            fromUp = !fromUp;
        }
        System.out.println();
    }

    //打印一条斜线
    private static void printLevel(int[][] matrix, int upR, int upC, int downR, int downC, boolean fromUp) {
        if (fromUp) {
            while (upR <= downR) {
                System.out.print(matrix[upR++][upC--] + " ");
            }
        } else {
            while (downR >= upR) {
                System.out.print(matrix[downR--][downC++] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printMatrixZhi(matrix);
    }
}

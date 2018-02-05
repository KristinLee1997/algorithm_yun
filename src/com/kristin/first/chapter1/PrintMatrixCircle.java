package com.kristin.first.chapter1;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/27 16:54
 * @desc 1.2转圈打印矩阵
 **/
public class PrintMatrixCircle {
    public static void printMatrixCircle(int[][] matrix) {
        if (matrix == null || matrix[0] == null) {
            return;
        }
        int upR = 0;
        int upC = 0;
        int downR = matrix.length - 1;
        int downC = matrix[0].length - 1;
        while (upC <= downC && upR <= downR) {
            if (upC == downC) {
                for (int i = upR; i <= downR; i++) {
                    System.out.print(matrix[i][upC] + " ");
                }
            } else if (upR == downR) {
                for (int i = upC; i <= downC; i++) {
                    System.out.print(matrix[upR][i] + " ");
                }
            } else {
                printCircle(matrix, upR, upC, downR, downC);
            }
            upC++;
            upR++;
            downC--;
            downR--;
        }
        System.out.println();
    }

    //打印一圈元素
    private static void printCircle(int[][] matrix, int upR, int upC, int downR, int downC) {
        int col = upC;
        while (col != downC) {
            System.out.print(matrix[upR][col] + " ");
            col++;
        }
        int row = upR;
        while (row != downR) {
            System.out.print(matrix[row][col] + " ");
            row++;
        }
        while (col != upC) {
            System.out.print(matrix[downR][col] + " ");
            col--;
        }
        while (row != upR) {
            System.out.print(matrix[row][col] + " ");
            row--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[][] matrix2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int[][] matrix3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        int[][] matrix4 = {{1, 2, 3, 4, 5}};
        int[][] matrix5 = {{1}, {2}, {3}, {4}, {5}};
        printMatrixCircle(matrix);
        printMatrixCircle(matrix2);
        printMatrixCircle(matrix3);
        printMatrixCircle(matrix4);
        printMatrixCircle(matrix5);
    }
}

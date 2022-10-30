package com.dsa;

import java.util.Scanner;

public class Basics2DArray {



    public static void findLargest(int mat[][]){
        // First find sum of all rows then get row which has maximum sum
        // Second Get sum of all columns then get column with maximum sum
        // Finally compare max of sum of row and column

        int rows_length = mat.length;

        if (rows_length == 0) {
            System.out.println("row" + " " + 0 + " " + Integer.MIN_VALUE);
            return;
        }

        int rows_sum = Integer.MIN_VALUE ,col_sum = Integer.MIN_VALUE , cols_length = mat[0].length ,m = 0 , n = 0;

        for (int i = 0; i < rows_length; i++) {
            int sum = 0;
            for (int j = 0; j < cols_length; j++) sum +=  mat[i][j];
            if (rows_sum < sum) {
                rows_sum = sum;
                m = i;
            }
        }

        for (int i = 0; i < cols_length; i++) {
            int sum = 0;
            for (int j = 0; j < rows_length; j++) sum +=  mat[j][i];
            if (col_sum < sum) {
                col_sum = sum;
                n = i;
            }
        }

        System.out.print(col_sum > rows_sum ? "column " + n : "row " + m);
        System.out.print(" " + Math.max(col_sum,rows_sum));
    }



    public static int[][] takeInput() {
        Scanner sys = new Scanner(System.in);
        System.out.println("NO OF ROWS" );
        int rows = sys.nextInt();
        System.out.println("NO OF COLS");
        int cols = sys.nextInt();
        int[][] arr2d = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2d[i][j] = sys.nextInt();
            }
        }
        return arr2d;
    };

    public static void print2dArray(int[][] arr2d) {
        int rows = arr2d.length;
        int cols = arr2d[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2d[i][j]+ " " );
            }
            System.out.println();
        }
    }

    public static void rowWiseSum(int[][] mat) {
        int rows = mat.length;
        if (rows == 0) return;
        int cols = mat[0].length;
        if (cols == 0) return;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
    }


    public static void main(String[] args)
    {
        int[][] arr2d = takeInput();
        findLargest(arr2d);
    }
}

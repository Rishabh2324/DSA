package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }

    static void setZeroes(int[][] matrix) {
        ArrayList<int[]> poistions  = getZeroesPosition(matrix);
        int total_position = poistions.size();
        for (int i = 0; i < total_position; i++) {
                populateRows(matrix,poistions.get(i)[1]);
                populateColumns(matrix,poistions.get(i)[0]);
        }
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    //    getZeroesPosition
    static ArrayList<int[]> getZeroesPosition(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        ArrayList<int[]> poistions = new ArrayList<int[]>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    poistions.add(new int[]{i, j});
                }
            }
        }
        return poistions;
    };

    //    Update Rows
    static void populateRows(int[][] matrix , int columnPosition) {
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            matrix[i][columnPosition] = 0;
        }
    };

    //    Update Columns
    static void populateColumns(int[][] matrix , int rowPosition) {
        int cols = matrix[0].length;
        for (int i = 0; i < cols; i++) {
            matrix[rowPosition][i] = 0;
        }
    };

}

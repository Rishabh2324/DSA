package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numRows = scan.nextInt();
        System.out.println(generate(numRows));
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0,1);
            for (int j = 1; j < row.size() - 1 ; j++)
                row.set(j,row.get(j)+row.get(j+1));
            list.add(new ArrayList<Integer>(row));
        };
        return list;
    }
}

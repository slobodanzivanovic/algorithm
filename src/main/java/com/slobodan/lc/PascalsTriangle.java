package com.slobodan.lc;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(value);
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));
    }
}

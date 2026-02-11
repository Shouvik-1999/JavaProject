package com.java.practice;

public class program1 {
    int LD=0;
    int RD=0;
    int[][] array = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
    };
    public int DiagonalSum() {
        for (int i = 0; i <=array.length-1; i++) {
            for (int j = 0; j <=array.length-1; j++) {
                if (i == j) {
                    LD = LD + array[i][j];
                }
            }
            RD=RD+array[i][array.length-i-1];
        }
        return Math.abs(LD-RD);

    }
    public static void main(String[] args) {
        program1 obj = new program1();
        int diff=obj.DiagonalSum();
        System.out.println("The absolute difference between the sums of the matrix diagonals is: " + diff);
    }
}

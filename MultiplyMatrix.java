package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

            int i, j, k;
            int col1 = matrix1[0].length, col2 = matrix2[0].length, row1 = matrix1.length, row2 = matrix2.length;


            int[][] C = new int[row1][col2];

            if (row2 == col1) {

                for (i = 0; i < row1; i++) {
                    for (j = 0; j < col2; j++) {
                        for (k = 0; k < col1; k++)
                            C[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

        return C;
        }

        public static void main (String[]args){

            System.out.println("Test your code here!\n");


            int[][] a = {
                    {0, 12345},
                    {4509, 0},
                    {3, 567}};

            int[][] b = {
                    {653, 0, 25353},
                    {0, 61, 6}};

            int[][] result = multiply(a, b);
            System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
        }
    }


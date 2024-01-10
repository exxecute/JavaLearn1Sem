package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        //Put your code here
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        // System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
        for(int i = 0; i < result.length; i++) 
        {
            for(int j = 0; j < result[0].length; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}

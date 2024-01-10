package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) 
    {
        int[][] matrix = new int[rows][columns];
        int count = 1;

        int top = 0;
        int bot = 0;
        int left = 0;
        int right = 0;

        while(true)
        {
            for(int i = left; i < columns - right; i++)
            {
                matrix[top][i] = count++;
            }

            top++;

            if(count > rows * columns)
            {
                break;
            }

            for(int i = top; i < rows - bot; i++)
            {
                matrix[i][columns - right - 1] = count++;
            }

            right++;

            if(count > rows * columns)
            {
                break;
            }

            for(int i = columns - right - 1; i >= left; i--)
            {
                matrix[rows - bot - 1][i] = count++;
            }

            bot++;

            if(count > rows * columns)
            {
                break;
            }

            for(int i = rows - bot - 1; i >= top; i--)
            {
                matrix[i][left] = count++;
            }

            left++;

            if(count > rows * columns)
            {
                break;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] a = spiral(3,4);

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(String.format("%4s", a[i][j]));
            }
            System.out.println();
        }
    }
}

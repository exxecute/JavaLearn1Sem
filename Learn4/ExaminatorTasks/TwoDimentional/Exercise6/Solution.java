class Solution {

    /**
     * @param a m x n matrix
     * @return the array from elements of the matrix in the following order:
     * the row 0 from right to left,
     * the row 1 from left to right,
     * the row 2 from right to left, and so on
     */
    public static int[] straighten(int[][] a) {
        int b[] = new int[a.length * a[0].length];
        int direction = 1;

        for (int i = 0; i < a.length; i++) 
        {
            if(direction == 1)
            {
                int ij = a[0].length - 1;
                for(int j = 0; j < a[0].length; j++) 
                {
                    b[(i * a[0].length + j)] = a[i][ij];
                    ij--;
                }
                direction = 0;
            }
            else
            {
                for(int j = 0; j < a[0].length; j++) 
                {
                    b[(i * a[0].length + j)] = a[i][j];
                }
                direction = 1;
            }
        }

        return b;
    }
}
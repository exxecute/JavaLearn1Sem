class Solution {

    /**
     * @param a m x n matrix
     * @return the matrix containing even rows of the matrix a
     */
    public static int[][] create(int[][] a) {
        int len = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(i % 2 == 0)
            {
                len++;
            }
        }

        int[][] b = new int[len][a[0].length];

        for(int i = 0; i < len; i++) 
        {
            for(int j = 0; j < a[0].length; j++) 
            {
                b[i][j] = a[i*2][j];
            }
        }

        return b;
    }
}

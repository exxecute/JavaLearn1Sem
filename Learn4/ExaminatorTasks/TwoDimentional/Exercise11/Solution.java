class Solution {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int b[][] = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i > n - j - 1)
                {
                    b[i][j] = 0;
                }
                else
                {
                    b[i][j] = i + 1;
                }
            }
        }
        return b;
    }
}

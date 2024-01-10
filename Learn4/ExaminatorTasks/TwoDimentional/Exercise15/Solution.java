class Solution {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int b[][] = new int[n][n];

        for(int i  = 0; i < n; i++)
        {
            int a = i + 1;
            for(int j = 0; j < n; j++)
            {
                b[i][j] = a;
                a = ((a == n) || (a == 0)) ? 0 : a + 1;
            }
        }

        return b;
    }
}

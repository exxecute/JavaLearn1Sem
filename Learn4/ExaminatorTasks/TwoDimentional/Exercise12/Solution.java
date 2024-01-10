class Solution {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] c = new int[n][n];

        int zeros = 0;

        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < zeros / 2; j++) 
            {
                c[i][j] = 0;
            }
            for(int j = zeros / 2; j < n - zeros / 2; j++) 
            {
                c[i][j] = 1;
            }
            zeros+= 2;
        }

        int[][] d = c.clone();

        for(int i = 0; i < n / 2; i++) 
        {
            int[] temp = d[i].clone();
            d[i] = d[n - i - 1].clone();
            d[n - i - 1] = temp.clone();
        }


        int[][] b = new int[n][n];
        if(n % 2 == 0) {
            for(int i = 0; i < n / 2; i++) 
            {
                b[i] = c[i].clone();
            }
            for(int i = n / 2; i < n; i++) 
            {
                b[i] = d[i].clone();
            }
        } 
        else 
        {
            for(int i = 0; i < n / 2 + 1; i++)
            {
                b[i] = c[i].clone();
            }
            for(int i = n / 2 + 1; i < n; i++) 
            {
                b[i] = d[i].clone();
            }
        }

        return b;
    }
}

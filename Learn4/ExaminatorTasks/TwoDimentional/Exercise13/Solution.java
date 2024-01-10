import java.util.Arrays;

class Solution {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] answer = new int[n][n];

        for(int i = 0; i < (n/2) +1; i++)
        {
            for(int j = 0; j < i + 1; j++)
            {
                answer[i][j] = 1;
            }

            for(int j = n - 1; j >= n - i - 1; j--)
            {
                answer[i][j] = 1;
            }
        }

        for(int i = (n/2) + 1; i < n; i++)
        {
            for(int j = 0; j <= n - i - 1; j++)
            {
                answer[i][j] = 1;
            }

            for(int j = n - 1; j >= i; j--)
            {
                answer[i][j] = 1;
            }
        }

        return answer;
    }
}

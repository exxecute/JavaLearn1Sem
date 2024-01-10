class Solution {

    /**
     * @param a a 2-dimensional array
     * @return the number of two-digit numbers in the array
     */
    public static int numberOfTwoDigits(int[][] a) {
        //put your code here
        int answer = 0;

        for(int i = 0; i < a.length; i++) 
        {
            for(int j = 0; j < a[i].length; j++) 
            {
                if((a[i][j] > 9 && a[i][j] < 100) || (a[i][j] < -9 && a[i][j] > -100)) 
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}

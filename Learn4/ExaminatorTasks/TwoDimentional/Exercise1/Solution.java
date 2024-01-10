class Solution {

    /**
     * @param a the given array, containing numbers from 0 to 3 inclusively
     * @return the k x 4 matrix filled  with zeros and b[i][j] = 1 where j = a[i]
     */
    public static int[][] create(int[] a) {
        int b[][] = new int[a.length][4];
        for(int i = 0; i < a.length; i++)
        {
            b[i][a[i]] = 1;
        }
        return b;
    }
}
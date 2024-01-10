class Solution {

    /**
     * @param a a 2-dimensional array
     * @return the boolean array b, where b[i] is true
     * if the number 5 occurs at least three times in the row i
     */
    public static boolean[] create(int[][] a) {
        //put your code here
        boolean[] b = new boolean[a.length];

        for(int i = 0; i < a.length; i++) 
        {
            int counter = 0;

            for (int j = 0; j < a[i].length; j++) 
            {
                if (a[i][j] == 5) 
                {
                    counter++;
                }
            }

            if (counter >= 3) 
            {
                b[i] = true;
            }
        }

        return b;
    }
}

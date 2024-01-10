class Solution {

    /**
     * method replaces all elements of a that greater than m with m
     *
     * @param a the given array
     * @param m the given number
     * @return the number of replacements
     */
    public static int getResult(int[] a, int m) {
        //put your code here, update elements of the array a if needed
        int replacements = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > m)
            {
                a[i] = m;
                replacements++;
            }
        }

        return replacements;
    }
}


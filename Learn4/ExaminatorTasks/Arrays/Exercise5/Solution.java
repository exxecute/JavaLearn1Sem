class Solution {

    /**
     * method swaps the largest and smallest elements of array a
     *
     * @param a the given array, all its elements are distinct
     */
    public static void swapMinAndMax(int[] a) {
        int indexMin = 0;
        int indexMax = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < a[indexMin])
            {
                indexMin = i;
            }
            if(a[i] > a[indexMax])
            {
                indexMax = i;
            }
        }

        int temp = a[indexMin];
        a[indexMin] = a[indexMax];
        a[indexMax] = temp;
    }
}


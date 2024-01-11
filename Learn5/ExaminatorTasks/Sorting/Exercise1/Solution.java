class Solution {

    /**
     * method partially sorts an array by ascending order
     * with the direct selection sort algorithm
     *
     * NOTE: partially means that the minimal k elements of the array
     * are ordered after k iterations
     *
     * @param a the given array
     * @param k the given number of iterations, 0 < k < a.length
     */
    public static void sort(int[] a, int k) {
        //put your code here

        for(int i = 0; i < k; i++)
        {
            int min = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

    }
}

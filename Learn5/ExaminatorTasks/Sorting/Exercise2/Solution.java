class Solution {

    /**
     * method partially sorts an array by ascending order
     * with the insertion sort algorithm
     *
     * NOTE: Partially means that the first (k + 1) elements of the array
     * are ordered after k iterations.
     *
     * @param a the given array
     * @param k the given number of iterations, 0 < k < a.length
     */
    public static void sort(int[] a, int k) {
        //put your code here

        for(int i = 0; i < k; i++)
        {
            int min = i;
            for(int j = i + 1; j < k + 1; j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            insert(a, min, i);
        }
        
    }

    static void insert(int[] a, int valueIndex, int plaseIndex)
    {
        int temp = a[valueIndex];
        for(int i = valueIndex; i > plaseIndex; i--)
        {
            a[i] = a[i - 1];
        }
        a[plaseIndex] = temp;
    }

    public static void main(String[] args) 
    {
        int[] a = new int[]{4, 8, 6, 2, 5};
        insert(a, 2, 1);
        System.out.println(java.util.Arrays.toString(a));
    }
}


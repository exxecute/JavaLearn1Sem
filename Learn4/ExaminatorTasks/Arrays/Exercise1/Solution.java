import java.util.Arrays;

class Solution {

    /**
     * @param a the given array
     * @param k > 0 the given number
     * @return an array containing the first k positive elements of the array a
     */
    public static int[] getResult(int[] a, int k) {

        int array[] = new int[k];
        int arrai_index = 0;

        for(int i = 0; i < a.length; i++) 
        {
            if(arrai_index == k)
            {
                break;
            }
            if(a[i] > 0) 
            {
                array[arrai_index] = a[i];
                arrai_index++;
            }
        }

        return array;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(getResult(new int[]{1, -3, 2, 0, -1, -1, 2, 10, 0}, 3)));
    }
}

class Solution {

    public static void main(String[] args) {
        areCoprime(7, 1, 49);
    }

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @return whether they are coprime
     */
    public static boolean areCoprime(int a, int b, int c) {
        //put your code here
        return compare(euclid(a), euclid(b), euclid(c));
    }

    private static int[] euclid(int a)
    {
        int[] values = new int[10];
        int values_head = 0;

        while(a != 1)
        {
            for(int i = 2; i < 100; i++)
            {
                if(a % i == 0)
                {
                    values[values_head] = i;
                    values_head++;
                    a /= i;
                    break;
                }
            }
        }
        return values;
    }

    private static boolean compare(int[] a, int[] b, int[] c)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b.length; j++)
            {
                for(int k = 0; k < c.length; k++)
                {
                    if((a[i] == b[j] || b[j] == c[k] || a[i] == c[k]) && c[k] != 0 && a[i] != 0 && b[j] != 0)
                    {
                        return false;
                    }
                    if(a[i] == c[k] && a[i] != 0 && c[k] != 0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

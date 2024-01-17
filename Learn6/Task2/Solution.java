class Solution {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @param d the positive number.
     * @return their greatest common divisor
     */
    public static int getResult(int a, int b, int c, int d) {
        //put your code here
        int[] a_values = euclid(a);
        int[] b_values = euclid(b);
        int[] c_values = euclid(c);
        int[] d_values = euclid(d);

        
        return euclid(a_values, b_values, c_values, d_values);
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

    private static int euclid(int[] a, int[] b, int[] c, int[] d)
    {
        int[] values = new int[10];
        int values_head = 0;
        int answer = 1;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b.length; j++)
            {
                for(int k = 0; k < c.length; k++)
                {
                    for(int l = 0; l < d.length; l++)
                    {
                        if(a[i] != 0 && b[j] != 0 && c[k] != 0 && d[l] != 0)
                        {
                            if(a[i] == b[j] && b[j] == c[k] && c[k] == d[l])
                            {
                                values[values_head] = a[i];
                                a[i] = 0;
                                b[j] = 0;
                                c[k] = 0;
                                d[l] = 0;
                                values_head++;
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i < values_head; i++)
        {
            answer = answer * values[i];
        }

        return answer;
    }

}

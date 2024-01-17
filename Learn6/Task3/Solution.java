class Solution {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @return their least common multiple
     */
    public static int getResult(int a, int b, int c) {
        //put your code here
        int[] a_values = euclid(a);
        int[] b_values = euclid(b);
        int[] c_values = euclid(c);
 
        return getLcm(a_values, b_values, c_values);
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 56;
        int c = 36;
        System.out.println(getResult(a, b, c));
    }

    public static int getLcm(int a, int b) {
        //put your code here
        return 1;
    }

    private static int[] euclid(int a)
    {
        int[] values = new int[50];
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

    private static int getLcm(int[] a, int[] b, int[] c)
    {
        int[] values = new int[50];
        int values_head = 0;
        int answer = 1;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b.length; j++)
            {
                for(int k = 0; k < c.length; k++)
                {
                    if(a[i] == b[j] && b[j] == c[k] && a[i] != 0 && b[j] != 0 && c[k] != 0)
                    {
                        values[values_head] = a[i];
                        values_head++;
                        a[i] = 0;
                        b[j] = 0;
                        c[k] = 0;
                    }
                }
            }
        }

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b.length; j++)
            {
                for(int k = 0; k < c.length; k++)
                {
                    if(a[i] == b[j] && a[i] != 0 && b[j] != 0)
                    {
                        values[values_head] = a[i];
                        values_head++;
                        a[i] = 0;
                        b[j] = 0;
                    }
                    else if(a[i] == c[k] && a[i] != 0 && c[k] != 0)
                    {
                        values[values_head] = a[i];
                        values_head++;
                        a[i] = 0;
                        c[k] = 0;
                    }
                    else if(b[j] == c[k] && b[j] != 0 && c[k] != 0)
                    {
                        values[values_head] = b[j];
                        values_head++;
                        b[j] = 0;
                        c[k] = 0;
                    }
                }
            }
        }

        for(int i = 0; i < a.length; i ++)
        {
            if(a[i] != 0)
            {
                values[values_head] = a[i];
                values_head++;
            }
        }

        for(int i = 0; i < b.length; i ++)
        {
            if(b[i] != 0)
            {
                values[values_head] = b[i];
                values_head++;
            }
        }

        for(int i = 0; i < c.length; i ++)
        {
            if(c[i] != 0)
            {
                values[values_head] = c[i];
                values_head++;
            }
        }

        for(int i = 0; i < values_head; i++)
        {
            answer = answer * values[i];
        }
        return answer;
    }
}


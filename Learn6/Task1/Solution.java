class Solution {

    public static void main(String[] args) {
        int gcd = euclid(6, 8);
        System.out.println(gcd);
    }

    /**
     * @param x the positive number.
     * @param y the positive number.
     * @return their greatest common divisor and the least common multiple
     */
    public static int[] getResults(int x, int y) {
        int gcd = euclid(x, y);
        int lcm = getLcm(x, y, gcd);
        return new int[]{gcd, lcm};
    }
    
    private static int euclid(int a, int b) {
        //put your code here
        int a_values[] = euclid(a);
        int b_values[] = euclid(b);

        
        return euclid(a_values, b_values);
    }

    private static int[] euclid(int a)
    {
        int[] values = new int[100];
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

    private static int euclid(int[] a, int[] b)
    {
        int[] values = new int[100];
        int values_head = 0;
        int answer = 1;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b.length; j++)
            {
                if(a[i] == b[j] && a[i] != 0)
                {
                    values[values_head] = a[i];
                    a[i] = 0;
                    b[j] = 0;
                    values_head++;
                    break;
                }
            }
        }

        for(int i = 0; i < values_head; i++)
        {
            answer = answer * values[i];
        }

        return answer;
    }

    private static int getLcm(int a, int b, int gcd) {
        //put your code here
        return (a * b) / gcd;
    }

}


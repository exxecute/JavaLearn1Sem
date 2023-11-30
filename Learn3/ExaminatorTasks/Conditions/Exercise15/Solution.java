import java.util.Locale;
import java.util.Scanner;

class Solution 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            int minab = (a > b) ? b : a;
            int mincd = (c > d) ? d : c;
            int maxabcd = (minab > mincd) ? minab : mincd;

            System.out.printf("%d", maxabcd);
        }
    }    
}

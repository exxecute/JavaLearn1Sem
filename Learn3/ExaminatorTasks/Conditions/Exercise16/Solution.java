import java.util.Locale;
import java.util.Scanner;

class Solution 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            float a, b, c, d;
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
            d = sc.nextFloat();

            float da = d - a;
            float db = d - b;
            float dc = d - c;

            float max = (da > db) ? da : db;
            max = (max > dc) ? max : dc;

            System.out.printf("%.3f", max);
        }
    }    
}

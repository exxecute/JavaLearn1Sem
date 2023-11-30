import java.util.Locale;
import java.util.Scanner;

class Solution 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            float a = sc.nextFloat(); 

            float answer = a >= 0 ? a * a : a * a * a * a;

            System.out.printf("%.3f", answer);
        }
    }    
}

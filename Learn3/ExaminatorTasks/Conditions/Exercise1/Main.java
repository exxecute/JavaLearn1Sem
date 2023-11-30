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
            float b = sc.nextFloat();

            int answer = (a >= b) ? 8 : 7;

            System.out.printf("%d", answer);
        }
    }    
}

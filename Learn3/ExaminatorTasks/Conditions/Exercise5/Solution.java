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
            float x = sc.nextFloat();

            float answer = a * x + b;

            answer = (answer < 0) ? -answer : answer;

            System.out.printf("%.3f", answer);
        }
    }    
}

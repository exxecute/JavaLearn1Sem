import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            float a = sc.nextFloat(); 
            float b = sc.nextFloat(); 
            float c = sc.nextFloat(); 

            int answer = 0;
            answer = a < 0 ? ++answer : answer;
            answer = b < 0 ? ++answer : answer;
            answer = c < 0 ? ++answer : answer;

            System.out.printf("%d", answer);
        }
    }    
}

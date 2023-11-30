import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int h = sc.nextInt(); 
            int m = sc.nextInt(); 

            boolean answer =  ((0 <= h && h < 24) && (0 <= m && m < 60));

            System.out.printf("%s", answer);
        }
    }    
}

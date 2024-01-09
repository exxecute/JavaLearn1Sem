import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int d = sc.nextInt(); 

            for(int i = 0; i < 10; i++)
            {
                System.out.printf("%d ", d * i);
            }
        }
    }    
}

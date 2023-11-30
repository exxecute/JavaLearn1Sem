import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int a = sc.nextInt(); 
            int b = sc.nextInt();

            int answer = (a < b) ? a : b;

            System.out.println(answer);
        }
    }    
}

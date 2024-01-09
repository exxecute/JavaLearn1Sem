import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();
            int answer = 0;
            for(int i = 0; i < n + 1; i++)
            {
                answer += i * i;
            }
            System.out.println(answer);
        }
    }    
}

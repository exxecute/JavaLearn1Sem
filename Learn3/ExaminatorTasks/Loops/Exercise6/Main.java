import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int value = 0;
            int answer = 0;
            do
            {
                value = sc.nextInt();
                answer += value % 2 == 0 ? 0 : 1;
            }
            while (value != 0);
            System.out.println(answer);
        }
    }    
}

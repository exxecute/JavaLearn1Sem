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
            int c = sc.nextInt(); 
            int k = sc.nextInt();

            boolean answera, answerb, answerc;
            answera = (a%k) == 0;
            answerb = (b%k) == 0;
            answerc = (c%k) == 0;

            System.out.printf("%s %s %s", answera, answerb, answerc);
        }
    }    
}
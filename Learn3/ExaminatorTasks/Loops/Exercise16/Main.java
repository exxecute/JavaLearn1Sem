
import java.util.Locale; 
import java.util.Scanner; 

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            long n = sc.nextLong();
            long x = 0;
            int answer = 0;

            while(n > 10)
            {
                x = n % 10;
                if(x % 2 == 0)
                {
                    answer++;
                }
                n /= 10;
            }

            if(n % 2 == 0)
            {
                answer++;
            }

            System.out.println(answer);
        }
    }
}

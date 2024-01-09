import java.util.Locale; 
import java.util.Scanner; 

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();
            long fact = 1;

            for(int i = 1; i <= n; i++)
            {
                fact *= i;
            }
            System.out.println(fact);
        }
    }
}

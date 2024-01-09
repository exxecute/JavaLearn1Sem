
import java.util.Locale; 
import java.util.Scanner; // not done

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            long n = sc.nextLong();
            while(n > 10)
            {
                n /= 10;
                // System.out.println(n);
            }
            System.out.println(n);
        }
    }
}

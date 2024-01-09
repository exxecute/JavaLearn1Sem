
import java.util.Locale; 
import java.util.Scanner; 

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            String n = sc.nextLine();

            String x1 = n.substring(0, n.length() / 2);
            String x2 = n.substring(n.length() / 2);
    
            System.out.println(Integer.parseInt(x1) + " " + Integer.parseInt(x2));
        }
    }
}

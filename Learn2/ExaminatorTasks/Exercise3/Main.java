import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
    {
		try (Scanner sc = new Scanner(System.in)) 
        {
			double length = sc.nextDouble();
            double width = length / 2.0;

			double avg = length * width;

			// do not change the next line
			System.out.printf("%.1f", avg);
		}
	}
}

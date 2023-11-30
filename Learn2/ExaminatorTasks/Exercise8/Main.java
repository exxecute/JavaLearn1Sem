import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
    {
		try (Scanner sc = new Scanner(System.in)) 
        {
            int hours, minutes, seconds;

			seconds = sc.nextInt();

            hours = seconds / 3600;
            minutes = (seconds % 3600) / 60;
            seconds = (seconds % 3600) % 60;

			System.out.printf("%d %d %d", hours, minutes, seconds);
		}
	}

}

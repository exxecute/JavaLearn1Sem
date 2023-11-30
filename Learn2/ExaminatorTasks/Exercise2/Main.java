import java.util.Scanner;

//Given two integer numbers a and b. 
//Calculate and output their average value to 3 decimal places. 

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// do not change the code above

			// change this code
			double avg = (a + b) / 2.0;

			// do not change the next line
			System.out.printf("%.3f", avg);
		}

	}

}

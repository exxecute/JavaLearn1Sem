import java.util.Locale;
import java.util.Scanner;

//Given two floating point numbers a and b. 
//Calculate and output their average value to 3 decimal places. 

class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("EN"));
		try (Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble(); 
			double b = sc.nextDouble();
			//do not change the code above
			
			//change this code
			double avg = (a+b)/2;
			
			//do not change the next line
      System.out.printf("%.3f", avg);
    }
	}
}
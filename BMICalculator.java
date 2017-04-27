import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;

		System.out.print( "Your height(feet only): " );
		m = keyboard.nextDouble();
		System.out.print( "Your height(inches only): " );
		m = (((m*12) + keyboard.nextDouble())*.0254);

		System.out.print( "Your weight in pounds: " );
		kg = ((keyboard.nextDouble())/2.20462);

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}
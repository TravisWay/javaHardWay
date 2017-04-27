import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name,ssn;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		//Will accept a number
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		//Will accept any number
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		//Will accept any number
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		System.out.println();
		System.out.println("We're not done yet.  What is your social security number?");
		ssn=keyboard.next();
		System.out.println( ssn + "? Yeah, I wouldnt give me that either." );
		
		
		
	}	
}	
import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		pin = 12345;
	
		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		String entry1 = keyboard.nextLine();
		
		while(! entry1.equals("Please")){
		System.out.println("\nINCORRECT PASS. TRY AGAIN.");
		System.out.print("ENTER YOUR PASS: ");
		entry1 = keyboard.nextLine();	
		}
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
	
		while ( entry != pin ) {
		System.out.println("\nINCORRECT PIN. TRY AGAIN.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		}
	
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}
import java.util.Scanner;

public class WhoGoesThere {
	
	public static void main (String [] args) {
		
		String firstName, lastName;
		int age=0;

		//scanner here - is a class/object and inputDevice - a variable (object)
		// Here we declare a variable and initialize it - new - allocates memory for the variable
		Scanner inputDevice=new Scanner(System.in); // System is object, and shows which type of device - in or out
		
		System.out.println("\n\tHello! What is your first name?");
		firstName= inputDevice.nextLine();
		System.out.println("\n\t What is your last name?");
		lastName=inputDevice.nextLine();
		System.out.println("\n\t What is your age?");
		age=inputDevice.nextInt();
		
		System.out.println("Hello, "+ 
		"As long as you are over the age of " +(age-10) +", \nthen you are free to pass! "+	firstName+ " " +lastName +"!");
	}
}
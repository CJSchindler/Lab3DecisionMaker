package PkgLab3DecisionMaker;

import java.util.Scanner;

public class DecisionMaker {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		int i;
		String userName;
		boolean isValid;
		char a;
		
		System.out.println("Please enter your name:");
		userName = scnr.next();
		
		do {
		
			do {
				System.out.println(userName + ", Please enter an integer between 1 and 100: "); // requests input from user
				i = scnr.nextInt(); // assigns user input value to int i
				
				isValid = ((i > 0) && (i < 101)); //checks for validity of int i
				
				if (!isValid) { //if integers are not in range, asks user to try again
					System.out.println(userName + ", That integer is not valid. Please try again.");
				}
						
			} while (!isValid); //if integer is valid, then move to the next step
		
		
			if (i % 2 == 0) {
				
				if (i < 26) {
					System.out.println("Even and less than 25. Isn't that great, " + userName + "?");
				} 
				else if (i < 61) {
					System.out.println("Even, " + userName + ".");
				} 
				else {
					System.out.println(i + " Even, " + userName + ".");
				}
				
				
			} 
			else {
				if (i > 60) {
					System.out.println(i + " Odd and over 60, " + userName + ".");
				} 
				else {
					System.out.println(i + " Odd, " + userName + ".");
				}
			}
		
			System.out.println("\nDo you want to continue, " + userName + "? y/n");
			a =  scnr.next().charAt(0);
		
		} while ((a == 'y') || (a == 'Y'));
		
		System.out.println("Goodbye.");
		
		scnr.close();

	}

}

//Lauren Shindo

package PkgTableOfPowers;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		int userInt;
		String a = ""; // this variable will keep track of the user's answer to "continue?"
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Learn your squares and cubes!\n");
		
		do {
		
			System.out.println("Enter an integer:");
			userInt = scnr.nextInt();
			
			//print the header to the table
			System.out.println("\nNumber \t\tSquared \tCubed");
			System.out.println("====== \t\t======= \t=====");
			
			for (int i = 1; i <= userInt; i++) { 

				//print the number, the square, and the cube of i
				System.out.println(i + "\t\t" + i * i  + "\t\t" + i * i * i);
			}
			
			System.out.println("\nContinue? y/n");
			a = scnr.next();
		
		} while (a.equals("y"));
		
		System.out.println("\nGoodbye.");
		scnr.close();
	}

}

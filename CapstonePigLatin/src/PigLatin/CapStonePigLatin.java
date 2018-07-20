package PigLatin;
import java.util.Scanner;

public class CapStonePigLatin {

	public static void main(String[] args) {

		
		
		Scanner scnr = new Scanner(System.in);
		String userInput; //keeps track of the line the user enters
		char startLetter; //keeps track of the first letter in the word
		String answer; //keeps track of user's answer to "Do you want to play again?"
		
		
		System.out.println("Welcome to the Pig Latin Translator!"); // Welcomes user to the translator
		
		do {

			System.out.print("\nPlease enter a line to be translated: "); // Asks user to put in a line to be translated
			userInput = scnr.next().toLowerCase().trim(); // Assigns user-entered input to a String variable and converts to lower case with no whitespace
			userInput = userInput.replaceAll("[.\"?!']",""); //deletes some special characters from input 
			startLetter = userInput.charAt(0); //assigns the first letter in the word to the variable 'startLetter'
			
//				if (!(userInput.indexOf('@') == -1)) { // does nothing with words that contain '@'
//					System.out.println(userInput);
//				}
			
			
				// if the word starts with a vowel, apply the method for vowel-first words
				if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o' || startLetter == 'u') {
					System.out.println("\nYour translation is: " + getPigLatinVowelFirstWord(userInput));
				}
				
				else { //if the word starts with a consonant, apply the method for consonant-first words
					System.out.println("\nYour translation is: " + getPigLatinConsFirstWord(userInput));
				}
			
				
			// Ask user if they want to translate another word
			System.out.print("\nWould you like to translate another line? (y/n)  ");
			answer = scnr.nextLine();
		
		
		} while (answer.toLowerCase().startsWith("y")); // Allow user to play until they quit
		
		
		System.out.println("\nGoodbye.");
		
		scnr.close();
		
	}
	
	// method for vowel-first words
	public static String getPigLatinVowelFirstWord(String vowelWord) {
		return vowelWord + "way";
	}
	
	// method for consonant-first words
		public static String getPigLatinConsFirstWord(String consonantFirstWord) {
			int i = getFirstVowelIndex(consonantFirstWord);
			return (consonantFirstWord.substring(i) + consonantFirstWord.substring(0, i) + "ay");
		}
		
	// method for finding the first vowel in a word
			public static int getFirstVowelIndex(String userWord) {
				
				int i = 0; //for counting iterations of a loop
				for(i = 0; i < userWord.length(); i++) {  //goes through the word index by index until a vowel is found, and returns the index of the vowel
				     
					if(userWord.charAt(i) == 'a') {
						break;
					}
					else if (userWord.charAt(i) == 'e') {
						break;	
					}
					else if (userWord.charAt(i) == 'i') {
						break;	
					}
					else if (userWord.charAt(i) == 'o') {
						break;	
					}
					else if (userWord.charAt(i) == 'u') {
						break;	
					}
					else {
						
					}
				}
					
				return i;
			}
	

}

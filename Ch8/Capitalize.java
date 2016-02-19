package javaCh8;

import acm.program.*;
/**
 * File : Capitalize.java
 * ----------------------
 * Console program converts user entered words into lower case form 
 * with capitalized first letter.
 * -All other letters in word are lower case except first letter.
 * -Returned string has the same format regardless of how it is entered.
 */
public class Capitalize extends ConsoleProgram {
	
	public void run() {
		println("This program will capitalize words.");
		println();
		while (true) {
			input();
		}	
	}
	/**
	 * Capitalizes the first letter of String and all following letters
	 * are returned as lower case.
	 * @param word String that is entered by user.
	 * @return Returns String of word provided wit the same format.
	 */
	private String capitalize(String word) {
		String newWord = word.toLowerCase();
		String result = "";
		// Formats the String character by character to adjust caps.
		for (int i = 0; i < newWord.length(); i++) {
			char ch = newWord.charAt(i);
			if (i == 0) {
				result += Character.toUpperCase(ch);
			} else {
				result += Character.toLowerCase(ch);
			}
		}
		return result;
	}
	/**
	 * Displays prompt and gives String a value.
	 */
	private void input() {
		String word = readLine("Enter any word: ");
		println();
		println(capitalize(word));
		println();
	}
}
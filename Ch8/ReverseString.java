package javaCh8;

import acm.program.*;
/**
 * File : ReverseString.java
 * -------------------------
 * Console program reverses a String character by character.
 */
public class ReverseString extends ConsoleProgram {
	// Private constants.
	private String result = "";
	
	public void run() {
		println("This program will reverse the word entered.");
		println();
		String word = readLine("Please enter a word: ");
		println(word + " reversed is " + reverseString(word) + ".");
	}
	/**
	 * Reverses String character by character.
	 * @param word User input that will be reversed.
	 * @return Returns String with characters in reverse order.
	 */
	private String reverseString(String word) {
		for (int i = 0; i < word.length(); i++) {
			result = word.charAt(i) + result; 
		}
		return result;
	}
}
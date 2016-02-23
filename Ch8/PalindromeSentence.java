package javaCh8;

import acm.program.*;
/**
 * File : PalindromeSentence.java
 * ------------------------------
 * Console program determines if a sentence entered by user is a Palindrome sentence, 
 * which is defined as a sentence that can be read identically forward and backwards.
 * -Program can ignore punctuation and case sensitivity.
 */
public class PalindromeSentence extends ConsoleProgram {
	// Private constants.
	private String sentence;
	private String word;
	
	public void run() {
		intro();
		while (true) {
			sentence = readLine("Enter a sentence: ");
			word = convert(sentence);
			if (isPalindrome(word)) {
				println("That sentence IS a palindrome!");
				println();
			} else {
				println("That sentence is NOT a palidrome.");
				println();
			}
		}	
	}
	/**
	 * Displays the introduction for the program.
	 */
	private void intro() {
		println("This program checks for sentence palindromes.");
		println("Indicate the end of the sentence with RETURN key.");
		println();
	}
	/**
	 * Converts the String entered by user into one single word that consists
	 * of only letters and digits.
	 * @param sentence String entered by the client.
	 * @return Returns String with only letters and digits all in lower case.
	 */
	private String convert(String sentence) {
		word = "";
		// Generates new string one character at a time with only digits and letters. 
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				word += ch;
			}
		}
		return word.toLowerCase();
	}
	/**
	 * Determines if word is a palindrome by comparing letters from each end.
	 * @param word String consisting of only letters and digits.
	 * @return Returns true if word is palindrome, otherwise returns false.
	 */
	private boolean isPalindrome(String word) {
		int length = word.length();
		while (true) {
			for (int i = 0; i < length; i++) {
				char chFront = word.charAt(i);
				char chEnd = word.charAt((length - 1) - i);
				if (chFront != chEnd) {
					return false;
				}
			}
			return true;
		}
	}
}
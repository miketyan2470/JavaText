package javaCh8;

import acm.program.*;
/**
 * File Palindrome.java
 * --------------------
 * Console program tests boolean method isPalindrome() to see if a given word
 * is a word that can read identically both backwards and forward.
 * -Method disregards case sensitivity.
 * -Int and Char are both acceptable forms of entry.
 * -Returns true or false.
 */
public class Palindrome extends ConsoleProgram {
	// Private constants for testing.
	private static final String TEST1 = "CIVIC";
	private static final String TEST2 = "FALSE";
	private static final String TEST3 = "RACEcar";
	private static final String TEST4 = "12321";
	private static final String TEST5 = "rat12321tar";
	
	public void run() {
		println(isPalindrome(TEST1));
		println(isPalindrome(TEST2));
		println(isPalindrome(TEST3));
		println(isPalindrome(TEST4));
		println(isPalindrome(TEST5));
	}
	/**
	 * Determines if word is identical both forward and backwards.
	 * @param word String to be tested.
	 * @return Returns true if word is palindrome, otherwise false.
	 */
	private boolean isPalindrome(String word) {
		word = word.toLowerCase();
		int length = word.length();
		while (true) {	
			for (int i = 0; i < length / 2; i++) {
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
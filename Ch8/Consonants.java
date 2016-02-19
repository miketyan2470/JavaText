package javaCh8;

import acm.program.*;
/**
 * File : Consonants.java
 * ----------------------
 * Console program displays a list of UPPERCASE consonants.
 * -Implements boolean method isEnglishConsonant().
 * -Program recognizes both lower and upper cases.
 */
public class Consonants extends ConsoleProgram {
	
	public void run() {
		println("This program displays a list of all UPPERCASE consonants.");
		println();
		// Loops for all letters from A to Z inclusive.
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			// Prints character if it is a consonant.
			if (isEnglishConsonant(ch)) {
				println(ch);
			}
		}
	}
	/**
	 * Determines if character is a consonant.
	 * @param ch Character to be compared.
	 * @return Returns true if character does NOT match cases within switch statement.
	 */
	private boolean isEnglishConsonant(char ch) {
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return false;
			default:
				return true;
		}
	}
}
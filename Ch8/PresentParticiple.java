package javaCh8;

import acm.program.*;
/**
 * File : PresentParticiple.java
 * -----------------------------
 * Console program determines which method to use in order to return the input as
 * a present participle. 
 * -If word ends in an 'e' preceded by a consonant, the 'e' is removed before adding
 * 	'ing' suffix.
 * -If word ends in consonant preceded by a vowel, the last letter is repeated before
 *	adding the 'ing' suffix.
 */
public class PresentParticiple extends ConsoleProgram {
	// Private constants used to test different scenarios.
	private static final String TEST1 = "move";
	private static final String TEST2 = "see";
	private static final String TEST3 = "jam";
	private static final String TEST4 = "walk";
	private static final String TEST5 = "test";
	
	public void run() {
		println(createPresentParticiple(TEST1));
		println(createPresentParticiple(TEST2));
		println(createPresentParticiple(TEST3));
		println(createPresentParticiple(TEST4));
		println(createPresentParticiple(TEST5));
	}
	/**
	 * Changes string 'test' into present participle.
	 * @param test String that will be evaluated.
	 * @return Returns String that is the correct usage of it's present participle.
	 */
	private String createPresentParticiple(String test) {
		String word = test.toLowerCase();
		int index = test.length();
		char ch = test.charAt(index - 1);
		char ch2 = test.charAt(index - 2);
		if ((ch == 'e') && (isConsonant(ch2))) {
			int last = test.length() - 1;
			word = test.substring(0, last) + "ing";
		} else if ((isConsonant(ch)) && (isVowel(ch2))){
			word = test + test.charAt(index - 1) + "ing";
		} else {	
			word = test + "ing";
		}
		return word;
	}
	/**
	 * Determines if character is a consonant.
	 * @param ch Character to be compared.
	 * @return Returns true if character is not within listed vowels in switch statement.
	 */
	private boolean isConsonant(char ch) {
		switch(ch) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : return false;
			default : return true;
		}
	}
	/**
	 * Determines if character is a vowel.
	 * @param ch Character to be compared.
	 * @return Returns true if character is listed as a vowel, otherwise returns false.
	 */
	private boolean isVowel(char ch) {
		switch(ch) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : return true;
			default : return false;
		}
	}
}
package javaCh8;

import acm.program.*;
/**
 * File : Plural.java
 * ------------------
 * Console program determines which method to use in order to return the input as a plural form.
 * -If word ends in 's', 'x', 'z', 'ch', or 'sh', then 'es' is added to the end.
 * -If word ends in 'y' and the letter preceding is a consonant, then change the 'y' to 'ies'.
 * -In all other cases, add 's' to the end.
 */
public class Plural extends ConsoleProgram {
	// Private constants used to test the different scenarios. 
	private static final String TEST1 = "test";
	private static final String TEST2 = "testy";
	private static final String TEST3 = "tests";
	private static final String TEST4 = "testey";
	private static final String TEST5 = "tesch";
	
	public void run() {
		println(createRegularPlural(TEST1));
		println(createRegularPlural(TEST2));
		println(createRegularPlural(TEST3));
		println(createRegularPlural(TEST4));
		println(createRegularPlural(TEST5));
	}
	/**
	 * Changes string 'test' into a plural version.
	 * @param test String that will be evaluated.
	 * @return Returns String that is the appropriate plural version of original word.
	 */
	private String createRegularPlural(String test) {
		// Disregards case sensitivity.
		String word = test.toLowerCase();
		int index = test.length();
		char ch = test.charAt(index - 1);
		char ch2 = test.charAt(index - 2);
		if ((ch == 's') || (ch == 'x') || (ch == 'z') || (ch == 'h') && (ch2 == 's') || (ch2 == 'c')) {
			word = test + "es";
		} else if ((ch == 'y') && (isConsonant(ch2))) {
			int last = test.length() - 1;
			word = test.substring(0, last) + "ies";
		} else {
			word = test + "s";
		}
		return word;
	}
	/**
	 * Determines if character is a consonant.
	 * @param ch Character to be compared.
	 * @return Returns true if any character other than those listed in switch statement.
	 */
	private boolean isConsonant(char ch) {
		switch(ch) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : return false;
			default : return true;
		}
	}
}
package javaCh8;

import acm.program.*;
import java.util.*;
/**
 * File : Acronym.java
 * -------------------
 * Console program breaks down a given string of words into an acronym.
 * -Program ignores symbols listed as DELIMITERS, so words separated by symbols
 * 	will be returned as two different words.
 */
public class Acronym extends ConsoleProgram {
	// Private constants.
	private static final String DELIMITERS = "-!@#$%^&*()_+={[}]:;\"'<,>.?/~`|\\ ";
	/**
	 * Runs program acronym.
	 */
	public void run() {
		println("This program generates an Acronym from a given sentence.");
		while (true) {
			String line = readLine("\nEnter a sentence: ");
			println("The acronym is " + getAcronym(line));
		}
	}
	/**
	 * Converts a line of strings into the acronym form.
	 * @param line String sentence input by user.
	 * @return Returns String as an acronym.
	 */
	private String getAcronym(String line) {
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (isWord(token)) {
				result += token.charAt(0);
			}
		}
		result = result.toUpperCase();
		return result;
	}
	/**
	 * Determines if a String is comprised of letters.
	 * @param token String taken from Tokenizer from user input line.
	 * @return Returns true if all characters in String are letters, false otherwise.
	 */
	private boolean isWord(String token) {
		for (int i = 0; i < token.length(); i++) {
			char ch = token.charAt(i);
			if (!Character.isLetter(ch)) return false;
		}
		return true;
	}
}
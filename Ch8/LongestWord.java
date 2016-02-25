package javaCh8;

import acm.program.*;
import java.util.*;
/**
 * File : LongestWord.java
 * -----------------------
 * Console program finds the longest word in a given sentence.
 */
public class LongestWord extends ConsoleProgram {
	/**
	 * Runs program in a loop until user exits.
	 */
	public void run() {
		println("This program finds the longest word in a sentence.");
		while (true) {
			String line = readLine("\nEnter a sentence: ");
			println(longestWord(line) + " is the longest word.");
		}	
	}
	/**
	 * Finds the longest word in a given line.
	 * @param line Line input by user.
	 * @return Returns String of the longest word in line.
	 */
	private String longestWord(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line);
		String longestWord = "";
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.length() > longestWord.length()) {
				longestWord = token;
			}
		}
		return longestWord;
	}
}
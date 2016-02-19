package javaCh8;

import acm.program.*;
import acm.util.*;
/**
 * File : RandomWords.java
 * -----------------------
 * Console program generates random words.
 * -Length of words are defined by constants MIN_LETTERS and MAX_LETTERS.
 * -Number of words generated are based on user input.
 */
public class RandomWords extends ConsoleProgram {
	// Private constants.
	private static final int MIN_LETTERS = 5;
	private static final int MAX_LETTERS = 15;
	// Initializes random generator rgen.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	/**
	 * Runs program starting with informative line to describe program function.
	 */
	public void run() {
		println("This program generates random words.");
		println();
		int words = readInt("Please enter how many words to generate: ");
		println();
		for (int i = 0; i < words; i++) {
			int length = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
			println(randomWord(length));
		}
	}
	/**
	 * Generates a random String based on parameter length.
	 * @param length Integer value of length of word to be generated.
	 * @return Returns a String of randomly generated characters.
	 */
	private String randomWord(int length) {
		String word = "";
		for (int i = 0; i < length; i++) {
			char ch = (char)rgen.nextInt('a', 'z');
			word += ch;
		} 
		return word;
	}
}
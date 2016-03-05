package javaCh11;

import acm.program.*;
/**
 * File : LetterFrequence.java
 * ---------------------------
 * Console program creates a table to show letter frequency in a paragraph of input text.
 * As shown in figure 11-8 in "Art and science of Java by Eric S. Roberts".
 * - A blank line is used to signal the end of paragraph.
 */
public class LetterFrequency extends ConsoleProgram {
	// Private instance variables.
	private int[] frequencyTable;
	/**
	 * Runs program.
	 */
	public void run() {
		println("This program counts letter frequency.\n");
		println("Enter a blank line to indicate the end of test.\n");
		initFrequencyTable();
		while (true) {
			String line = readLine();
			if (line.length() == 0) break;
			countLetterFrequencies(line);
		}
		printFrequencyTable();
	}
	/**
	 * Initializes the array that represents the frequency of letters.
	 */
	private void initFrequencyTable() {
		frequencyTable = new int[26];
		for (int i = 0; i < 26; i++) {
			frequencyTable[i] = 0;
		}
	}
	/**
	 * Adjusts the array according to frequency of letter appearances in a line.
	 * @param line String used to count letter frequency.
	 */
	private void countLetterFrequencies(String line) {
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (Character.isLetter(ch)) {
				int index = Character.toUpperCase(ch) - 'A';
				frequencyTable[index]++;
			}
		}
	}
	/**
	 * Prints the values of each element within the array.
	 */
	private void printFrequencyTable() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int index = ch - 'A';
			println(ch + ": " + frequencyTable[index]);
		}
	}
}
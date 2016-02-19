package javaCh8;

import acm.program.*;
/**
 * File : ScrabblePointCalculator.java
 * -----------------------------------
 * Console program calculates the point total for words played in Scrabble.
 * -Scores do not count any tile bonuses.
 * -Characters that are in lower case are considered to be blank tiles 
 * 	with '0' points.
 */
public class ScrabblePointCalculator extends ConsoleProgram {
	// Private instance variables.
	private String word;
	private int points;

	public void run(){
		intro();
		while (true) {
			word = readLine("Please enter a word: ");
			calculatePoints(word);
		}
	}
	/**
	 * Calculates the point value of word entered and displays in window.
	 * @param word String entered by user.
	 */
	private void calculatePoints(String word) {
		points = 0;
		// Runs each character of word through point system.
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			switch (ch) {
				case 'A': case 'E': case 'I': case 'L': case 'N': 
				case 'O': case 'R': case 'S': case 'T': case 'U': points += 1; break;
				case 'D': case 'G': points += 2; break;
				case 'B': case 'C': case 'M': case 'P': points += 3; break;
				case 'F': case 'H': case 'V': case 'W': case 'Y': points += 4; break; 
				case 'K': points += 5; break;
				case 'J': case 'X': points += 8; break; 
				case 'Q': case 'Z': points += 10; break;
				default: points += 0; break;
			}
		}
		println("The word '" + word + "' is worth " + points + " points in Scrabble.");
		println();
	}
	/**
	 * Displays the point values for each characters.
	 */
	private void intro() {
		println("This program calculates the points for words played in Scrabble.");
		println();
		println("Point values are as follows:");
		println("A, E, I, L, N, O, R, S, T, U - 1 Point.");
		println("D, G                         - 2 Points.");
		println("B, C, M, P                   - 3 Points.");
		println("F, H, V, W, Y                - 4 Points.");
		println("K                            - 5 Points.");
		println("J, X                         - 8 Points.");
		println("Q, Z                         - 10 Points.");
		println("Lower case letters represent blank tiles with 0 point value!");
		println();
	}
}
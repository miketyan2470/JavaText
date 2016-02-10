/*
 * File : ConsecutiveHeads.java
 * ----------------------------
 * Console program simulates a coin flip until the number of 'heads' is reached.
 * -Each result is displayed in a list.
 * -Final display will show how many times the coin was flipped.
 */

package javaCh6;

import acm.program.*;
import acm.util.*;

public class ConsecutiveHeads extends ConsoleProgram {

	public void run() {
		println("This program will display how many times a coin will be flipped");
		println("before a set number of 'heads' will come up.");
		println();
		//User inputs number 'heads' to stop program.
		int n = readInt("Enter how many 'heads' you wish flip: ");
		int heads = 0;
		int count = 0;
		println();
		//Loops until 'n' number of 'heads' is reached.
		while (heads < n) {
			count++;
			if (coinFlip()) {
				println("Heads!");
				heads += 1;
			} else {
				println("Tails!");
			}
		}
		//Displays final results including number of times coin was flipped.
		println();
		println("It took " + count + " flips to get " + n + "heads.");
	}
	//Boolean method coinFlip uses RandomGenerator to decide 'true' or 'false'.
	private boolean coinFlip() {
		boolean result = rgen.nextBoolean();
		return result;
		
	}
	//Generates a random number.
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
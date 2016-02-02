/*
 * File CardRank.java
 * ------------------
 * Program converts user given integer (between 1 and 13) into the 
 * rank in a deck of cards using the switch statement. 
 */

package javaCh4;

import acm.program.*;

public class CardRank extends ConsoleProgram {
	
	public void run() {
		println ("This program converts integers to card ranks.");
		int n = readInt ("Enter an integer between 1 and 13: ");
		switch (n) {
		case 1: println("Ace"); break;
		case 11: println("Jack"); break;
		case 12: println("Queen"); break;
		case 13: println("King"); break;
/*
 * Any value that does not match previous "Cases" will result in default action.
 */
		default: println(n); break;
		}
	}
}
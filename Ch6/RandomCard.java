/*
 * File: RandomCard.java
 * ---------------------
 * Console program generates a 'random' card of a standard 52 card deck.
 * -Two methods are used to generate the Rank and Suit.
 */

package javaCh6;

import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		println("This program displays a randomly chosen card.");
		println();
		println(getRank() + " of " + getSuit());
	}
	//Method getRank uses switch statement to return a value of 'A'
	//through 'k'.
	private String getRank() {
		int card = rgen.nextInt(1, 13);
		switch (card) {
			case 1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default: return ("" + card);
		}
	}	
	//Method getSuit uses switch statement to return one of four suits.
	private String getSuit() {
		int suit = rgen.nextInt(1, 3);
		switch (suit) {
			case 1: return "Spades";
			case 2: return "Hearts";
			case 3: return "Clubs";
			default: return "Diamonds";
		}
	}
	//Initializes instance variable for random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
/*
 * File : SlotMachine.java
 * -----------------------
 * Console program simulates a slot machine with three wheels.
 * -Starting bank and cost per pull can be adjusted.
 * -Winnings are calculated based on given chart.
 * -Winnings and bank are displayed each 'pull'.
 * -Program ends when bank reaches '0' or if user says so.
 */

package javaCh6;

import acm.program.*;
import acm.util.*;

public class SlotMachine extends ConsoleProgram {
	// Initializes constants STARTING_BANK and COST_PER_PULL.
	private static final int STARTING_BANK = 50;
	private static final int COST_PER_PULL = 1;
	private static final String YES_NO = "Please answer 'yes' or 'no'.";
	private int bank = STARTING_BANK;
	
	public void run() {
		println("Welcome to CS106A Slot Machine! Good Luck!");
		println();
		instructions();
		checkBank();
	}
	// Simulates the 'pull' of a slot machine lever.
	private void pullSlots() {
		// Simulates 'wheel spins' by generating three random numbers.
		String spin1 = spinWheel(rgen.nextInt(1, 6));
		String spin2 = spinWheel(rgen.nextInt(1, 6));
		String spin3 = spinWheel(rgen.nextInt(1, 6));
		String result = spin1 + " - " + spin2 + " - " + spin3;
		// Calls method winnings() to convert into values towards bank.
		int payout = winnings(spin1, spin2, spin3);
		// Displays results to user.
		if (payout != 0) {
			println(result + " -- You win $" + payout);
			bank += payout;
		} else {
			println(result + " -- You lose");
		}
	}
	// Calculates winnings based on String parameters entered and returned as integer.
	private int winnings(String spin1, String spin2, String spin3) {
		// Calls method convertSpins() to convert String to Integer.
		int n1 = convertSpins(spin1);
		int n2 = convertSpins(spin2);
		int n3 = convertSpins(spin3);
		// Calculates winnings that are returned as integers.
		if ((n1 + n2 + n3) % 10 == 1) return 2;
		if ((n1 + n2 + n3) % 10 == 2) return 5;
		switch (n1 + n2 + n3) {
			case 30000: return 250;
			case 3000: return 20;
			case 12000: return 20;
			case 300: return 14;
			case 10200: return 14;
			case 30: return 10;
			case 10020: return 10;
			case 3: return 7;
			default : return 0;
		}
	}
	// Assign parameter String into corresponding value, returns as integer.
	private int convertSpins(String str) {
		int value = 0;
		// Values give by power of 10 to distinguish total values.
		if (str.equals("BAR   ")) { 
			value = 10000;
		} else if (str.equals("BELL  ")) { 
			value = 1000;
		} else if (str.equals("PLUM  ")) {
			value = 100;
		} else if (str.equals("ORANGE")) { 
			value = 10;
		} else if (str.equals("LEMON ")) {
			value = 0;
		} else if (str.equals("CHERRY")) {
			value = 1; 
		}
		return value;
	}
	// Assigns parameter integer with corresponding String that is returned.
	private String spinWheel(int n) {
		switch (n) {
			case 1 : return "CHERRY";
			case 2 : return "LEMON ";
			case 3 : return "ORANGE";
			case 4 : return "PLUM  ";
			case 5 : return "BELL  ";
			case 6 : return "BAR   ";
			default : return "ERROR";
		}		
	}
	// Decides if user has enough funds to continue.
	private void checkBank() {
		// Loops as long as user does not enter 'no'.
		while (true) {
			// Determines if user has enough funds to continue.
			if (bank > 0) {
				String answer = readLine("You have $" + bank + ". Ready to spin? : ");
				println();
				// Gives user a choice to continue or quit.
				if (answer.equals("yes")) {
					pullSlots();
					bank -= COST_PER_PULL;
				} else if (answer.equals("no")) {
					println("Ok, you walked away with $" + bank + ". Thank you for playing!");
					break;
				} else {
					println(YES_NO);
				}
			} else {
			println("Sorry, you have no money left. - GoodBye!");
			}
		}
	}
	// Displays instructions and pay outs upon user request.
	private void instructions() {
		println(YES_NO);
		String answer = readLine("Would you like instructions? : ");
		if (answer.equals("yes")) {
			println();
			println("Here are the rules:");
			println("Player starts with $50, each spin cost $1.");
			println("Game ends when player backrupts or quits.");
			println();
			println("Payouts:");
			println("BAR    - BAR    - BAR        = $250");
			println("BELL   - BELL   - BELL/BAR   = $20");
			println("PLUM   - PLUM   - PLUM/BAR   = $14");
			println("ORANGE - ORANGE - ORANGE/BAR = $10");
			println("CHERRY - CHERRY - CHERRY     = $7");
			println("CHERRY - CHERRY -            = $5");
			println("CHERRY -        -            = $2");
			println();
		} else if (answer.equals("no")) {
			println("OK, Have fun!!");
			println();
		} else {
			instructions();
		}
	}
	// Initializes instance variable RandomGenerator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
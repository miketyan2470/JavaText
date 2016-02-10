/*
 * File : RadioactiveDecay.java
 * ----------------------------
 * Console program simulates the decay of a group of atoms that have a half-life 
 * of one year.
 * -Displays the results after each year.
 * -User inputs starting value for atoms.
 */

package javaCh6;

import acm.program.*;
import acm.util.*;

public class RadioactiveDecay extends ConsoleProgram {
	//Initializes 'counter' and 'atoms'.
	private int counter = 0;
	private int atoms;
	
	public void run() {
		println("This program estimates the decay of a group of atoms with a half-life of one year.");
		println();
		atoms = readInt("Please enter the number of Atoms to start with: ");
		println();
		println("There are " + atoms + " atoms initially.");
		//Loops until there are no atoms left.
		while (atoms > 0) {
			//Keeps track of how many cycles.
			counter++;
			halfLife();
		}
	}
	//Simulates how many atoms will be left after a year.
	private void halfLife() {
		int total = 0;
		for (int i = 0; i < atoms; i++) {
			//Eliminates roughly 50% of atoms by calling random boolean.
			if (rgen.nextBoolean()) {
				total++;
			}
		}
		atoms = total;
		println("There are " + atoms + " atoms left at the end of year " + counter + ".");
	}
	//Initializes instance variable for random number generator. 
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
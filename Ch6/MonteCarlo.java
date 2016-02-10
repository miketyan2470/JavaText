/*
 * File : MonteCarlo.java
 * ----------------------
 * Console program uses the Monte Carlo Integration Technique to approximate the value 
 * of pi.
 * -Simulation run with 'darts' thrown at a circle on top of a square which both share
 * the same width.
 */

package javaCh6;

import acm.program.*;
import acm.util.*;

public class MonteCarlo extends ConsoleProgram {
	//Sets number of times dart is 'thrown'.
	private static final int DARTS_THROWN = 10000;
	private int hits = 0;
	
	public void run() {
		println("This program uses the 'Monte Carlo Integration technique to");
		println("simulate percentage of darts that will land on a dart board");
		println("with diameter that is equal to the width of 'square' is it");
		println("placed in front of.");
		println();
		//Cycles method 'throwDart' until DARTS_THROWN is met.
		for (int i = 0; i < DARTS_THROWN; i++) throwDart();
		//Sets value for 'pi'.
		double pi = (((double) hits / DARTS_THROWN) * 4);
		//Displays results of test run.
		println("The number of darts that hit were " + hits + " out of " + DARTS_THROWN + ".");
		println("Using the 'Monte Carlo technique', we can approximate pi to " + pi + ".");
	}
	//Method 'throwDart' simulates whether a thrown dart lands within the 'circle'.
	private void throwDart() {
		//Calls RandomGenerator to generate two doubles. 
		double x = rgen.nextDouble(-1, 1);
		double y = rgen.nextDouble(-1, 1);
		//Formula used to determine if dart 'hit' circle.
		if ((x * x) + (y * y) < 1.0) {
			hits++;
		}
	}
	//Initializes instance variable for random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
/*
 * File : AverageList.java
 * -----------------------
 * Program takes user input list of integers to find average signaling the 
 * end of list by entering "-1".
 */

package javaCh4;

import acm.program.*;

public class AverageList extends ConsoleProgram {
	
	public void run() {
		println ("This program averages a list of integers.");
		println ();
		println ("Enter values, one per line, using " + SENTINEL);
		println ("to singal the end of the list.");
		int total = 0;
		int count = 0;
		for (count = 0; total != -1; count++) { // Value set at 0 to compensate for loop-and-a-half.
			int value = readInt(" ? ");
			if (value == SENTINEL) break; // Stops loop once user enters "-1".
			total += value;
		}
		println ("The average is " + (total / count));
	}
	private static final int SENTINEL = -1; // Sets constant SENTINEL at "-1" to prevent break if user enters "0" as value.
}
/*
 * File : LargestInteger.java
 * --------------------------
 * Program will determine the largest integer from list inputed by user. Values are
 * entered one at a time and value of '0' will signal end of list. 
 * -SENTINEL used to break loop.
 */

package javaCh4;

import acm.program.*;

public class LargestInteger extends ConsoleProgram {
	
	private static final int SENTINEL = 0; // SENTINEL constant defined as '0'.
	
	public void run() {
		println ("This program finds the largest integer in a list.");
		println ();
		println ("Enter values, one per line, using a '0' to signal");
		println ("the end of the list.");

		int n2 = 1; // Initializing value of n2.
		
		while (true) {
			int n1 = readInt (" ? ");
			if (n1 >= n2) { // Compares each value and determines which is larger. 
				n2 = n1; // Larger of two values will be saves as n2, statement loops.
			} 
			if (n1 == SENTINEL) break; // Ends loop once value entered is equal to SENTINEL.
		}
		println ("The largest integer is " + n2 + ".");
	}
}
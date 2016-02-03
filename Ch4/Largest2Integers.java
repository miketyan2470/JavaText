/*
 * File : Largest2Integers.java
 * ----------------------------
 * Program finds the two largest integers in a list provided by user.
 * -Values are entered one at a time with '0' used as SENTINEL to signal
 * end of list.
 */

package javaCh4;

import acm.program.*;

public class Largest2Integers extends ConsoleProgram {
	
	private static final int SENTINEL = 0; // Sets constant SENTINEL as '0'.
	
	public void run() {
		println ("This program finds the 2 largest integers in a given list.");
		println ();
		println ("Enter values, one per line, using a '0' to signal");
		println ("the end of the list.");
		
		int n2 = 1; // Initializes value for n2 and n3
		int n3 = 1;
		
		while (true) {
			int n1 = readInt (" ? ");
			if (n1 > n3) {
				n2 = n3;
				n3 = n1;
			} else {
				if (n1 > n2) {
					n2 = n1;
				}
			}	
			if (n1 == SENTINEL) break; // Breaks loop when user enters 0
		}
		println ("The largest integer is " + n3 + ".");
		println ("The second largest integer is " + n2 + ".");
	}
}
/*
 * File AddIntegersList.java
 * -------------------------
 * Program takes user entered integers and continues to add to total 
 * until user ends loop by entering "0".
 */

package javaCh4;

import acm.program.*;

public class AddIntegersList extends ConsoleProgram {
	
	public void run() {
		println("This program adds a list of integers.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		int total = 0;
		while (true) {
			int value = readInt(" ? ");
			if (value == SENTINEL) break;
			total += value;
		}
		println ("The total is " + total + ".");
	}
	/* Specifies value for SENTINEL */	
	private static final int SENTINEL = 0;
}


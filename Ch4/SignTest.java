/*
 * File SignTest.java
 * ------------------
 * Program will classify an integer provided by user into either a positive
 * number, a negative number, or if the number is 0.
 */

package javaCh4;

import acm.program.*;

public class SignTest extends ConsoleProgram {
	
	public void run() {
		println ("This program will classify an integer based on its sign.");
		int n = readInt ("Enter integer: ");
		if (n > 0) {
			println (n + " is a positive integer.");
		} else if (n == 0) {
			println ("The number is Zero.");
		} else {
			println (n + " is a negative integer.");
		}
	}
}
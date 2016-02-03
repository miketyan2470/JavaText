/*
 * File : FibonacciSequence.java
 * -----------------------------
 * Program lists the Fibonacci Sequence up to the number provided by user.
 */

package javaCh4;

import acm.program.*;

public class FibonacciSequence extends ConsoleProgram {
	
	public void run() {
		println ("This program will list Fibonacci Sequences.");
		println ();
		int n = readInt ("Please enter number of sequences: ");
		println ();
		int f1 = 0; // Initializes starting value of 'f1'.
		int f2 = 1; // Initializes starting value of 'f2'.
		println ("F0 = 0");
		println ("F1 = 1");
		for (int i = 2; i <= (n - 1); i++) { // Repeats until user input length of list. 
			int f = f1 + f2;
			println ("F" + i + " = " + f);
			f1 = f2; // Reassigns value for next cycle.
			f2 = f; // Reassigns value for next cycle.
		}
	}
}
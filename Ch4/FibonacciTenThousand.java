/*
 * File : FibonacciTenThousand.java
 * --------------------------------
 * Program calculates and lists the Fibonacci Sequence as long as the value is under
 * ten thousand. 
 */

package javaCh4;

import acm.program.*;

public class FibonacciTenThousand extends ConsoleProgram {
	
	public void run() {
		println ("This program lists the Fibonacci Sequences that are less than 10,000.");
		println ();
		int f = 0;
		int f1 = 0;
		int f2 = 1;
		println ("F0 = 0");
		println ("F1 = 1");
		for (int i = 2; f <= 10000; i++) {
			f = f1 + f2;
			if (f < 10000) { // 'if' statement to prevent listing final value which is over 10000.
				println ("F" + i + " = " + f);
			f1 = f2;
			f2 = f;
			} else {
				break; // Breaks loop once value is higher than 10000.
			}
		}
	}
}
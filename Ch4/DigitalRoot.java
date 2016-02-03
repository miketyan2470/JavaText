/*
 * File : DigitalRoot.java
 * -----------------------
 * Program takes user input integer and calculates digital root, the sum of all digits
 * until a single digit is reached.
 */

package javaCh4;

import acm.program.*;

public class DigitalRoot extends ConsoleProgram {
	
	public void run() {
		println ("This program will find the Digital Root of a positive integer.");
		println ();
		int n = readInt ("Please enter a POSITIVE integer: ");
		int dsum = 0; // Initializes value for 'dsum'.
		while (true) { 
			while (n > 0) { // Adds digits for 'n'.
				dsum += (n % 10);
				n /= 10;
			}
			if (dsum < 10) {
				break; // Stops loop once 'dsum' is down to single digit.
			} else {
			n = dsum;
			dsum = 0;
			}
		}
		println ("The Digital root is: " + dsum);
	}
}
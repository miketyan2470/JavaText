/*
 * File : DigitSum.java
 * --------------------
 * Program adds the digits of user provided positive integer by using a while loop
 * that finds the value for each digit by diving by 10 each cycle.
 */

package javaCh4;

import acm.program.*;

public class DigitSum extends ConsoleProgram {
	
	public void run() {
		println("This program sums the digits of a positive integer.");
		int n = readInt("Please enter a POSITIVE integer: ");
		int dsum = 0; //Gives dsum a initializing value.
		while (n > 0) { 
			dsum += (n % 10); //Using remainder to determine value of single digit.
			n /= 10; //Resets value of n by removing the last digit.
		}
		println("The sum of the digits is " + dsum + ".");
	}
}
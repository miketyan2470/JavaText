/*
 * File : ReverseInteger.java
 * --------------------------
 * Program takes user given integer and breaks apart each digit, which is then
 * pieced back together in reverse order. 
 */

package javaCh4;

import acm.program.*;

public class ReverseInteger extends ConsoleProgram {
	
	public void run() {
		println ("This program will reverse the order of digits in an integer.");
		println ();
		int number = readInt ("Enter the value of integer to be reversed: ");
		int reverse = 0; // Initialized value for 'reverse'.
		while (number > 0) { 
			int digit = (number % 10); // Breaks 'number' down into each digit.
			number /= 10;
			reverse = (reverse * 10) + digit; // Builds 'reverse' with each digit.
		}
		println ();
		println ("The reverse order is: " + reverse);
	}
}
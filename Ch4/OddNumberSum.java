/*
 * File : OddNumberSum.java
 * ------------------------
 * Program will calculate sum of odd integers starting with 1 for as 
 * many times as the user inputs.
 */

package javaCh4;

import acm.program.*;

public class OddNumberSum extends ConsoleProgram {
	
	public void run() {
		println ("This program will calculate the sum of consecutive odd integers starting with 1.");
		int n = readInt ("Please enter how many odd integers to add: ");
		int sum = 0; 
		for (int i = 1; n > 0; i += 2) { 
			sum += i;
			n--;
		}
		println ("The total is " + sum);
	}
}
/*
 * File : PerfectNumber.java
 * -------------------------
 * Program runs the integers 1 to 9999 to find Perfect Numbers.
 * -Perfect numbers found will be displayed.
 */

package javaCh5;

import acm.program.*;

public class PerfectNumber extends ConsoleProgram {
	
	public void run() {
		println("This program finds the Perfect Numbers that range from 1 to 9999.");
		println();
		//Loop runs every number between 1 - 9999 through isPerfect method.
		for (int i = 1; i < 10000; i++) {
			//Displays a perfect number if boolean method is returned as 'true'.
			if (isPerfect(i)) {
				println (i + " is a perfect number.");
			}
		}
	}
	
	private boolean isPerfect(int n) {
		//Initializes value for 'sum'.
		int sum = 0;
		//Brute-force algorithm used to find every divisor. 
		for (int i = 1; i < n; i++) {
			//Divisors are totalled up.
			if (n % i == 0) {
				sum += i;
			} 
		}
		//Returns 'true' if 'sum' of divisors are equal to original number 'n'.
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}
}
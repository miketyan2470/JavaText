/*
 * File : PrimeNumber.java
 * -----------------------
 * Program takes an integer and determines if it is a prime number.
 * -Method 'isPrime' uses brute-force algorithm to test every 
 * possible divisor.
 * -Divisor can not be higher than half the value of integer so the
 * user given integer is first dividing in half before running 
 * 'isPrime' method for better efficiency.
 */

package javaCh5;

import acm.program.*;

public class PrimeNumber extends ConsoleProgram {
	
	public void run() {
		println("This program checks if an integer is prime.");
		println();
		int n = readInt("Please enter an integer: ");
		if (isPrime(n)) {
			println(n + " is a prime number.");
		} else {
			println(n + " is NOT a prime number.");
		}
	}
	
	private boolean isPrime(int n) {
		//Brute-force loop used to try every possible divisor.
		for (int i = 2; i <= n / 2; i++) { 
			if (n % i == 0) {
				return false;
			} 
		}
		return true;
	}
}
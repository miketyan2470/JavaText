/*
 * File : Fibonacci.java
 * ---------------------
 * Program calculates the Fibonacci number of sequence provided by user.
 */

package javaCh5;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	public void run() {
		println("This program will calculate the 'n'th Fibonacci number.");
		println();
		int n = readInt("Please enter the ending Fibonacci Sequence: ");
		println();
		println("The 'n'th Fibonacci number is " + fibonacci(n) + ".");
	}
	//Considers the two situations where equation does not provide answer,
	//when n == 0, and n == 1.
	private int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return ((n - 1) + (n - 2));
		}
	}
}
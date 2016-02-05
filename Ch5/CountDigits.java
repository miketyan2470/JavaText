package javaCh5;

import acm.program.*;

public class CountDigits extends ConsoleProgram {
	
	public void run() {
		println("This program will count the number of digits in a positive integer.");
		println();
		int n = readInt("Please enter a POSITIVE integer: ");
		println();
		println("The number " + n + " has " + countDigits(n) + " digits.");
	}
	
	private int countDigits(int n) {
		int digits = 0;
		while (n > 0) {
			n /= 10;
			digits++;
		}
		return digits;
	}
}
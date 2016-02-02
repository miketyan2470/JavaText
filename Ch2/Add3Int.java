/*
 * File: Exercise3.java
 * --------------------
 * Program will add three integers that is
 * provided by user.
 */

package javaCh2;

import acm.program.*;

public class Add3Int extends ConsoleProgram {
	
	public void run() {
		println("This program adds two integers.");
		int n1 = readInt("Enter Integer 1: ");
		int n2 = readInt("Enter Integer 2: ");
		int n3 = readInt("Enter Integer 3: ");
		int total = n1 + n2 + n3;
		println("The total is " + total + ".");
	}
}
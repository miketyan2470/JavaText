/*
 * File : Exponentials.java
 * ------------------------
 * Program calculates a table of exponential powers from an user provided integer
 * and the power to calculate to.
 * -Complies a list of each power from '0' until user provided power.
 */

package javaCh5;

import acm.program.*;

public class Exponentials extends ConsoleProgram {
	
	public void run() {
		println("This program calculates exponential table for integers.");
		println();
		int n = readInt("Integer: ");
		int k = readInt("Exponent: ");
		println();
		//'k + 1' will extend the list by one more cycle to provide an '0' cycle.
		for (int i = 0; i < (k + 1); i++) {
			println(n + " to the power of " + i + " = " + raiseIntToPower(n, i));
		}
	}
	
	private int raiseIntToPower(int n, int k) {
		int total = 1; //Initialized value is '1' in case 'power' entered is '0'.
		for (int i = 0; i < k; i++) {
			total *= n; 
		}
		return total; //Returns total back to method 'run'.
	}
}
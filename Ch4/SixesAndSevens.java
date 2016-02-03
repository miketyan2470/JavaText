/*
 * File : SixesAndSevens.java
 * --------------------------
 * Program lists integers from 1-100 that are divisible by 6 or 7 but not by both 6 & 7.
 * Uses a 'for' statement to repeat cycle for all integers from 1-100 while the 'if' 
 * statement roots out integers that are divisible by both 6 & 7.
 */

package javaCh4;

import acm.program.*;

public class SixesAndSevens extends ConsoleProgram {
	
	public void run() {
		for (int i = 1; i < 101; i++) {
			if (((i % 6 == 0) || (i % 7 == 0)) && !((i % 6 == 0) && (i % 7 == 0))) {
				println (i);
			}
		}
	}
}
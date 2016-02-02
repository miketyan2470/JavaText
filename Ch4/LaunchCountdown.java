/*
 * File : LaunchCountdown.java 
 * ---------------------------
 * Program counts backwards from the value of START to zero by
 * using a for statement.
 */

package javaCh4;

import acm.program.*;

public class LaunchCountdown extends ConsoleProgram {
	
	public void run() {
		for (int t = START; t >= 0; t--) {
			println(t);
			pause(1000);
		}
		println("Liftoff!");
	}
	private static final int START = 10; //Declares the value to start the countdown.
}
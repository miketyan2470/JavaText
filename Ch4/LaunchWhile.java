/*
 * File : LaunchWhile.java
 * -----------------------
 * Rewritten LaunchFor.java method using a 'while' statement
 * instead of 'for' statement. 
 * -Added a few blank lines for easier viewing.
 */

package javaCh4;

import acm.program.*;

public class LaunchWhile extends ConsoleProgram {
	
	public void run() {
		int t = START;
		while (t >= 0) {
			println (t);
			pause (1000);
			println ();
			t--;
		}
		println ("LiftOff!");
	}
	private static final int START = 10;
}
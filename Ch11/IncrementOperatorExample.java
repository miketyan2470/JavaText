package javaCh11;

import acm.program.*;
/**
 * File : IncrementOperatorExample.java
 * ------------------------------------
 * Console program illustrates the result of applying the '++' operator.
 * As shown in Figure 11-4 in 'Art and science of Java, Eric S. Roberts'.
 */
public class IncrementOperatorExample extends ConsoleProgram {
	/**
	 * Runs program.
	 */
	public void run() {
		println("This program illustrates the result of applying the \"++\" operator.\n");
		while (true) {
			int initialValue = readInt("Please enter an integer: ");
			int x = initialValue;
			println("If x initially has the value " + x + ", evaluating ++x");
			int result = ++x;
			println("changes x to " + x + " and returns the value " + result + ".");
			x = initialValue;
			println("Conversely, if x has the value " + x + ", evaluating x++");
			result = x++;
			println("changes x to " + x + " but returns the value " + result + ".");		
		}	
	}
}
package javaCh7;

import acm.program.*;
/**
 * File : EmbeddedIntegerTest.java
 * -------------------------------
 * Console program tests class EmbeddedInteger to show that when methods
 * are called on objects, the value is not copied like with new variables but 
 * rather the reference is copied. Therefore, when setting the value for an 
 * object EmbeddedInteger, both variables 'x' and 'n' will both hold the same
 * value when program runs.
 */
public class EmbeddedIntegerTest extends ConsoleProgram {
	/**
	 * Runs program to create a new EmbeddedInteger with value 17.
	 */
	public void run() {
		EmbeddedInteger x = new EmbeddedInteger(17);
		increment(x);
		println("X =  " + x);
	}
	/**
	 * Increments the value of EmbeddedInteger x. 
	 * @param n EmbeddedInteger with the value of 17.
	 */
	private void increment(EmbeddedInteger n) {
		n.setValue(n.getValue() + 1);
		println("n = " + n);
	}
}
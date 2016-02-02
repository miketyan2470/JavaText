/*
 * File LeapYear.java
 * ------------------
 * Program takes user entered year and determines if it is a leap year. Leap years are years 
 * that are divisible by 4 unless it is divisible by 100. Years that are divisible by 100 are
 * leap years only if divisible by 400.
 */

package javaCh4;

import acm.program.*;

public class LeapYear extends ConsoleProgram {
	
	public void run() {
		println ("This program checks for leap years.");
		int year = readInt ("Enter year: ");
/*
 * Checks if year entered is divisible by for and by 100, or if it is divisible by 400.
 */
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		if (isLeapYear) {
			println (year + " is a leap year.");
		} else {
			println (year + " is NOT a leap year.");
		}
	}
}
package javaCh7;

import acm.program.*;
/**
 * File : HexToDec.java
 * --------------------
 * Console program converts a hexadecimal value into decimal equivalents.
 * -Program ends when user enters '0'.
 * -Use static methods Integer.parseInt and Integer.toString to convert and display results respectively.
 */
public class HexToDec extends ConsoleProgram {
	/**
	 * Runs program.
	 */
	public void run() {
		println("This program converts hexadical to decimal, enter 0 to stop.");
		String hex = "";
		while (true) {
			hex = readLine("\nEnter a hexadecimal number : ");
			if (hex.equals("0")) break;
			// Integer.parseInt method converts the string 'hex' into an integer using base 16 calculation.
			int dec = Integer.parseInt(hex, 16);
			// Integer.toString method converts the integer value of 'dec' to a String.
			println(hex + " hex = " + Integer.toString(dec) + " decimal");
		}
	}
}
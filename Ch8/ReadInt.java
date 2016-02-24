package javaCh8;

import acm.program.*;
/**
 * File : ReadInt.java
 * -------------------
 * Console program is a sample run of 'Add2Integers' program from chapter
 * 2 but uses 'myReadInt' method instead of the class method 'readInt'.
 * -Takes into account possibility of user input as a negative.
 * -Displays error message and requests new input if integer format is not
 * 	followed.
 */
public class ReadInt extends ConsoleProgram {
	
	public void run() {
		println("This program adds two integeres.\n");
		int n1 = myReadInt("Enter first integer: ");
		int n2 = myReadInt("Enter second integer: ");
		int total = n1 + n2;
		println("The total is " + total + ".\n");
	}
	/**
	 * Simulates the class method readInt.
	 * @param prompt String that guides user for input.
	 * @return Returns Integer value of string str.
	 */
	private int myReadInt(String prompt) {
		while (true) {
			int sign = 1;
			int result = 0;
			String str = readLine(prompt);
			if (str.charAt(0) == '-') {
				sign = -1;
				str = str.substring(1);
			}
			if (isInteger(str)) {
				for (int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					result = result * 10 + (ch - '0');
				}
				return result * sign;
			}
		}
	}
	/**
	 * Determines if each character in str is an integer.
	 * @param str String entered by user minus the '-' if necessary.
	 * @return Returns true if all characters are digits, false otherwise.
	 */
	private boolean isInteger(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				println("Illegal integer format");
				return false;
			} 
		}
		return true;
	}
}
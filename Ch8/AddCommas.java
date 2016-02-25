package javaCh8;

import acm.program.*;
/**
 * File : AddCommas.java
 * ---------------------
 * Console program adds a comma at every third position starting from the right for every number 
 * user inputs.
 */
public class AddCommas extends ConsoleProgram {
	
	public void run() {
		println("This program will add commas in the correct position for any number entered.\n");
		// Loops so user can enter multiple numbers, one after another.
		while (true) {
			String digits = readLine("Enter a number: ");
			if (digits.length() == 0) break;
			println(addCommas(digits));
		}
	}
	/**
	 * Adds commas at every third position starting from the left.
	 * @param digits String user inputs
	 * @return Returns String with commas added.
	 */
	private String addCommas(String digits) {
		String result = "";
		int comma = 0;
		for (int i = digits.length() - 1; i >= 0; i--) {
			if ((comma != 0) && (comma % 3 == 0)) {
				result = "," + result;
			}
			result = digits.charAt(i) + result;
			comma++;
		}
		return result;
	}
}
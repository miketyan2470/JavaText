package javaCh8;

import acm.program.*;
/**
 * File : OrdinalForm.java
 * -----------------------
 * Console program displays a list of ordinal numbers.
 * -Numbers ending in 1, 2, and 3, take the suffix 'st', 'nd', and 'rd', respectively.
 * -Numbers that end in 11, 12, and 13 including any other number ends in 'th'.
 */
public class OrdinalForm extends ConsoleProgram {
	
	public void run() {
		for (int i = 1; i <= 111; i++) {
			println(createOrdinalForm(i) + " is the Ordinal Form of " + i + ".");
		}
	}
	/**
	 * Converts integer into ordinal form.
	 * @param i Integer to be converted.
	 * @return Returns String with the ordinal form.
	 */
	private String createOrdinalForm(int i) {
		String suffix;
		if ((i % 100 == 11) || (i % 100 == 12) || (i % 100 == 13)) {
			suffix = "th";
		} else if (i % 10 == 1) {
			suffix = "st";
		} else if (i % 10 == 2) {
			suffix = "nd";
		} else if (i % 10 == 3) {
			suffix = "rd";
		} else {
			suffix = "th";
		}
		return i + suffix;
		
	}
}
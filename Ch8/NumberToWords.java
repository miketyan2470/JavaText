package javaCh8;

import acm.program.*;
/**
 * File : NumberToWords.java
 * -------------------------
 * Console program converts an integer between 0 and 999,999 to words that describes 
 * the same amount.
 * -A negative integer entered will end program.
 */
public class NumberToWords extends ConsoleProgram {
	/**
	 * Runs the program and loop continues until user enters a negative integer.
	 */
	public void run() {
		println("This program converts numbers to words.\n");
		while (true) {
			int n = readInt("Please enter a number: ");
			if (n < 0) break;
			println(numberToWords(n) + "\n");
		}
	}
	/**
	 * Converts integer entered by user into a String that describes the same amount.
	 * @param n Integer entered by user.
	 * @return Returns String that describes the integer n.
	 */
	private String numberToWords(int n) {
		String result = "";
		if (n == 0) {
			return "zero";
		}
		if (n > 999) {
			result = getHundreds(n / 1000) + " thousand " + getHundreds(n % 1000);
		} else if (n < 1000 && n > 99) {
			result = getHundreds(n);
		} else if (n < 100) {
			result = getDouble(n);
		}
		return result;
	}
	/**
	 * Converts a three digit integer into worded description.
	 * @param n Integer with three digits.
	 * @return Returns String that describes the integer n.
	 */
	private String getHundreds(int n) {
		String result = "";
		if (n < 100) {
			result = getDouble(n);
		} else {
			result = getSingles(n / 100) + " hundred " + getDouble(n % 100);
		}
		return result;
	}
	/**
	 * Converts a two digit integer into worded description based on each integer's value.
	 * @param n Integer with two digits.
	 * @return Returns String that describes the integer n.
	 */
	private String getDouble(int n) {
		String result = "";
		int tens = n / 10;
		int singles = n % 10;
		// If under 10, then single digit is called and returned.
		if (n > 0 && n < 10) {
			result = getSingles(n);
		// Traditional algorithm used to select the first and second digit words.
		} else if (n > 19) {
			result = getTens(tens) + "-" + getSingles(singles);
		// Returns 'odd' worded descriptions that doesn't fit traditional algorithm.
		} else switch (n) {
			case 10: return "ten";
			case 11: return "eleven";
			case 12: return "twelve";
			case 13: return "thirteen";
			case 14: return "fourteen";
			case 15: return "fifteen";
			case 16: return "sixteen";
			case 17: return "seventeen";
			case 18: return "eighteen";
			case 19: return "nineteen";
		}  
		return result;
	}
	/**
	 * Converts the integer representing the tens digit into corresponding words.
	 * @param n Integer representing the tens digit.
	 * @return Returns String that corresponds with tens digit entered.
	 */
	private String getTens(int n) {
		switch (n) {
			case 1: return "ten";
			case 2: return "twenty";
			case 3: return "thirty";
			case 4: return "forty";
			case 5: return "fifty";
			case 6: return "sixty";
			case 7: return "seventy";
			case 8: return "eighty";
			case 9: return "ninty";
			default: return "";
		}
	}
	/**
	 * Converts the integer representing the ones digit into corresponding words.
	 * @param n Integer representing the ones digit.
	 * @return Returns String that corresponds with ones digit entered.
	 */
	private String getSingles(int n) {
		switch (n) {
			case 1: return "one";
			case 2: return "two";
			case 3: return "three";
			case 4: return "four";
			case 5: return "five";
			case 6: return "six";
			case 7: return "seven";
			case 8: return "eight";
			case 9: return "nine";
			default: return "";
		}
	}
}
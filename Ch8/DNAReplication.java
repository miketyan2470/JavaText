package javaCh8;

import acm.program.*;
/**
 * File : DNAReplication.java
 * --------------------------
 * Console program determines at what index can two strands of DNA be bound, if any exists.
 * -Displays first index position at which DNA strand would bind.
 * -Notifies user if two DNA strands can be bound.
 */
public class DNAReplication extends ConsoleProgram {
	/**
	 * Runs program DNAReplication.
	 */
	public void run() {
		println("This program finds the first index position a short strand of DNA can attatch itself to another strand of DNA.\n"
				+ "Please enter all strands in A,C,G,T base structure.");
		while (true) {
			String longDNA = readLine("\nPlease enter the strand you are looking at: ");
			String shortDNA = readLine("Please enter the strand you are trying to match: ");
			int index = findFirstMatchingPosition(shortDNA, longDNA);
			println(getResults(index));
		}
	}
	/**
	 * Translates the index returned from method into readable results in English.
	 * @param index Integer returned from findFirstMatchingPosition method.
	 * @return Returns String interpretation of results of method.
	 */
	private String getResults(int index) {
		if (index == -1) {
			return "DNA stands can not be bound.";
		} else {
			return "DNA strand can bind at index " + index + ".";
		}
	}
	/**
	 * Finds first index position where two strands of DNA can bind.
	 * @param shortDNA String of first DNA to be matched.
	 * @param longDNA String of DNA to be searched for matches.
	 * @return Returns -1 if no matches exists, otherwise integer returned reflects index position of match.
	 */
	private int findFirstMatchingPosition(String shortDNA, String longDNA) {
		// Converts Strings into upper case so there will be no case sensitivity in matching process.
		longDNA = longDNA.toUpperCase();
		shortDNA = shortDNA.toUpperCase();
		return longDNA.indexOf(convertDNA(shortDNA));
	}
	/**
	 * Converts DNA string into string of inverted values to search for matches.
	 * @param DNA String of DNA strand that is used to search for matches.
	 * @return Returns String of inverted values.
	 */
	private String convertDNA(String DNA) {
		String result = "";
		for (int i = 0; i < DNA.length(); i++) {
			char ch = DNA.charAt(i);
			if (ch == 'A') result += 'T';
			if (ch == 'T') result += 'A';
			if (ch == 'G') result += 'C';
			if (ch == 'C') result += 'G';
		}
		return result;
	}
}
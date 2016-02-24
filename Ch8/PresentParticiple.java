package javaCh8;

import acm.program.*;

public class PresentParticiple extends ConsoleProgram {
	
	private static final String TEST1 = "move";
	private static final String TEST2 = "see";
	private static final String TEST3 = "jam";
	private static final String TEST4 = "walk";
	private static final String TEST5 = "test";
	
	public void run() {
		println(createPresentParticiple(TEST1));
		println(createPresentParticiple(TEST2));
		println(createPresentParticiple(TEST3));
		println(createPresentParticiple(TEST4));
		println(createPresentParticiple(TEST5));
	}
	
	private String createPresentParticiple(String test) {
		String word = test.toLowerCase();
		int index = test.length();
		char ch = test.charAt(index - 1);
		char ch2 = test.charAt(index - 2);
		if ((ch == 'e') && (isConsonant(ch2))) {
			int last = test.length() - 1;
			word = test.substring(0, last) + "ing";
		} else if ((isConsonant(ch)) && (isVowel(ch2))){
			word = test + test.charAt(index - 1) + "ing";
		} else {	
			word = test + "ing";
		}
		return word;
	}
	
	private boolean isConsonant(char ch) {
		switch(ch) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : return false;
			default : return true;
		}
	}
	
	private boolean isVowel(char ch) {
		switch(ch) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : return true;
			default : return false;
		}
	}
}
package javaCh8;

import acm.program.*;
import java.util.*;

public class PigLatin extends ConsoleProgram {
	
	private static final String DELIMITERS = "!@#$%^&*()_+={[}]:;\"'<,>.?/~`|\\ ";
	
	public void run() {
		println("This program translate a line of english into Pig Latin.");
		println();
		String line = readLine("Enter a line: ");
		println(translateLine(line));
	}
	
	private String translateLine(String line) {
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (isWord(token)) {
				token = translateWord(token);
			}
			result += token;
		}
		return result;
	}
	
	private boolean isWord(String token) {
		for (int i = 0; i < token.length(); i++) {
			char ch = token.charAt(i);
			if (!Character.isLetter(ch)) return false;
		}
		return true;
	}
	
	private String translateWord(String word) {
		int vp = findFirstVowel(word);
		if (vp == -1) {
			return word;
		} else if (vp == 0) {
			return word + "way";
		} else {	
			String head = word.substring(0,  vp);
			String tail = word.substring(vp);
			return tail + head + "ay";
		}
	}
	
	private int findFirstVowel(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (isEnglishVowel(word.charAt(i))) return i;
		}
		return -1;
	}
	
	private boolean isEnglishVowel(char ch) {
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return true;
			default:
				return false;
		}
	}
}
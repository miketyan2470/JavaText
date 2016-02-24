package javaCh8;

import acm.program.*;
/**
 * File CasesarCipher.java
 * -----------------------
 * Console program uses the Caesar cipher method to encrypt user input.
 * -Disregards spaces and other punctuation.
 * -Encrypted text will stay within letter range.
 * -Cipher text will also be decrypted and displayed.
 */
public class CaesarCipher extends ConsoleProgram {
	
	public void run() {
		println("This program uses a Caesar cipher for encryption.");
		println();
		int key = readInt("Enter encryption key: ");
		String plaintext = readLine("Plaintext: ");
		String ciphertext = encryptCaesar(plaintext, key);
		println("Ciphertext: " + ciphertext);
		// Decrypts cipher text back to original input.
		String newplain = encryptCaesar(ciphertext, -key);
		println("Newplain: " + newplain);
	}
	/**
	 * Encrypts the plain text into cipher text.
	 * @param plaintext String entered by user to be encrypted.
	 * @param key Int representing offset for encryption.
	 * @return Returns String with encrypted text.
	 */
	private String encryptCaesar(String plaintext, int key) {
		// Prevents negative key mapping errors.
		if (key < 0) {
			key = 26 - (-key % 26);
		}
		String result = "";
		for (int i = 0; i < plaintext.length(); i++) {
			char ch = plaintext.charAt(i);
			result += encryptChar(ch, key);
		}
		return result;
	}
	/**
	 * Encrypts each character into cipher equivalent.
	 * @param ch Char to be encrypted.
	 * @param key Int representing offset for encryption.
	 * @return Returns char that has been encrypted.
	 */
	private char encryptChar(char ch, int key) {
		if (Character.isLetter(ch)) {
			return (char) ('A' + ((ch - 'A' + key) % 26));
		}
		return ch;
	}
}
package javaCh7;

import acm.program.*;
import acm.util.RandomGenerator;
/**
 * File : OctalMathQuiz.java
 * -------------------------
 * Console program asks a series of math questions with base 8 answers.
 * -Number of questions, number of tries, and largest number used are all
 * 	defined as constants.
 * -Numbers used in questions are generated randomly and will not exceed
 *  'LARGEST_NUMBER'.
 * -Correct answer is revealed after 'NUMBER_OF_TRIES' is reached.
 * -Encouraging response for correct answers is generated randomly.
 */
public class OctalMathQuiz extends ConsoleProgram {
	// Private constants.
	private static final int NUMBER_OF_QUESTIONS = 20;
	private static final int LARGEST_NUMBER = 20;
	private static final int NUMBER_OF_TRIES = 2;
	// Private instance variables.
	private int score = 0;
	// Initializes random generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	/**
	 * Runs program.
	 */
	public void run() {
		println("Welcome to the octal Math Quiz.\n");
		for (int i = 1; i <= NUMBER_OF_QUESTIONS; i++) {
			getQuestion(i);
		}
		println("\nYou got " + score + " questions right!");
	}
	/**
	 * Gets either an addition or subtraction question based on random
	 * boolean result.
	 * @param i Integer representing the question number in test.
	 */
	private void getQuestion(int i) {
		if (rgen.nextBoolean()) {
			getAddition(i);
		} else {
			getSubtraction(i);
		}
	}
	/**
	 * Generates a subtraction question.
	 * @param i Integer representing the question number in test.
	 */
	private void getSubtraction(int i) {
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER);
		if ((n1 - n2) >= 0) {
			int answer = n1 - n2;
			String input = readLine(i + ") What is " + n1 + " - " + n2 + " in base 8? ");
			checkAnswer(answer, input);
		} else {
			int answer = n2 - n1;
			String input = readLine(i + ") What is " + n2 + " - " + n1 + " in base 8? ");
			checkAnswer(answer, input);
		}
	}
	/**
	 * Generates an addition question.
	 * @param i Integer representing the question number in test.
	 */
	private void getAddition(int i) {
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER - n1);
		int answer = n1 + n2;
		String input = readLine(i + ") What is " + n1 + " + " + n2 + " in base 8? ");
		checkAnswer(answer, input);
	}
	/**
	 * Checks if user input is the correct answer.
	 * @param answer Integer value is the correct answer to question.
	 * @param input String entered by user.
	 */
	private void checkAnswer(int answer, String input) {
		int wrongAnswers = 0;
		while (true) {
			// Converts string into an integer value equal to hexadecimal.
			int dec = Integer.parseInt(input, 16);
			if (answer == dec) {
				println(getRemark());
				score++;
				break;
			} else if (wrongAnswers < (NUMBER_OF_TRIES - 1)) {
				input = readLine("Incorrect, try a different answer: ");
				wrongAnswers++;
			} else {
				println("Incorrect, the answer is " + Integer.toHexString(answer) + ".");
				break;
			}
		}
	}
	/**
	 * Generates a random encouraging remark when user gets correct answer.
	 * @return String with encouraging message.
	 */
	private String getRemark() {
		switch (rgen.nextInt(1, 5)) {
			case 1: return "That's right!";
			case 2: return "Awesome answer!";
			case 3: return "Great job!";
			case 4: return "This is too easy for you!";
			default: return "Congrats! You're right!";
		}
	}
}
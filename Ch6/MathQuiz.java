/*
 * File : MathQuiz.java
 * --------------------
 * Console program asks a series of second grade math questions.
 * -Numbers of questions, number of tries per question, and largest number
 * used are all defined as constants.
 * -Numbers used and operation are generated randomly.
 * -Numbers used and answers will not exceed 'LARGEST_NUMBER'.
 * -After 'NUMBER_OF_TRIES' is reached, the program will reveal correct answer
 * and move on to next question.
 */

package javaCh6;

import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram {
	// Initializes constant values.
	private static final int NUMBER_OF_QUESTIONS = 10;
	private static final int LARGEST_NUMBER = 20;
	private static final int NUMBER_OF_TRIES = 3;
	private int score = 0;
	// Initializes instance variable to generate random numbers.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println("Welcome to 2nd Grade Math Quiz.");
		println();
		for (int i = 1; i <= NUMBER_OF_QUESTIONS; i++) {
			getQuestion(i);
		}
		println();
		println("You got " + score + " questions right!");
	}
	// Determines if question will be addition or subtraction.
	private void getQuestion(int i) {
		if (rgen.nextBoolean()) {
			getAddition(i);
		} else {
			getSubtraction(i);
		}
	}
	// Generates random subtraction question.
	private void getSubtraction(int i) {
		// Random values generated for question.
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER);
		// Checks to make sure answer does not fall below zero.
		if ((n1 - n2) >= 0) {
			int answer = n1 - n2;
			int input = readInt(i + ") What is " + n1 + " - " + n2 + " ? ");
			checkAnswer(answer, input);
		} else {
			int answer = n2 - n1;
			int input = readInt(i + ") What is " + n2 + " - " + n1 + " ? ");
			checkAnswer(answer, input);
		}
	}
	// Generates random addition question.
	private void getAddition(int i) {
		// Random values generated for question.
		int n1 = rgen.nextInt(0, LARGEST_NUMBER);
		int n2 = rgen.nextInt(0, LARGEST_NUMBER - n1);
		int answer = n1 + n2;
		int input = readInt(i + ") What is " + n1 + " + " + n2 + " ? ");
		checkAnswer(answer, input);
	}
	// Compares user input to correct answer.
	private void checkAnswer(int answer, int input) {
		int wrongAnswers = 0;
		// Loops until either correct answer is given or NUMBER_OF_TRIES reached.
		while (true) {
			// Checks if answer is correct.
			if (answer == input) {
				println("That's correct! - Good Job!");
				score++;
				println();
				break;
			} else if (wrongAnswers < (NUMBER_OF_TRIES - 1)) {
				input = readInt("Incorrect, try a different answer: ");
				wrongAnswers++;
			} else {
				println("Incorrect, the answer is " + answer + ".");
				break;
			}
		}	
	}
}
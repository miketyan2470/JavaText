/*
 * File : YesNoQuestion.java
 * -------------------------
 * Program checks user input to match strings.
 * -Loops until user enters 'no'.
 * -Any answer entered that is neither 'yes' or 'no' will remind user to enter
 * one of the two stated answers.
 */

package javaCh5;

import acm.program.*;

public class YesNoQuestion extends ConsoleProgram {
	//Initializes constants for the rules and the question asked.
	private static final String RULES = "Please answer 'yes' or 'no'.";
	private static final String QUESTION = "Do you want to play a game? ";
	
	public void run() {
		println("This is a question game.");
		println();
		println(RULES);
		println();
		askYesNoQuestion(QUESTION);
	}
	
	private boolean askYesNoQuestion(String str) {
		//Initializes String answer.
		String answer = readLine(QUESTION);
		println();
		//Determines if answer is either; yes, no, or other.
		if (answer.equals("yes")) {
			println("Let's play a question game! I'll ask you a question!");
			askYesNoQuestion(QUESTION);
			return true;
		} else if (answer.equals("no")) {
			println("Boo... Good Bye!");
			return false;
		} else {
			println(RULES);
			return askYesNoQuestion(str);
		}
	}
}
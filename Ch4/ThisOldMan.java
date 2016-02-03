/*
 * File : ThisOldMan.java
 * ----------------------
 * Program displays the lyrics for 'This Old Man' song. The two variables
 * are (i), the number that the old man plays, and (rhyme), the 
 * corresponding word that follows. The 'switch' statement is nested within
 * the repeated 'for' statement to change the rhyme according to the value 
 * of i throughout the cycles.
 */

package javaCh4;

import acm.program.*;

public class ThisOldMan extends ConsoleProgram {
	
	public void run() {
		println ("This old man.");
		println ();
		for (int i = 1; i < 11; i++) { // Setting the value of i as 1 prevents counting error.
			println ("This old man, he played " + i + ".");
			String rhyme = "thumb."; // Initializing String rhyme
			switch (i) { // Multiple choices dictates use of switch statement.
				case 1: rhyme = "thumb."; break;
				case 2: rhyme = "shoe."; break;
				case 3: rhyme = "knee."; break;
				case 4: rhyme = "door."; break;
				case 5: rhyme = "hive."; break;
				case 6: rhyme = "sticks."; break;
				case 7: rhyme = "heaven."; break;
				case 8: rhyme = "plate."; break;
				case 9: rhyme = "spine."; break;
				default: rhyme = "shin."; break;
			}
			println ("He played knick-knack on my " + rhyme);
			println ("With a knick-knack, paddy-whack.");
			println ("Give your dog a bone.");
			println ("This old man came rolling home.");
			println (); // Intentional blank line to provide easier read for users.
		}
	}
}
/*
 * File : BottlesOfBeer.java
 * -------------------------
 * Program generates the lyrics to song "Bottles of Beer on the Wall" according to 
 * user inputed number of beers to start with. Method uses a 'for' statement to 
 * repeat until the value for bottles of beer is 0.
 */

package javaCh4;

import acm.program.*;

public class BottlesOfBeer extends ConsoleProgram {
	
	public void run() {
		println("This program will display the lyrics for 'Bottles of Beer' song.");
		int bottle = readInt("Please enter the number of bottles to begin with: ");
		for(int i = bottle; i > 0; i--) {
			println(i + " bottles of beer on the wall.");
			println(i + " bottles of beer.");
			println("You take one down, pass it around.");
			println( i - 1 + " bottles of beer on the wall.");
			println(); //visual 'break' between cycles for more user friendly viewing.
		}
	}
}
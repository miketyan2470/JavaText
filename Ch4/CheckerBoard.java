/*
 * File CheckerBoard.java
 * ----------------------
 * Graphics Program will draw a checker board with number of columns and rows 
 * based on constants N_ROWS and N_COLUMNS. Nested 'for' statements will 
 * allow for each column to be generated as long as there is a row left to 
 * create. Size of squares are determined by height of graphics screen divided
 * by number of rows.
 */

package javaCh4;

import acm.program.*;
import acm.graphics.*;

public class CheckerBoard extends GraphicsProgram {
	
	public void run() {
		double sqSize = (double) getHeight() / N_ROWS; //Determines size of square by diving height of screen by number of rows.
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {
				double x = j * sqSize;
				double y = i * sqSize;
				GRect sq = new GRect(x,y,sqSize,sqSize);
				sq.setFilled((i + j) % 2 != 0); //Uses odd or even value to determine if sq is filled.
				add(sq);
			}
		}
	}
/*
 * Constants N_ROWS and N_COLUMNS are used to determine how many rows/columns are placed in graphics window.
 */
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
}
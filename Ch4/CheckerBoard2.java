/*
 * File CheckerBoard2.java
 * -----------------------
 * Program adds checkers to existing program CheckerBoard.java. 
 * -Board is now centered on the X-axis.
 * -Red checkers added on 'top' three rows.
 * -Black checkers added on 'bottom' three rows.
 */

package javaCh4;

import java.awt.Color;
import acm.program.*;
import acm.graphics.*;

public class CheckerBoard2 extends GraphicsProgram {

	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	
	public void run() {		
		for (int row = 0; row < N_ROWS; row++) {
			// Determines size of each square by diving total height by number of rows (N_ROWS).
			double sqSize = (double) getHeight() / N_ROWS; 
			// Repeats squares 'N_COLUMNS' number of times.
			for (int column = 0; column < N_COLUMNS; column++) {	
				// Defines x and y axis for squares while calculating the offset to center.			
				double x = column * sqSize;
				double y = row * sqSize;
				double offSet = (getWidth() / 2) - ((sqSize * N_COLUMNS) / 2);
				// Generates square and determines if blank or filled.
				GRect sq = new GRect((x + offSet),y,sqSize,sqSize);
				sq.setFilled((row + column) % 2 != 0); 
				sq.setColor(Color.GRAY);
				sq.setFillColor(Color.GRAY);
				add(sq);	
				// Generates 'checker' if square is filled (blacked out).
				if ((row + column) % 2 != 0) {
					GOval checker = new GOval((x + offSet),y,sqSize,sqSize);
					checker.setFilled(true);
					// Chooses color of checker depending on which row.
					if (row < 3) {
						checker.setColor(Color.RED);
						checker.setFillColor(Color.RED);
						add(checker);
					} else if (row > 4) {
						checker.setColor(Color.BLACK);
						checker.setFillColor(Color.BLACK);
						add(checker);
					}
				}
			}
		}
	}
}
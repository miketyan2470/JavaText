package javaCh9;

import acm.program.*;
import acm.graphics.*;
/**
 * Constructs Pascal's triangle with given values.
 * -Triangle will stop generating if last row extends further than bottom of window.
 * -Tip of triangle is centered on x axis.
 */
public class PascalTriangle extends GraphicsProgram {
	// Private constants.
	private static final int OFFSET = 15;
	private static final int CIRCLE_SIZE = 35;
	// Instance variables.
	private int row;
	private int column;
	/**
	 * Constructs the triangle row by row downwards.
	 */
	public void run() {
		// Loops for each row.
		for (row = 0; ((row + 1) * (CIRCLE_SIZE + OFFSET) < getHeight()); row++) {
			double x = ((getWidth() - CIRCLE_SIZE) / 2) - (row * ((CIRCLE_SIZE + OFFSET) / 2));
			double y = OFFSET + (row * (OFFSET + CIRCLE_SIZE));
			// Loops for each column in row to add circle.
			for (column = 0; column <= row; column++) {
				addCircle(x, y);
				x += (CIRCLE_SIZE + OFFSET);
			}
		}
	}
	/**
	 * Creates circle based on constant CIRCLE_SIZE and adds to canvas. 
	 * @param x Coordinate on x axis to center circle.
	 * @param y Coordinate on y axis to center circle.
	 */
	private void addCircle(double x, double y) {
		GOval circle = new GOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
		add(circle);
		addNumber(x + CIRCLE_SIZE / 2, y + CIRCLE_SIZE / 2);
	}
	/**
	 * Adds corresponding Pascal number into each circle.
	 * @param x Coordinate on x axis to center number within circle.
	 * @param y Coordinate on y axis to center number within circle.
	 */
	private void addNumber(double x, double y) {
		int number = getNumber(row, column);
		GLabel label = new GLabel(String.valueOf(number));
		add(label, x - (label.getWidth() / 2), y + (label.getAscent() / 2)); 
	}
	/**
	 * Calculates the value for Pascal's number in each circle given the row and column.
	 * @param i Integer value that represents the row.
	 * @param j Integer value that represents the column.
	 * @return Returns integer value of Pascal's number for circle.
	 */
	private int getNumber(int i, int j) {
		if (j == 0 || i == j) {
			return 1;
		} else {
			return getNumber(i - 1, j - 1) + getNumber(i - 1, j);
		}
	}
}
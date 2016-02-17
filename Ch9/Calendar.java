package javaCh9;

import acm.program.*;
import acm.graphics.*;
/**
 * File Calendar.java
 * ------------------
 * Graphics program generates a calendar with the given values.
 * -Calendar will span the whole x and y axis of window.
 * -Will calculate the number of rows based on the number of days and
 *	day of the week that the month starts. 
 */
public class Calendar extends GraphicsProgram {
	// Private constants.
	private static final int DAYS_IN_MONTH = 31;
	private static final int DAY_MONTH_STARTS = 5;
	private static final int LABEL_HEIGHT = 30;
	private static final int DATE_OFFSET = 5;
	// Instance variables.
	public int date = -DAY_MONTH_STARTS;
	public double boxWidth;
	public double boxHeight;
	private double rows;
	/**
	 * Generates the calendar by calling methods that build each separate
	 * part.
	 */
	public void run() {
		calculateRows();
		addLabels();
		addGrid();
	}
	/**
	 * Generates 'grid' by drawing boxes for each row and column.
	 */
	private void addGrid() {
		boxHeight = (getHeight() - LABEL_HEIGHT) / rows;
		// Repeats for each row.
		for (int i = 0; i < rows; i++) {
			// Repeats for each column.
			for (int j = 0; j < 7; j++) {
				double x = j * boxWidth;
				double y = LABEL_HEIGHT + (i * boxHeight);
				GRect box = new GRect(x, y, boxWidth, boxHeight);
				add(box);
				// Keeps count of date and generates accordingly.
				date++;
				addDate(x, y);
			}
		}
	}
	/**
	 * Adds date to 'box' if greater than '0' and less than '32'.
	 * @param x Coordinate of x origin within 'box'.
	 * @param y Coordinate of y origin within 'box'.
	 */
	private void addDate(double x, double y) {
		if (date > 0 && date < 32) {
			// Using String.valueOf() for the first time to convert value to 
			// string.
			GLabel date = new GLabel(String.valueOf(this.date));
			date.setFont("SansSerif-bold-14");
			add(date, x + DATE_OFFSET, y + DATE_OFFSET + date.getAscent());
		}
	}
	/**
	 * Adds row of labels on top of calendar to show day of week.
	 */
	private void addLabels() {
		boxWidth = getWidth() / 7;
		for (int i = 0; i < 7; i++) {
			GLabel day = new GLabel(getDay(i));
			day.setFont("SansSerif-bold-26");
			double x = (boxWidth - day.getWidth()) / 2 + (i * boxWidth);
			double y = (day.getAscent() + LABEL_HEIGHT) / 2;
			add(day, x, y);
		}
	}
	/**
	 * Converts a value representing day of week into the String equivalent.
	 * @param i Integer value of day of the week, starting with Sunday as '0'.
	 * @return String that corresponds with the value of 'i'.
	 */
	private String getDay(int i) {
		switch (i) {
			case 1: return "Mon";
			case 2: return "Tue";
			case 3: return "Wed";
			case 4: return "Thu";
			case 5: return "Fri";
			case 6: return "Sat";
			default : return "Sun";
		}
	}
	/**
	 * Calculates the number of rows based on number of days and which day of 
	 * the week the month starts.
	 */
	@SuppressWarnings("unused")
	private void calculateRows() {
		if ((DAY_MONTH_STARTS == 0) && (DAYS_IN_MONTH == 28)) {
			rows = 4;
		} else {
			rows = ((DAYS_IN_MONTH + DAY_MONTH_STARTS) / 7) + 1;
		}	
	}
}
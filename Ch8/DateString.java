package javaCh8;

import acm.program.*;
/**
 * File : DateString.java
 * ----------------------
 * Console program called method createDateString to convert values for Day, Month, and Year.
 * -String returned has the format "DD-MMM-YY".
 * -Date and year are both represented with a 2 digit integer and the month by first three letters.
 */
public class DateString extends ConsoleProgram {
	
	public void run() {
		println(createDateString("02", "23", "1957"));
		println(createDateString("12", "02", "1958"));
		println(createDateString("12", "28", "1986"));
		println(createDateString("07", "02", "1983"));
		println(createDateString("03", "06", "1988"));
	}
	/**
	 * Creates String with parameters for month, day, and year. 
	 * @param month String represents month.
	 * @param day String represents day.
	 * @param year String represents year.
	 * @return Returns new String with proper format.
	 */
	private String createDateString(String month, String day, String year) {
		String result = day + "-" + getMonth(month) + "-" + getYear(year);
		return result;
	}
	/**
	 * Converts the numerical value for month into the first 3 letters of month.
	 * @param month String value representing month.
	 * @return Returns String of 3 first characters of month.
	 */
	private String getMonth(String month) {
		int i = Integer.valueOf(month);
		switch (i) {
			case 1: return "Jan";
			case 2: return "Feb";
			case 3: return "Mar";
			case 4: return "Apr";
			case 5: return "May";
			case 6: return "Jun";
			case 7: return "Jul";
			case 8: return "Aug";
			case 9: return "Sep";
			case 10: return "Oct";
			case 11: return "Nov";
			default: return "Dec";
		}
	}
	/**
	 * Shortens the String year by keeping only the first two Characters.
	 * @param year String representing the year.
	 * @return Returns the first two characters of String year.
	 */
	private String getYear(String year) {
		String shortYear = year.substring(2);
		return shortYear;
	}
}
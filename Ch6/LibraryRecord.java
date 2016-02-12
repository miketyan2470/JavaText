/**
 * The LibraryRecord class keeps track of the following data about a book: Title, author, Library of Congress catalog
 * number, publisher's name, year of publication, and whether or not it is in circulation. Information is kept private 
 * to this class and can only be accessed by methods provided.
 */

package javaCh6;

public class LibraryRecord {
	// Private instance variables
	private String titleOfBook;
	private String authorName;
	private double LOCcatalogNumber;
	private String publisherName;
	private int yearPublished;
	private boolean isCirculating;
/**
 * Creates a new LibraryRecord object with following parameters.
 * @param title Title of book as a String.
 * @param author Name of the author as a String.
 * @param catalogNumber Catalog number in Library of Congress as a double.
 * @param publisher Name of publisher as a String.
 * @param year Year of publication as an int.
 * @param circulating Whether or not is in circulation as a boolean.
 */
	public LibraryRecord(String title, String author, double catalogNumber, String publisher, int year, boolean circulating) {
		titleOfBook = title;
		authorName = author;
		LOCcatalogNumber = catalogNumber;
		publisherName = publisher;
		yearPublished = year;
		isCirculating = circulating;
	}
/**
 * Creates a new LibraryRecord object with following parameters and sets inCirculating as true.
 * @param title Title of book as a String.
 * @param author Name of the author as a String.
 * @param catalogNumber Catalog number in Library of Congress as a double.
 * @param publisher Name of publisher as a String.
 * @param year Year of publication as an int.
 */
	public LibraryRecord(String title, String author, double catalogNumber, String publisher, int year) {
		titleOfBook = title;
		authorName = author;
		LOCcatalogNumber = catalogNumber;
		publisherName = publisher;
		yearPublished = year;
		isCirculating = true;
	}
/**
 * Gets title of book.
 * @return The title of book as String.
 */
	public String getTitle() {
		return titleOfBook;
	}
/**
 * Gets name of author.
 * @return The name of author as String.
 */
	public String getAuthor() {
		return authorName;
	}
/**
 * Gets Library of Congress catalog number.
 * @return The Library of Congress catalog number as a double. 
 */
	public double getNumber() {
		return LOCcatalogNumber;
	}
/**
 * Gets publisher's name.
 * @return The name of publisher as String.
 */
	public String getPublisher() {
		return publisherName;
	}
/**
 * Gets the year of publication.
 * @return The year of publication as int.
 */
	public int getYear() {
		return yearPublished;
	}
/**
 * Gets whether or not is in circulation.
 * @return Whether or not is in circulation as boolean. 
 */
	public boolean isCirculating() {
		return isCirculating;
	}
/**
 * Sets whether the book is circulating.
 * @param circulating The value true or false indicating circulation status.
 */
	public void setIsCirculating(boolean circulating) {
		isCirculating = circulating;
	}
/**
 * Creates a String to identify this book.
 * @return The String used to display book information.
 */
	public String toString() {
		String circulating;
		// Determines which String to use for value of isCirculating.
		if (isCirculating) {
			circulating = "Is circulating";
		} else {
			circulating = "Is not circulating";
		}
		return titleOfBook + " by " + authorName + " published by " + publisherName + " in " + yearPublished + ". " + circulating + " with catalog number " + LOCcatalogNumber + "."; 
	}
}

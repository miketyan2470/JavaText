/**
 * The Card class keeps track of the rank and suit of entered card. The 
 * data is kept private to this class and can only be accessed by methods
 * provided.
 */

package javaCh6;

public class Card {
	// Private instance variables.
	private int cardSuit;
	private int cardRank;
	/**
	 * Creates a new Card object with the following parameters.
	 * @param rank Rank of the card ranging from 1 - 13.
	 * @param suit Suit of the card ranging from 1 - 4.
	 */
	public Card(int rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
	}
	/**
	 * Gets the rank of card.
	 * @return The corresponding value as String.
	 */
	public String getRank() {
		switch (cardRank) {
			case 1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default : return Integer.toString(cardRank);
		}
	}
	/**
	 * Gets the suit of card.
	 * @return The corresponding value as String.
	 */
	public String getSuit() {
		switch (cardSuit) {
			case 1: return "Spades";
			case 2: return "Hearts";
			case 3: return "Clubs";
			case 4: return "Diamonds";
			default: return "";
		}
	}
	/**
	 * Creates a String to identify this card.
	 * @return The String used to display card information.
	 */
	public String toString() {
		return cardRank + " of " + cardSuit;
	}
}

package javaCh6;

public class Card {
	
	private int cardSuit;
	private int cardRank;
	
	public Card(int rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
	}
	
	public String getRank() {
		switch (cardRank) {
			case 1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default : return Integer.toString(cardRank);
		}
	}
	
	public String getSuit() {
		switch (cardSuit) {
			case 1: return "Spades";
			case 2: return "Hearts";
			case 3: return "Clubs";
			case 4: return "Diamonds";
			default: return "";
		}
	}
	
	public String toString() {
		return cardRank + " of " + cardSuit;
	}
}

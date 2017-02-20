package cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	List<Card> deck = new ArrayList<Card>(52);

	public void makeDeck() {

		int counter = 1;

		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values())
				if (counter == 1) {
					deck.add(new Card(rank, suit, 11));
				} 
				else if (counter < 10) {
				deck.add(new Card(rank, suit, counter));
				} 
				else {
				deck.add(new Card(rank, suit, 10));
				}
				counter++;
			}
		}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}

}
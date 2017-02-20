package cards;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> cards;

	public Hand() {
		cards = new ArrayList<Card>();
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void add(Card deal) {
		cards.add(deal);
	}

}
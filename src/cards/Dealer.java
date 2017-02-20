package cards;

import java.util.Collections;

public class Dealer extends Player {
	
	Deck deck = new Deck();
	Hand hand = new Hand();
	
//	public Dealer(String hand) {
//		super();
//		this.hand = hand;
//	}
	
	public void shuffleDeck(){
		
		deck.makeDeck();
		Collections.shuffle(deck.getDeck());
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	public Card deal() {
		return deck.getDeck().remove(0);
	}

	@Override
	public String toString() {
		return "Dealer [hand=" + hand + "]";
	}	
}

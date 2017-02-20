package cards;

public class Player {
	private Hand hand;

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Player() {
		this.hand = new Hand();
	}

	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}
}

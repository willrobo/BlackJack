package cards;

import java.util.*;

public class BlackJack {

	public static void main(String[] args) {
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		dealer.shuffleDeck();
		dealer.getHand().add(dealer.deal());
		player.getHand().add(dealer.deal());
		dealer.getHand().add(dealer.deal());
		player.getHand().add(dealer.deal());

		System.out.println("The dealer's current score is:\t" + dealerScore(dealer) + "\n");
		System.out.println("Your current score is:\t" + playerScore(player) + "\n");

		takeCard(dealer, player);

	}
	
	public static void dealerHand(Dealer dealer) {
		for (Card card : dealer.getHand().getCards()) {
		}
	}

	public static void playerHand(Player player) {
		for (Card card : player.getHand().getCards()) {
		}
	}
	
	public static int dealerScore(Dealer dealer) {
		int score = 0;
		for (Card card : dealer.getHand().getCards()) {
			System.out.println("dealer draw: " + card);
			score = score + card.getValue();
		}
		return score;
	}

	public static int playerScore(Player player) {
		int score = 0;
		for (Card card : player.getHand().getCards()) {
			score = score + card.getValue();
			System.out.println("You draw: " + card);
		}
		return score;
	}

	public static void takeCard(Dealer dealer, Player player) {
		Scanner kb = new Scanner(System.in);
		
		String hitOrStay;
		
		boolean continueGame = true;
		while (continueGame) {
			System.out.println("Would you like to take a card?  (Y / N):\n");
			hitOrStay = kb.next();
			
			if (hitOrStay.equals("Y") || hitOrStay.equals("y")) {
				player.getHand().add(dealer.deal());
				System.out.println("\n");
				
				if (playerScore(player) > 21) {
					System.out.println("\nYour score is over 21.  You lose!\n");
					continueGame = false;
				}

			}

			else {

				while (dealerScore(dealer) < 17) {
					dealer.getHand().add(dealer.deal());
					System.out.println("\n");
					
					if (dealerScore(dealer) > 21) {
						System.out.println("\nThe dealers score is over 21.  You win!\n");
						continueGame = false;
					}
				}
				continueGame = false;
			}

		}
		if (dealerScore(dealer) < 21 && playerScore(player) < 21) {

			gameStatus(dealer, player);
		}
	}

	public static void gameStatus(Dealer dealer, Player player) {
		if (dealerScore(dealer) > playerScore(player)) {
			System.out.println("\nHouse wins!\n");
		} 
		else if (dealerScore(dealer) < playerScore(player)) {
			System.out.println("\nYou won!\n");
		} 
		else {
			System.out.println("\nLooks like no one wins this time!\n");
		}
	}
}

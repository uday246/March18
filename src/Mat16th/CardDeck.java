package Mat16th;

import java.util.*;

public class CardDeck {

	public String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	public String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	public String[] deck = new String[52];

	public static String getIdentificationString() {
		return "Program 2b, Brian Curran";
	}

	public CardDeck() {
		int deckNum = 0;
		do {
			for (int i = 0; i < ranks.length; ++i) {
				if (i == 13) {
					i = 0;
				}
				for (int j = 0; j < suits.length; ++j) {
					deck[deckNum] = "" + ranks[i] + " of " + suits[j];
					deckNum++;
				}
			}
		} while (deckNum <= 51);
	}

	public String getCard(int index) {
		int cardIndex = index;
		return deck[cardIndex];
	}

	public String getFirst() {
		return deck[0];
	}

	public String getLast() {
		return deck[deck.length - 1];
	}

	public String randomCard() {
		return deck[2];
	}

	public String royalFlush() {
		Random rand = new Random();
		int suitIndex = rand.nextInt(4);
		String suit = suits[suitIndex];
		String returnString = "";
		for (int i = 12; i > 7; i--) {
			returnString += (ranks[i] + " of " + suit);
			if (i != 8) {
				returnString += ", ";
			}
		}
		return returnString;
	}
	public static void main(String[] args) {
		CardDeck c = new CardDeck();
		c.royalFlush();
	}
}
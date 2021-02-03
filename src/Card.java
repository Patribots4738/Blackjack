package src;

import java.util.ArrayList;

public class Card {
	
	// indices in the array correspond to values of the ints in the card constructor
	public static String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	public static String[] suits = {"♠","♥","♦","♣"};

	int value;
	int suit;

	/**
	 * @param value from 0 - 12
	 * @param suit from 0 - 3
	 */
	public Card(int value, int suit) {

		this.value = value;
		this.suit = suit;

	}

	public int getSuit() {

		return this.suit;

	}

	public int getValue() {

		return this.value;

	}

	public String toString() {

		return Card.values[this.value] + Card.suits[this.suit];

	}

	
	/**
	 * This method takes an ArrayList as input and returns the value of the
	 * cards in it as if the cards were in a blackjack hand
	 * @param cards the ArrayList of cards that represents a player's hand
	 */
	public static int calcValue(ArrayList<Card> cards) {

		int[] value = new int[2];

		for (int i = 0; i < cards.size(); i++) {

			int val = cards.get(i).getValue();

			if (val == 12) {

				value[0] += 1;
				value[1] += 11;

			} else {

				value[0] += 2 + (val > 8 ? 8 : val);
				value[1] += 2 + (val > 8 ? 8 : val);

			}

		}

		// If treating the ace as an 11 does not bring the value of the hand, return the
		// value if ace was treated as 11. If the hand is too large, the smaller value is used.

		return (value[1] > value[0] && value[1] <= 21) ? value[1] : value[0];
	}

}
package src;

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

}
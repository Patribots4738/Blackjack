package src;

import java.util.Random;

/**
 * This file should contain a deck of 52 instantiated card classes that has one
 * of each suit and number. Some helpful methods to include would be a shuffle
 * method, a "get next card" method, a constructor, and other utility methods
 * that makes the cards in the first place and puts them into an array.
 */
public class Deck {
	
	/**
	 * This is the card array that is filled with 52 instantiated card classes.
	 * In your constructor, you should fill it up with instances of cards each
	 * with a different suit and value.
	 */ 
	private Card[] deck;

	/**
	 * This is the constructor for the deck class. It is here where you can populate
	 * the deck array and set each of its indices to a new instance of a card with a 
	 * unique suit
	 */
	public Deck() {

		// fills the deck array with 52 blank spaces for you to fill
		this.deck = new Card[52];

		int num = 0;

		for (int suit = 0; suit < 4; suit++) {

			for (int value = 0; value < 13; value++) {

				deck[num] = new Card(value, suit);
				num++;

			}

		}

		// shuffle the deck so it is ready for play.
		this.shuffle();

	}

	/** 
	 * You should return the card that's on the "top" of the deck here.
	 * It is returning null now so that VSCode doesn't give any errors,
	 * so in your version, you will remove it.  
	 */
	public Card getNextCard() {

		return this.deck[0];

	}

	/**
	 * Returns a true or false value of whether the deck is empty or not (true is empty).
	 * The return statement that is there is for VSCode to stop giving errors,
	 * but again you'll remove it in your version
	 */
	public boolean isEmpty() {

		return (this.deck.length == 0) ? true : false;

	}

	public void deleteTopCard() {

		for (int i = 0; i < this.deck.length - 1; i++) {

			this.deck[i] = this.deck[i + 1];

		}

	}

	/**
	 * This method should randomize the cards' positions in the deck so they are
	 * ready to play another game.
	 */
	public void shuffle() {

		Random random = new Random();

		for (int i = 0; i < 5; i++) {

			for (int cards = 0; cards < this.deck.length; cards++) {

				int randomNum = random.nextInt(this.deck.length);
	
				Card currentCard = this.deck[cards];
	
				this.deck[cards] = this.deck[randomNum];
				this.deck[randomNum] = currentCard;
	
			}
	

		}

		this.printDeck();

	}

	public void printDeck() {

		for (int i = 0; i < this.deck.length; i++) {

			System.out.println(this.deck[i]);

		}

	}

}

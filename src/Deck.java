package src;

import java.util.Arrays;

import java.util.Random;

import java.util.ArrayList;
/** 
 * This file should contain a deck of 52 instantiated card classes that
 * has one of each suit and number. Some helpful methods to include would
 * be a shuffle method, a "get next card" method, a constructor, and other utility methods that
 * makes the cards in the first place and puts them into an array.
 */

public class Deck {
	
	/**
	 * This is the card array that is filled with 52 instantiated card classes.
	 * In your constructor, you should fill it up with instances of cards each
	 * with a different suit and value.
	 */ 

	private Card[] deck;

	private int topDeck;
	/**
	 * This is the constructor for the deck class. It is here where you can populate
	 * the deck array and set each of its indices to a new instance of a card with a 
	 * unique suit
	 */

	public Deck() {

		// fills the deck array with 52 blank spaces for you to fill

		this.topDeck = -1;

		this.deck = new Card[52];

		int addCards = 0;

		for (int value = 0; value <= 12; value++) {

			for (int suit = 0; suit <= 3; suit++) {

				this.deck[addCards] = new Card(value, suit);

				addCards++; 
			}
		}

		//System.out.println(Arrays.toString(this.deck));

		// shuffle the deck so it is ready for play.

		this.shuffle();

	}

	
	/** 
	 * You should return the card that's on the "top" of the deck here.
	 * It is returning null now so that VSCode doesn't give any errors,
	 * so in your version, you will remove it.  
	 */

	public Card getNextCard() {

		topDeck++;

		return deck [topDeck];
	}

	/**
	 * Returns a true or false value of whether the deck is empty or not (true is empty).
	 * The return statement that is there is for VSCode to stop giving errors,
	 * but again you'll remove it in your version
	 */

	public boolean isEmpty() {
		return false;
	}

	public ArrayList dealerFirstTwo(){
        
        ArrayList dealer = new ArrayList<Card>();

		System.out.println("Dealer's hand:");

        Card card = this.getNextCard();
		System.out.println(card);
		dealer.add(card);

        card = this.getNextCard();
        System.out.println(card);
        dealer.add(card);

		return dealer;
	}
	
	public ArrayList firstTwo(){

        ArrayList hand = new ArrayList<Card>();
        
        Card card = this.getNextCard();
        System.out.println(card);
        hand.add(card);

        card = this.getNextCard();
        System.out.println(card);
        hand.add(card);

		return hand;
    }
	/**
	 * This method should randomize the cards' positions in the deck so they are
	 * ready to play another game.
	 */
	
	public void shuffle() {

		Random randomizer = new Random();
	
		for (int rando = 1950; rando != 0; rando--) {

			int number = randomizer.nextInt(52);

			Card firstCard = deck[0];

			deck[0] = deck[number];

			deck[number] = firstCard; 
		}
	
	}

}

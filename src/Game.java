package src;
/**
 * This is the main class, like Robot.java in the robot's code.
 * It is here where you will be controlling the deck and the player class
 * to make the game work.
 */
public class Game {
	
	Deck deck;
	double dollars;
	boolean isPlayerTurn;
	/**
	 * You should begin by instantiating (giving values to) the deck and the player
	 * as well as setting the dollars to the initial amount you want
	 */
	public Game() {
		
		deck = new Deck();
		isPlayerTurn = true;

	}

	/**
	 * You will put all of your top level code that controls the blackjack game in this class.
	 * It will take the inputs from the player class, handle them, and proceed to perform any
	 * function the player wants (i.e. hitting, standing, betting) 
	 */
	public void run() {

		while (!deck.isEmpty()) {

			

		}

	}

	public static void main(String[] args) {
		
		Game game = new Game();
		game.run();

	}

}

package src;
import java.util.Scanner;

public class Player {

	Scanner scanner;
	String editedBet;

	public Player() {

		this.scanner = new Scanner(System.in);
		this.editedBet = "";

	}

	public String getMove() {

		System.out.println("Make your move! (hit, stand, or bet):");
		String move = this.scanner.nextLine();

		if (!move.matches("^(hit|stand)$")) {

			System.out.println("Your move is bad and you should feel bad; try again!");
			return this.getMove();

		}
		
		return move;

	}

	public double getBet() {

		System.out.println("Make your bet! (input money value):");

		String bet = this.scanner.nextLine();

		this.editedBet = "";

		for (int i = 0; i < bet.length(); i++) {

			char c = bet.charAt(i);

			if (Character.isDigit(c)) {

				editedBet += c;

			}

		}

		return Double.parseDouble(editedBet);

	}

}

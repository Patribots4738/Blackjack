package src;
import java.util.Scanner;

public class Player {

	Scanner scanner;

	public Player() {

		this.scanner = new Scanner(System.in);

	}

	public String getMove() {

		System.out.println("Make your move! (hit, stand, or doubble):");
		String move = this.scanner.nextLine();

		if (!move.matches("^(hit|stand|doubble)$")) {

			System.out.println("Your move is bad and you should feel bad; try again!");
			return this.getMove();

		}
		
		return move;
	}
	
}



package src;

import java.util.ArrayList;

public class BlackJack{

    Deck deck;

    double dollars;

    public BlackJack() {


    }

    public void run() {

        while (!deck.isEmpty()) {



        }
    }

    public static void main(String[] args) {
    
        Deck deck = new Deck();

        Player player = new Player();

        String move; 
        
        System.out.println("Dealer's first card:");
        //ArrayList opponent = deck.dealerFirstTwo(); | Prints out two cards (different from the dealer's hand?)

        System.out.println("Your cards:");
        ArrayList hand = deck.firstTwo();
        
        boolean isRunning = true;

        while(isRunning == true) {

            move = player.getMove(); 

            if (move.equals("hit")) {

                Card card = deck.getNextCard();
    
                System.out.println(card);                

                hand.add(card);

                Card.calcValue(hand);

                if ((Card.calcValue(hand) == 21)) {

                    System.out.println("Nice you won!");

                    ArrayList dealer = deck.dealerFirstTwo();

                    isRunning = false;
                    
                } else {

                    if (!(Card.calcValue(hand) > 21)) {


                    } else {

                        System.out.println("You bust, your bad.");
                        
                        ArrayList dealer = deck.dealerFirstTwo();
                        
                        isRunning = false;
                    }

                }
                
            }
            
            //if (move.equals("stand")) {
            //}
            
        }
     
    }
        
        //Game game = new Game();
		//game.run();
}
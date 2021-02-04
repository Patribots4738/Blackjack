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

                    isRunning = false;
                    
                } else {

                    if (!(Card.calcValue(hand) > 21)) {

                        
                    } else {

                        System.out.println("You bust, your bad.");

                        isRunning = false;
                    }

                }
                
            }

        }
     
        
    }
        
        //Game game = new Game();
		//game.run();
}
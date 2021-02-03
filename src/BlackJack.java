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

    public void firstTwo(){

        ArrayList hand = new ArrayList<Card>();
        
        Card card = deck.getNextCard();
        System.out.println(card);
        hand.add(card);

        card = deck.getNextCard();
        System.out.println(card);
        hand.add(card);

    }
    
    public static void main(String[] args) {
    
        Deck deck = new Deck();

        Player player = new Player();

        String move; 
        
        ArrayList hand;

        while(true) {

            move = player.getMove(); 

            BlackJack.firstTwo();

            if (move.equals("hit")) {

                Card card = deck.getNextCard();
    
                System.out.println(card);                

                hand.add(card);

            }

            //Card.calcValue(hand)
        }
     
        
    }
        
        //Game game = new Game();
		//game.run();
}
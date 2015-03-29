//CWY
//CardTest 1.0
//3/29/15

import java.util.*;

public class CardTest{
	public static void main(String[] args){
		int numberOfPlayers = 2;//get from gui setup IRL

		Deck deck = new Deck();
		deck.shuffle();
		
		Hand h1 = new Hand();
		Hand h2 = new Hand();


		for (int j=0; j<4; j++){
			Card c = deck.getTopCard();
			h1.add(c);
		}

		for (int i=0; i<4; i++){
			Card c = deck.getTopCard();
			h2.add(c);
		}

		Player p1 = new Player(h1, true);
		Player p2 = new Player(h2, true);

		System.out.println("Player 1's hand:");
		p1.printHand();

		System.out.println("Player 2's hand:");
		p2.printHand();
	}


}
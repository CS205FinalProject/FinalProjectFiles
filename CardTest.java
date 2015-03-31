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

		h1=deck.createHand(deck);
		h2=deck.createHand(deck);

		Player p1 = new Player(h1, true);
		Player p2 = new Player(h2, true);

		System.out.println("Player 1's hand:");
		p1.printHand();
		
		Card[] outers1 = p1.getOuterCards();
		//System.out.println(outers1[0].getValue());
		System.out.printf("Player 1's outer cards: %d and %d %n", outers1[0].getValue(), outers1[1].getValue());


		// System.out.println("Player 2's hand:");
		// p2.printHand();
		// Card[] outers2 = p2.getOuterCards();
		// System.out.printf("Player 2's outer cards: %d and %d", outers2[0], outers2[1]);



	}


}
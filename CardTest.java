//CWY
//CardTest 1.0
//3/29/15

import java.util.*;

public class CardTest{
	public static void main(String[] args){

		int numberOfPlayers = 2;//get from gui setup IRL

		Player p1 = new Player();
		Player p2 = new Player();

		Deck deck = new Deck();
		deck.shuffle();
		
		deal(deck, numberOfPlayers);

	}

	public void deal(Deck deck, int numberOfPlayers){
		for (int i=0; i<numberOfPlayers; i++){
			for (int j=0; j<4; j++){

			}
		}
	}

}
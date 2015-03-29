//CWY
//CardTest 1.0
//3/29/15

import java.util.*;

public class CardTest{
	public static void main(String[] args){
		Deck deck = new Deck();
		deck.printDeck();
		System.out.println("Shuffle");
		deck.shuffle();
		deck.printDeck();
	}
}
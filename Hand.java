// CWY
// Hand v1.0
// 3/22/15

import java.util.*;

public class Hand{

	private ArrayList <Card> hand;
	private Deck deck;
	
	//Constructor
	public Hand(){
		hand = new ArrayList<Card>();
	}//Constructor
	
	public void add(Card card){
		hand.add(card);
	}//add
	
	public void printHand(){
		for (int i=0; i<hand.size(); i++){
			System.out.println(hand.get(i).getValue());
		}
	}
	
	public void clear(){
		hand.clear();
	}//clear
	
	
}//Hand
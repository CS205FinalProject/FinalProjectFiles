// CWY
// Pile v1.0
// 3/22/15

import java.util.*;

public class DiscardPile{

	private ArrayList <Card> pile;
	private Deck deck;
	private String deckImg;
	
	//Constructor
	public DiscardPile(){
		pile = new ArrayList<Card>();
	}//Constructor
	
	public void add(Card card){
		pile.add(card);
	}//add
	
	public Card getTop(){
		Card topC = pile.get(0);
	}
	
	public void clear(){
		pile.clear();
	}//clear
	
	
}//Hand
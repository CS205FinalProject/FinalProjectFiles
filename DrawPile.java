// CWY
// Pile v1.0
// 3/22/15

import java.util.*;

public class DrawPile{

	private String pileType;
	private ArrayList <Card> pile;
	private Deck deck;
	private String deckImg;
	
	//Constructor
	public DrawPile(){
		pile = new ArrayList<Card>();

		if(pileType=="draw"){
			deckImg = "cardBack.jpg";
		}else{
			Card c = getTop();
			c.getValue();
		}


	}
	
	public void add(Card card){
		pile.add(card);
	}//add
	
	public Card getTop(){
		return pile.get(0);
		pile.remove(0);
	}

	public void clear(){
		pile.clear();
	}//clear
	
	
}//Hand
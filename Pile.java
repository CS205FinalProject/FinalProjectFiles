// CWY
// Pile v1.0
// 3/22/15

import java.util.*;

public class Pile{

	private String pileType;
	private ArrayList <Card> discardPile;
	private Deck deck;
	private String deckImg;
	
	//Constructor
	public Pile(){
		discardPile = new ArrayList<Card>();
	}
	
	public void discardAdd(Card card){
		discardPile.add(card);
	}//add
	
	public Card getTopDrawPile(){
		Card c = deck.getTopCard();
		return c;
	}

	public void clear(ArrayList<Card> pile){
		pile.clear();
	}//clear deck or discard
	
}//Hand
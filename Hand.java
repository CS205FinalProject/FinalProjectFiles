// CWY
// Hand v1.0
// 3/22/15

import java.util.*;

public class Hand{

	public ArrayList <Card> hand;
	public Deck deck;
	
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

	public Card[] getOuterCards(){
		// Card left = hand.get(0);
		// Card right = hand.get(3);
		Card[] outers = new Card[2];
		outers[0] = hand.get(0);
		outers[1] = hand.get(3);
		return outers;
	}
	
	public void clear(){
		hand.clear();
	}//clear
   
   public void remove(int i)
   {
      hand.remove(i);
   }
   
   public int getValue()
   {
      int x = hand.get(0).getValue() + hand.get(1).getValue() + hand.get(2).getValue() + hand.get(3).getValue();
      return x;
   }
	
	
}//Hand
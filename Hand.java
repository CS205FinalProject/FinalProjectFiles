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
		
		int loc = hand.size();
      		card.setLocation(loc);
      		hand.add(card);
	}//add
   
   public void add(int x , Card card){
		hand.add(x, card);
	}//add
	
	public void printHand(){
		for (int i=0; i<hand.size(); i++){
			System.out.println(hand.get(i).getValue());
		}
	}
	public void setCard(int i, Card c)
   	{
      		c.setLocation(i);
      		hand.set(i,c);
         
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
      int x = 0;
      int value = 9; 
      
      
      for(int i = 0; i <4; i++){
            if(hand.get(i).getValue() > value){
               x = x+10;
            }else{
               x = x + hand.get(i).getValue();
            }
         }//end of for
      
      
      //hand.get(0).getValue() + hand.get(1).getValue() + hand.get(2).getValue() + hand.get(3).getValue();
      return x;
   }
	
	
}//Hand

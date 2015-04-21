// CWY
// Deck v1.0
// 3/22/15

import java.util.*;


public class Deck{
	private ArrayList<Card> list;

	//Constructor
	public Deck(){
		list = new ArrayList<Card>();

		for (int i=0; i<9; i++) {
			for (int j=0; j<4; j++) {
				Card card = new Card(i);
				list.add(card);
			}
		}
		for (int k=0; k<9; k++){
			Card c = new Card(9);
			list.add(c);
		}
		for (int p=0; p<3; p++){
			for (int q=10; q<13; q++){
				Card cc = new Card(q);
				list.add(cc);
			}
		}
	}


	//shuffle deck of 54 cards
	public void shuffle(){
		for(int i=0; i<list.size(); i++){
			Card t = list.get(i);
			Random generator = new Random();
			int r = generator.nextInt(list.size()-1);
			Card t2 = list.get(r);
			list.set(r,t);
			list.set(i,t2);
		}	
	}
   public void addCard(Card c)
   {
      list.add(0,c);
   }
	public Card getTopCard()
   {
		Card topC = list.get(0);
		return topC;
	}
   public void removeTopCard()
   {
      list.remove(0);
   }
   public void setTopCard(Card c)
   {
      if (list.size() != 0)
      {
         list.set(0,c);
      }
      else 
      {
         list.add(0,c);
      }
   }

	public void printDeck(){
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getValue());
		}
	}
   public boolean isEmpty()
   {
      if (list.size() == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   
   
   public void emptyDeck()
   {
      list = new ArrayList<Card>();
      
   }


}

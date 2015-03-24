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

	public Card getTopCard(){
		Card topC = list.get(0);
		list.remove(topC);
		return topC;
	}



}
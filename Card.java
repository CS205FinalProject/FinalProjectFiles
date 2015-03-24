// CWY
// Card v1.0
// 3/22/15


public class Card{
	private int value;//0-9, 10 for Draw2, 11 for Peek, 12 for Swap
	private String pictureName;

	//Constructor
	public Card(int v){
		value=v;
	}

	public int getValue(Card card){
		return value;
	}

}
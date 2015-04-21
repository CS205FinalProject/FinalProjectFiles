// CWY
// Card v1.0
// 3/22/15


public class Card{
	private int value;//0-9, 10 for Draw2, 11 for Peek, 12 for Swap
	private String pictureName;
	private boolean known = false;
   	private int location =0;

	//Constructor
	public Card(int v){
		value=v;
	}

	public int getValue(){
		return value;
	}
	   public boolean isKnown()
   {
      return known;
      
   }
   public void setKnown(boolean x)
   {
      if (x == true)
      {
         known = true;
      }
      else if (x == false)
      {
         known = false;
      }
      else
      {
         known = known;
      }
      
      
      
   }
   public void setLocation(int i)
   {
      location = i;
   }
   
   public int getLocation()
   {
      return location;
   
   }

}

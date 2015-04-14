import java.util.ArrayList;

/**The player class is going to accept an array of cards and return the following
 * the players hand
 * the players score
 * and whether or not it is a user or a computer.
 */
public class Player{	
	
	Hand hand = new Hand();
	int score;
	boolean human;
   boolean inGame;

	public Player(Hand h, boolean p)
	{
		hand = h;
		human = p; //p is true if player is a human, false if computer
      getScore();
	}
   
   public Player()
   {
      
   }
	
   public Player(Player object)
   {
      hand = object.hand;
      score = object.score;
      human = object.human;
      inGame = object.inGame;
      
      getScore();
      
   }
	//this method will return the score of the player or computers hand
	public double getScore()
	{
      score = hand.getValue();
		return score;
	}
   
   public void setScore(int x)
   {
      score = x;   
   }
	
	//the hand method returns the players/computers hand
	public Hand getHand()
	{
		return hand;
	}
   
   public void addHand(Hand x)
   {
      hand = x;
      getScore(); 
   }

	public Card[] getOuterCards(){
		return hand.getOuterCards();
	}

	public void printHand(){
		hand.printHand();
	}

	//method to display whether or not the user is a computer or a person
	public boolean isHuman()
	{
		return human;
	}
   
   public void setHuman(boolean x)
   {
      human = x; 
   }
   
   public boolean isInGame()
   {
      return inGame; 
   }
   
   public void setInGame(boolean x)
   {
      inGame = x; 
   }
   
   
	
}

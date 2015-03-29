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

	public Player(Hand h, boolean p)
	{
		hand = h;
		human = p; //p is true if player is a human, false if computer
	}
	
	//this method will return the score of the player or computers hand
	public double Score()
	{
		return score;
	}
	
	//the hand method returns the players/computers hand
	public Hand getHand()
	{
		return hand;
	}

	public void printHand(){
		hand.printHand();
	}

	//method to display whether or not the user is a computer or a person
	public boolean isHuman()
	{
		return human;
	}
	
}

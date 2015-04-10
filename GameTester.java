//GameTester
//3-30-2015
//made by Kai Maynard

/*This harness works to show how the AI works when interacting with a some of the elements of the game
it is designed to show the discard decision process, but also how the game will associate ownership
of players cards*/

public class GameTester
{
   public static void main(String[]args)
   {
   
      Deck deck = new Deck();
      deck.removeTopCard();
      
      Deck discard = new Deck();
      discard.emptyDeck();

      deck.shuffle();
      
      Hand p1Hand = new Hand();//making of the player just for comparison
      p1Hand.add(deck.getTopCard());
      deck.removeTopCard();
      p1Hand.add(deck.getTopCard());
      deck.removeTopCard();
      p1Hand.add(deck.getTopCard());
      deck.removeTopCard();
      p1Hand.add(deck.getTopCard());
      deck.removeTopCard();
      
      
      
      Hand p2Hand = new Hand();//making of AI's hand
      p2Hand.add(deck.getTopCard());
      deck.removeTopCard();
      p2Hand.add(deck.getTopCard());
      deck.removeTopCard();
      p2Hand.add(deck.getTopCard());
      deck.removeTopCard();
      p2Hand.add(deck.getTopCard());
      deck.removeTopCard();

      Player p1 = new Player(p1Hand,true);
      AIBasic ai = new AIBasic();
      ai.setHand(p2Hand);

      
                  //prints the contents of the hands
      System.out.println("player 1 hand includes: " + p1Hand.getCard(0).getValue() + " " + p1Hand.getCard(1).getValue() + " " +p1Hand.getCard(2).getValue() + " " + p1Hand.getCard(3).getValue());
      System.out.println("Artificial player hand includes : " + ai.getHand().getCard(0).getValue() + " " + ai.getHand().getCard(1).getValue() + " " +ai.getHand().getCard(2).getValue() + " " + ai.getHand().getCard(3).getValue());
      System.out.println("");
                  //some random cards to go into the discard
      Card testCard1 = new Card(2);
      Card testCard2 = new Card(0);
      Card testCard3 = new Card(4);
      Card testCard4 = new Card(7);
      //this is runs the AI algorithm  
      discard.setTopCard(testCard1);
      System.out.println("top card of discard is " + discard.getTopCard().getValue());
      ai.discardAI(discard);
      System.out.println("");
      System.out.println("Artificial player hand includes : " + ai.getHand().getCard(0).getValue() + " " + ai.getHand().getCard(1).getValue() + " " +ai.getHand().getCard(2).getValue() + " " + ai.getHand().getCard(3).getValue()); 
      System.out.println("");
      //this runs the ai algorithm again
      discard.removeTopCard();
      discard.setTopCard(testCard2);
      System.out.println(discard.getTopCard().getValue());
      System.out.println("");
      System.out.println("top card of discard is " + discard.getTopCard().getValue());
      ai.discardAI(discard);
      System.out.println("Artificial player hand includes : " + ai.getHand().getCard(0).getValue() + " " + ai.getHand().getCard(1).getValue() + " " +ai.getHand().getCard(2).getValue() + " " + ai.getHand().getCard(3).getValue());
      System.out.println("");
      
      
   }
}

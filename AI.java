public class AIBasic
{
   private Card card1;
   private Card card2;
   private Card card3;
   private Card card4;
   private Hand hand;
   private boolean card1Known = false;
   private boolean card2Known = false;
   private boolean card3Known = false;
   private boolean card4Known = false;
   private boolean hasPlayed = false;
   private int numUnknowns = 0;
   private boolean ratatat = false;
   
   public void AIBasic()
   {
   
   }
   public void setHand(Hand h)
   {
   hand = h;
   card1 = hand.getCard(0);
   hand.getCard(0).setKnown(true);
   card2 = hand.getCard(1);
   card3 = hand.getCard(2);
   card4 = hand.getCard(3);
   hand.getCard(3).setKnown(true);
   
   card1Known = true;
   card4Known = true;
   numUnknowns = 2;
   
   }
   public Hand getHand()
   {
      Hand rtrnHand = hand;
      return rtrnHand;
   }
   
   
   public Card compareCard(Card Newcard)//compares a card to the cards in the players hand
   {
      if ((Newcard.getValue() < card1.getValue()) && (card1Known = true))//checks if new card is less than the
      {            

            System.out.println("less than card1 " + card1Known);
            return card1;   
      }
      else if ((Newcard.getValue() < card2.getValue()) && (card2Known = true))
      {     
            System.out.println("less than card2 " + card2Known);
            return card2;    
      }
      else if ((Newcard.getValue() < card3.getValue()) && (card3Known = true))
      {
            System.out.println("less than card2 " + card3Known);
            return card3;
      }
      else if ((Newcard.getValue() < card4.getValue()) && (card4Known = true))
      {
            System.out.println("less than card2 " + card4Known);
            return card4;
      }
      else if ((Newcard.getValue() > 9 ) || (Newcard.getValue() < 13))// >13 indicates its a power card
      {
         System.out.println(Newcard.getValue());
         return Newcard;
      }
      else
      {
         Card greaterCard = new Card(13); //represents a failed search where it wouldnt be good to tape the top.
         return greaterCard;
      }
   }
   
   public void discardAI(Deck discard)//this figures out the first possible move the player might make
   {
      if (discard.isEmpty() == false)
      {
         Card discardTop;
         discardTop = compareCard(discard.getTopCard());//runs the compare card method
      
         if (discardTop.getValue() == card1.getValue())
         {
            Card placeHolder = discard.getTopCard();//takes the top card of the discard and replaces it
            System.out.println("goint into card 1");
            discard.removeTopCard();
            discard.setTopCard(hand.getCard(0));    //with the card in that players hand
            card1 = placeHolder;
            hand.setCard(0, placeHolder);
            card1Known = true;
            hasPlayed = true;//triggers the end of the turn
            System.out.println("top card of discard is " + discard.getTopCard().getValue());
         }
         else if (discardTop.getValue() == card2.getValue())
         {
            Card placeHolder = discard.getTopCard();//same as above just with card2
            System.out.println("goint into card 2");
            discard.removeTopCard();
            discard.setTopCard(hand.getCard(1));
            card2 = placeHolder;
            hand.setCard(1, placeHolder);
            card2Known = true;
            hasPlayed = true;
            System.out.println("top card of discard is " + discard.getTopCard().getValue());
         }
         else if (discardTop.getValue() == card3.getValue())//same as above but with card3
         {
            Card placeHolder = discard.getTopCard();
            System.out.println("goint into card 3");
            discard.removeTopCard();
            discard.setTopCard(hand.getCard(2));
            card3 = placeHolder;
            hand.setCard(2, placeHolder);
            card3Known = true;
            hasPlayed = true;
            System.out.println("top card of discard is " + discard.getTopCard().getValue());
         }
         else if (discardTop.getValue() == card4.getValue())//same as above but with card4
         {
            Card placeHolder = discard.getTopCard();
            System.out.println("goint into card 4");
            discard.removeTopCard();
            discard.setTopCard(hand.getCard(3));
            card1 = placeHolder;
            hand.setCard(3, placeHolder);
            card4Known = true;
            hasPlayed = true;
            System.out.println("top card of discard is " + discard.getTopCard().getValue());
         }
         else if (discard.getTopCard().getValue() < 4  && numUnknowns > 0)//all their cars are less than the top, but they have unknowns.
         {
            for (int i=0; i<3; i++)//this loop replaces that card with the first unknown
            {
               if ((hand.getCard(i).isKnown() == false) || (hand.getCard(i).getValue() > 9))
               {
                  Card placeHolder = discard.getTopCard();
                  System.out.println("goint into card "+ i);
                  discard.removeTopCard();
                  discard.setTopCard(hand.getCard(i));
                  hand.setCard(i,placeHolder);
                  i = 3;
                  hasPlayed = true;
                  
               }
            }
         }
//          else
//          {
//             hasPlayed = false;//reassures that the player has not made a move. probably will delete this, but w/e
//          }  
      }  
   }
}

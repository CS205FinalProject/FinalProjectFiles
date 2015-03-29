
// Chris Hutchinson 
// CS205: Software Engineering 
// Project: Rat-a-tat-cat 
// Play Game class 
// Version: 1.0
// March 24, 2015 

class PlayGame {

   int roundNumber = 0; //field variable for keeping track of the round number
   int player1 = 0,
   player2 = 0,
   player3 = 0,
   player4 = 0; //score for the players in the game. 

   public static void main(String[] args) throws Exception {
   
     
      
   }//end of main 
   
   
   
   //constructor method for starting a game with two players
   public PlayGame(Player p1, Player p2){
   
      //creating deck for the game 
      gameDeck = Deck();
      
      //shuffle the deck
      gameDeck.shuffle();
      
      //create hands 
      p1Hand = Hand(); 
      p2Hand = Hand();
      
      for(int i =0;i<5;i++){
         p1Hand.add(gameDeck.getTopCard());
         p2Hand.add(gameDeck.getTopCard());
      }
      
      //create players
      p1.addHand(p1Hand);
      p1.setType(true);
      p1.setScore(0);
      
      p2.addHand(p2Hand);
      p2.setType(false);
      p2.setScore(0);
      
      //Create Discard Pile
      gameDiscardPile = DiscardPile();
      gameDiscardPile.add(gameDeck.getTopCard());
      
      
      
      
      
   
      
   
   }//end of PlayGame
   
   //constructor method for starting a game with three players
   public PlayGame(Player p1, Player p2, Player p3){
   
      //creating deck for the game 
      gameDeck = Deck();
      
      //shuffle the deck
      gameDeck.shuffle();
      
      //create hands 
      p1Hand = Hand(); 
      p2Hand = Hand();
      p3Hand = Hand();
      
      for(int i =0;i<5;i++){
         p1Hand.add(gameDeck.getTopCard());
         p2Hand.add(gameDeck.getTopCard());
         p3Hand.add(gameDeck.getTopCard());
      }
      
      //create players
      p1.addHand(p1Hand);
      p1.setType(true);
      p1.setScore(0);
      
      p2.addHand(p2Hand);
      p2.setType(false);
      p2.setScore(0);
      
      p3.addHand(p3Hand);
      p3.setType(false);
      p3.setScore(0);
      
      //Create Discard Pile
      gameDiscardPile = DiscardPile();
      gameDiscardPile.add(gameDeck.getTopCard());
      
   
   }//end of PlayGame
   
   
   //constructor method for starting a game with four players
   public PlayGame(Player p1, Player p2, Player p3, Player p4){
   
      //creating deck for the game 
      gameDeck = Deck();
      
      //shuffle the deck
      gameDeck.shuffle();
      
      //create hands 
      p1Hand = Hand(); 
      p2Hand = Hand();
      p3Hand = Hand();
      p4hand = Hand();
      
      for(int i =0;i<5;i++){
         p1Hand.add(gameDeck.getTopCard());
         p2Hand.add(gameDeck.getTopCard());
         p3Hand.add(gameDeck.getTopCard());
         p4Hand.add(gameDeck.getTopCard());
      }
      
      //create players
      p1.addHand(p1Hand);
      p1.setType(true);
      p1.setScore(0);
      
      p2.addHand(p2Hand);
      p2.setType(false);
      p2.setScore(0);
      
      p3.addHand(p3Hand);
      p3.setType(false);
      p3.setScore(0);
      
      p4.addHand(p4Hand);
      p4.setType(false);
      p4.setScore(0);
      
      //Create Discard Pile
      gameDiscardPile = DiscardPile();
      gameDiscardPile.add(gameDeck.getTopCard());
   
   
      
   
   }//end of PlayGame
   
   //method that holds the functionality of the peek card. allows the user to look at one of the cards that
   //in face down in their own hand. 
   public void peekCard(Player player){
      //player is addressed that he gets to peek at one of the face down cards that he has in his hand 
      
      
   
   
   
   
   }//end of peekCard 
   
   
   //method that holds the functionality of the swap card. allows the user to swap his card with the card of 
   // another player in the game without looking at cards. 
   public void swapCard(Hand hand1, Hand hand2){
   
   
   
   
   }//end of swapCard 
   
   
   //method that holds the functionality of the draw two card. allows the user draws a draw2 card then the user can 
   //draw another card from the pile, and may use this card as if it were a noemal turn. however if it is a number card
   // and is discarded, or if it is a power card and the player decides not to use it, the player then picks another card from the pile
   // and plays thay as if it were a normal turn. 
   public void draw2Card(Hand hand, Pile pile){
   
   
   
   }//end of draw2Card
   
   //method that decides how the game is ended. This method decides that the game is going to end in a predefined
   // amount of time. 
   public boolean endOfGameTime(int time){
   
   
   }//end of endOfGameTime
   
   
   //method that decides how the game is ended. This method decides that the game is going to end in a predefined 
   // amount of rounds. 
   public boolean endOfGameRounds(int rounds){
   
   
   
   
   }//end of endOfGameRounds
   
   
   
   //method that decides how the game is ended. This method decides that the game is going to end by kicking a player out 
   // every rounds with the highest score until there is only one person left. 
   public boolean endOfGameElimination(int roundStart, int numberPlayers){
   
   
   
   }//end of endOfGameElimination 
   
   //methos that checks the value of a card object and test it to see if it is a power card. If the card passed to the function
   // is a power card then it will call the function that invokes the power cards abilities. 
   
   
   
   
   
}//end of class 
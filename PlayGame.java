import java.util.*;

// Chris Hutchinson 
// CS205: Software Engineering 
// Project: Rat-a-tat-cat 
// Play Game class 
// Version: 1.0
// March 24, 2015 

class PlayGame {

   int roundNumber = 0; //field variable for keeping track of the round number
   boolean gameOver = false; // variabel to kick out of game when final round is reached 
   int gameOverRound; // number of rounds that are suppose to be played before the game is over 
   boolean roundOver = false; 
   Player currPlayer;
   Deck gameDeck;
   Deck gameDiscardPile;
   
   
   Player p1 = new Player();
   Player p2 = new Player();
   Player p3 = new Player();
   Player p4 = new Player();

   public static void main(String[] args) throws Exception {
   
     // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in); 
   
      //player is addressed that he gets to swap one of the cards in his hand for the card in another players hand 
      System.out.println("How many opponents do you want to play against, 1, 2, or 3: ");
      int choice = keyboard.nextInt();
      
      //error checking 
      while(choice != 1 && choice != 2 && choice != 3){
         System.out.println("How many opponents do you want to play against, 1, 2, or 3: ");
         choice = keyboard.nextInt();
      
      }

   
     PlayGame game = new PlayGame(choice);
      
   }//end of main 
   
   
//////////////////////////////////////////////////// Play Game 2 Players  /////////////////////////////////////////////////////////////   
   
   
   //constructor method for starting a game with two players
  /* public PlayGame(Player p1, Player p2){
      
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in); 
      
      
      //creating deck for the game 
      gameDeck = new Deck();
      
      //shuffle the deck
      gameDeck.shuffle();
      
      //create hands 
      Hand p1Hand = new Hand(); 
      Hand p2Hand = new Hand();
      
      for(int i =0;i<4;i++){
         p1Hand.add(gameDeck.getTopCard());
         p2Hand.add(gameDeck.getTopCard());
      }
      
      //create players
      p1.addHand(p1Hand);
      p1.setHuman(true);
      p1.setScore(0);
      p1.setInGame(true);
      
      p2.addHand(p2Hand);
      p2.setHuman(false);
      p2.setScore(0);
      p2.setInGame(true);
      
      //Create Discard Pile
      gameDiscardPile = new Deck();
      gameDiscardPile.emptyDeck();
      gameDiscardPile.setTopCard(gameDeck.getTopCard());
      
      
      System.out.println("How many Rounds would you like this game to last");
      int choice = keyboard.nextInt();
      
      while( choice <1 || choice>99){
         System.out.println("How many Rounds would you like this game to last");
         choice = keyboard.nextInt();
      
      }
      gameOverRound = choice;
      
      while(!gameOver){
            roundOver = false;
         while(!roundOver){
         
            System.out.println("------------------------");
            System.out.println("Player 1 Score " + p1.score);
            System.out.println("------------------------");
            System.out.println("Player 1 Hand ");
            p1.getHand().printHand();
            System.out.println("------------------------");
            System.out.println("Player 1 Human "+p1.human); 
            System.out.println("Player 1 In Game " +p1.inGame);   
            System.out.println("\n");
            
            if(p1.inGame == true){
            drawCard(p1);
            callRat(p1);
            }//end of if 
            
            if(p2.inGame == true){
            drawCard(p2);
            callRat(p2);
            }//end of if
            
            
            if(p3.inGame == true){
            drawCard(p3);
            callRat(p3);
            }//end of if
            
            
            if(p4.inGame == true){
            drawCard(p4);
            callRat(p4);
            }//end of if
         
         }//end of while
     roundNumber = roundNumber+1; 
     System.out.println("RoundOver number "+ gameOverRound);
     System.out.println("Round number : " + roundNumber);
     System.out.println("Round Over"); 
     endOfGameRounds(roundNumber,gameOverRound);
     
     
    }//end of gameOver While loop   
    System.out.println("Game Over");
      
   
   }//end of PlayGame
   
   
//////////////////////////////////////////////////// Play Game 3 Players  /////////////////////////////////////////////////////////////   
   
   
   //constructor method for starting a game with three players
   public PlayGame(Player p1, Player p2, Player p3){
      
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in); 
      
      
      //creating deck for the game 
      gameDeck = new Deck();
      
      //shuffle the deck
      gameDeck.shuffle();
      
      //create hands 
      Hand p1Hand = new Hand(); 
      Hand p2Hand = new Hand();
      Hand p3Hand = new Hand();
      
      for(int i =0;i<4;i++){
         p1Hand.add(gameDeck.getTopCard());
         p2Hand.add(gameDeck.getTopCard());
         p3Hand.add(gameDeck.getTopCard());
      }
      
      //create players
      p1.addHand(p1Hand);
      p1.setHuman(true);
      p1.setScore(0);
      p1.setInGame(true);
     
      p2.addHand(p2Hand);
      p2.setHuman(false);
      p2.setScore(0);
      p2.setInGame(true);
      
      p3.addHand(p3Hand);
      p3.setHuman(false);
      p3.setScore(0);
      p3.setInGame(true);
      
      //Create Discard Pile
      gameDiscardPile = new Deck();
      gameDiscardPile.emptyDeck();
      gameDiscardPile.setTopCard(gameDeck.getTopCard());
      
      
      System.out.println("How many Rounds would you like this game to last");
      int choice = keyboard.nextInt();
      
      while( choice <1 || choice>99){
         System.out.println("How many Rounds would you like this game to last");
         choice = keyboard.nextInt();
      
      }
      gameOverRound = choice;
      
      while(!gameOver){
            roundOver = false;
         while(!roundOver){
         
            System.out.println("------------------------");
            System.out.println("Player 1 Score " + p1.score);
            System.out.println("------------------------");
            System.out.println("Player 1 Hand ");
            p1.getHand().printHand();
            System.out.println("------------------------");
            System.out.println("Player 1 Human "+p1.human); 
            System.out.println("Player 1 In Game " +p1.inGame);   
            System.out.println("\n");
            
            if(p1.inGame == true){
            drawCard(p1);
            callRat(p1);
            }//end of if 
            
            if(p2.inGame == true){
            drawCard(p2);
            callRat(p2);
            }//end of if
            
            
            if(p3.inGame == true){
            drawCard(p3);
            callRat(p3);
            }//end of if
            
            
            if(p4.inGame == true){
            drawCard(p4);
            callRat(p4);
            }//end of if
         
         }//end of while
     roundNumber = roundNumber+1; 
     System.out.println("RoundOver number "+ gameOverRound);
     System.out.println("Round number : " + roundNumber);
     System.out.println("Round Over"); 
     endOfGameRounds(roundNumber,gameOverRound);
     
     
    }//end of gameOver While loop   
    System.out.println("Game Over");
      
   
   }//end of PlayGame*/
   

//////////////////////////////////////////////////// Play Game 4 Players  /////////////////////////////////////////////////////////////
   
   //constructor method for starting a game with four players
   public PlayGame(int x){
      
      if(x ==1){
          p1.setInGame(true);
          p2.setInGame(true);
          p3.setInGame(false);
          p4.setInGame(false);
          
          
      }else if(x ==2){
      
          p1.setInGame(true);
          p2.setInGame(true);
          p3.setInGame(true);
          p4.setInGame(false);
      
      }else{
          p1.setInGame(true);
          p2.setInGame(true);
          p3.setInGame(true);
          p4.setInGame(true);
      
      }
      
      roundNumber = 0;
      
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in); 
      
      
      //creating deck for the game 
      gameDeck = new Deck();
      
      //shuffle the deck
      gameDeck.shuffle();
      
      //create hands 
      Hand p1Hand = new Hand(); 
      Hand p2Hand = new Hand();
      Hand p3Hand = new Hand();
      Hand p4Hand = new Hand();
      
      for(int i =0;i<4;i++){
         p1Hand.add(gameDeck.getTopCard());
         p2Hand.add(gameDeck.getTopCard());
         p3Hand.add(gameDeck.getTopCard());
         p4Hand.add(gameDeck.getTopCard());
      }
      
      //create players
      p1.addHand(p1Hand);
      p1.setHuman(true);
      p1.setScore(0);
     
      
      p2.addHand(p2Hand);
      p2.setHuman(false);
      p2.setScore(0);
      
      
      p3.addHand(p3Hand);
      p3.setHuman(false);
      p3.setScore(0);
      
      
      p4.addHand(p4Hand);
      p4.setHuman(false);
      p4.setScore(0);
      
      
      //Create Discard Pile
      gameDiscardPile = new Deck();
      gameDiscardPile.emptyDeck();
      gameDiscardPile.setTopCard(gameDeck.getTopCard());
      
      
      System.out.println("How many Rounds would you like this game to last");
      int choice = keyboard.nextInt();
      
      while( choice <1 || choice>99){
         System.out.println("How many Rounds would you like this game to last");
         choice = keyboard.nextInt();
      
      }
      gameOverRound = choice;
      
      while(!gameOver){
            roundOver = false;
         while(!roundOver){
         
            System.out.println("------------------------");
            System.out.println("Player 1 Score " + p1.score);
            System.out.println("------------------------");
            System.out.println("Player 1 Hand ");
            p1.getHand().printHand();
            System.out.println("------------------------");
            System.out.println("Player 1 Human "+p1.human); 
            System.out.println("Player 1 In Game " +p1.inGame);   
            System.out.println("\n");
            
            if(p1.inGame == true){
            drawCard(p1);
            callRat(p1);
            }//end of if 
            
            if(p2.inGame == true){
            drawCard(p2);
            callRat(p2);
            }//end of if
            
            
            if(p3.inGame == true){
            drawCard(p3);
            callRat(p3);
            }//end of if
            
            
            if(p4.inGame == true){
            drawCard(p4);
            callRat(p4);
            }//end of if
         
         }//end of while
     roundNumber = roundNumber+1; 
     System.out.println("RoundOver number "+ gameOverRound);
     System.out.println("Round number : " + roundNumber);
     System.out.println("Round Over"); 
     endOfGameRounds(roundNumber,gameOverRound);
     
     
    }//end of gameOver While loop   
    System.out.println("Game Over");
   }//end of PlayGame
   
   
//////////////////////////////////////////////////// Peek Card  /////////////////////////////////////////////////////////////   
   
   
   //method that holds the functionality of the peek card. allows the user to look at one of the cards that
   //in face down in their own hand. 
   public void peekCard(Player player){
   
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in); 
   
      //player is addressed that he gets to peek at one of the face down cards that he has in his hand 
      System.out.println("Which card in you hand do you want to take a peek at 1, 2, 3, or 4: ");
      int choice = keyboard.nextInt(); 
      
      //error checking 
      while(choice != 1 && choice != 2 && choice != 3 && choice != 4){
         System.out.println("Which card in you hand do you want to look at 1, 2, 3, or 4: ");
         choice = keyboard.nextInt();
      
      }
      Hand temp = player.getHand();
      int cardValue = temp.hand.get(choice-1).getValue();
      
      //show card to user 
      System.out.println("You have choosen to peek at the number "+choice+" card in your hand.");
      if(cardValue > 9){
      
          if(cardValue == 10){
             System.out.println("The card is a Draw2 power card.");  
          }
          else if(cardValue == 11){
             System.out.println("The card is a Peek power card.");
          }
          else{
             System.out.println("The card is a Swap power card.");                                                
          }//end of else
      
          }//end of if 
      else{
         System.out.println("The card is a "+cardValue+".");
      }//end of else
      
   
   
   
   
   }//end of peekCard 
   
   
   
   
//////////////////////////////////////////////////// Swap Card  /////////////////////////////////////////////////////////////   
   
   
   
   //method that holds the functionality of the swap card. allows the user to swap his card with the card of 
   //another player in the game without looking at cards. 
   public void swapCard(Player p1, Player p2, Player p3, Player p4){
   
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in); 
   
      //player is addressed that he gets to swap one of the cards in his hand for the card in another players hand 
      System.out.println("Which player do you want to swap a card with 1, 2, 3, or 4: ");
      int choice1 = keyboard.nextInt();
      
      //error checking 
      while(choice1 != 1 && choice1 != 2 && choice1 != 3 && choice1 != 4){
         System.out.println("Which player do you want to swap a card with 1, 2, 3, or 4: ");
         choice1 = keyboard.nextInt();
      
      }
      
      // player is prompted to ask which card in his hand does he want to swap with another player 
      System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
      int choice2 = keyboard.nextInt();
      
      //error checking 
      while(choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4){
         System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
         choice2 = keyboard.nextInt();
      
      }
      
      // player is prompted to ask which card from the players of his choice does he want swap 
      System.out.println("Which card in the player hand do you wanna swap you card of choice with 1, 2, 3, or 4: ");
      int choice3 = keyboard.nextInt();
      
      //error checking 
      while(choice3 != 1 && choice3 != 2 && choice3 != 3 && choice3 != 4){
         System.out.println("Which card in the player hand do you wanna swap you card of choice with 1, 2, 3, or 4: ");
         choice3 = keyboard.nextInt();
      
      }
      choice2 = choice2 -1;
      choice3 = choice3 -1; 
      
      
      
      if(choice1 == 2){
         p1.printHand();
         Hand temp = p1.getHand();
         Card swapCard1 = temp.hand.get(choice2);
         Hand temp2 =p2.getHand();
         Card swapCard2 = temp2.hand.get(choice3); 
         p1.hand.remove(choice2);
         p1.hand.add(swapCard2);
         //p1.hand.add(choice2,swapCard2);
         p2.hand.remove(choice3);
         p2.hand.add(swapCard1);
         //p2.hand.add(choice4,swapCard1);
      }
      else if(choice1 ==3){
         Hand temp = p1.getHand();
         Card swapCard1 = temp.hand.get(choice2);
         Hand temp2 =p3.getHand();
         Card swapCard2 = temp2.hand.get(choice3); 
         p1.hand.remove(choice2);
         p1.hand.add(swapCard2);
         ////p1.hand.add(choice2,swapCard2);
         p3.hand.remove(choice3);
         p3.hand.add(swapCard1);
         //p3.hand.add(choice4,swapCard1);
      }
      else{
         Hand temp = p1.getHand();
         Card swapCard1 = temp.hand.get(choice2);
         Hand temp2 =p4.getHand();
         Card swapCard2 = temp2.hand.get(choice3);
         p1.hand.remove(choice2);
         p1.hand.add(swapCard2);
         //p1.hand.add(choice2,swapCard2);
         p4.hand.remove(choice3);
         p4.hand.add(swapCard1); 
         //p4.hand.add(choice4,swapCard1);
         
      }//end of else 
      
      System.out.println("The cards have been swaped."); 
         
      
      
   
   
   
   
   
   }//end of swapCard 
   
   
   
//////////////////////////////////////////////////// Draw Two Cards  /////////////////////////////////////////////////////////////   
   
   
   
   //method that holds the functionality of the draw two card. allows the user draws a draw2 card then the user can 
   //draw another card from the pile, and may use this card as if it were a noemal turn. however if it is a number card
   // and is discarded, or if it is a power card and the player decides not to use it, the player then picks another card from the pile
   // and plays thay as if it were a normal turn. 
   
   
   public void draw2Card(Player player){
      
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in);
      
      //Inform the user that they have pulled a draw 2 power card. 
      System.out.println("You have drawn a draw2 power card.");
      
      Card currentCard = gameDeck.getTopCard();
 
      
      //inform user of the card that they have drawn and their options 
      
      System.out.println("You have drawn a card with the value of "+ currentCard.getValue()+".");
      System.out.println("Would you like to use this card or discard it and draw again? (U)se or (D)iscard: ");
      String choice = keyboard.nextLine();
      char choice1 = choice.charAt(0); 
      
      if(choice1 == 'u' || choice1 == 'U'){
         
         checkPowerCard(currentCard,player);
         // player is prompted to ask which card in his hand does he want to swap with another player 
         System.out.println("Which card in you hand do you want to use in you swap 1, 2, 3, or 4: ");
         int choice2 = keyboard.nextInt();
      
         //error checking 
         while(choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4){
         System.out.println("Which card in you hand do you want to look at 1, 2, 3, or 4: ");
         choice2 = keyboard.nextInt();
         }// end of while 
         
         choice2 = choice2 - 1; 
         Hand temp = player.getHand();
         Card swapCard1 = temp.hand.get(choice2);
         gameDiscardPile.setTopCard(swapCard1);
         player.hand.remove(choice2); 
         //player.hand.add(choice2,currentCard);
         
      
      }else if(choice1 == 'd' || choice1 == 'D'){
         gameDiscardPile.setTopCard(currentCard);
         System.out.println("You have decided to discard your first draw and we will not draw your second and final card.");
         currentCard = gameDeck.getTopCard();
         System.out.println("You have drawn a card with the value of "+ currentCard.getValue()+".");
         System.out.println("Would you like to use this card or discard it and draw again? (U)se or (D)iscard: ");
         choice = keyboard.nextLine();
         char choice3 = choice.charAt(0); 
      
         if(choice3 == 'u' || choice3 == 'U'){
         
         
            checkPowerCard(currentCard,player);
            // player is prompted to ask which card in his hand does he want to swap with another player 
            System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
            int choice4 = keyboard.nextInt();
      
            //error checking 
            while(choice4 != 1 && choice4 != 2 && choice4 != 3 && choice4 != 4){
            System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
            choice4 = keyboard.nextInt();
            }// end of while 
            
            choice4 = choice4 - 1; 
         
            Hand temp = player.getHand();
            Card swapCard1 = temp.hand.get(choice4);
            gameDiscardPile.setTopCard(swapCard1);
            player.hand.remove(choice4);
            player.hand.add(currentCard);
            //player.hand.add(choice4,currentCard);
      
         }//end of if 
         else if(choice3 == 'd' || choice3 == 'D'){
            System.out.println("You have decided to discard your final draw therefore the card you have drawn will be placed in the discard pile and your hand will not change.");
            gameDiscardPile.setTopCard(currentCard);
      
         }//end of else if 
         
      }//end of else if 
   
   
   }//end of draw2Card
   
   

//////////////////////////////////////////////////// End of Game Time /////////////////////////////////////////////////////////////

   
   //method that decides how the game is ended. This method decides that the game is going to end in a predefined
   // amount of time. 
   public void endOfGameTime(int time){
   
   
   }//end of endOfGameTime
   


//////////////////////////////////////////////////// End of Game Rounds /////////////////////////////////////////////////////////////

   
   //method that decides how the game is ended. This method decides that the game is going to end in a predefined 
   // amount of rounds. 
   public boolean endOfGameRounds(int roundNumber,int gameOverRound){
      
      
      boolean output; 
      
      if(roundNumber == gameOverRound){
         gameOver = true;
         output = true; 
      }else{
         output = false; 
      }// end of else 
      
      return output;  
   
   
   }//end of endOfGameRounds
   
 
//////////////////////////////////////////////////// End of Game Elimination /////////////////////////////////////////////////////////////
 
   
   
   //method that decides how the game is ended. This method decides that the game is going to end by kicking a player out 
   //every rounds with the highest score until there is only one person left. 
   public void endOfGameElimination(int roundStart,int roundNumber,Player p1, Player p2, Player p3, Player p4 ){
      
      Player max = p1;
      
      
      ArrayList<Player> all = new ArrayList<Player>(4);
      ArrayList<Player> game = new ArrayList<Player>(4);
      all.add(p1);
      all.add(p2);
      all.add(p3);
      all.add(p4);
       
      
      for(Player object: all){
         if(object.isInGame() == true){
            game.add(object);
         }//end of if
      }//end of for 
      
      for(Player object: game){
         
         if(object.getScore() > max.getScore()){
            
            max = object; 
         }
      
      }
      
      max.setInGame(false); 
      
      
      
      
            
   
   
   }//end of endOfGameElimination 
   
   
   
   
//////////////////////////////////////////////////// Check Power Card  /////////////////////////////////////////////////////////////   
   
   
   
   //method that checks the value of a card object and test it to see if it is a power card. If the card passed to the function
   // is a power card then it will call the function that invokes the power cards abilities. 
   
   
   public boolean checkPowerCard(Card card,Player player){
      
      boolean x = false; 
      int powerLevel = 9;
      int draw2 = 10;
      int peek = 11;
      int swap = 12;
      int cardValue = card.getValue();
      if(cardValue > powerLevel){
         
         x = true;
      
         if(cardValue == draw2){
            draw2Card(player);
         }
         else if(cardValue == peek){
            peekCard(player);
         }
         else if(cardValue == swap){
            swapCard(p1, p2, p3, p4);
         }//end of else if
      
      }//end of if
      
      
      return x;
   
}//end of checkPowerCard



//////////////////////////////////////////////////// Draw Card  /////////////////////////////////////////////////////////////

//This Method allows the current players whos turn it is in the game to decide if they want to draw a card from the top of the 
//discard pile or if they want to draw a face down card from the game deck. Then it allows them to choose what they want to do with
//the card that they have chosen. 

   public void drawCard(Player player){
   
      // create a Scanner object for keyboard
      Scanner keyboard = new Scanner(System.in);
      Card power = new Card(12);
      
      gameDiscardPile.setTopCard(power);
      
      System.out.println("It is your turn to draw a card. The card on top of the discard pile is a " + gameDiscardPile.list.get(0).getValue() +
      ", Or you can choose a face down card off the game deck. Type (D)iscard Pile or (G)ame Deck: ");
      
      String choice = keyboard.nextLine();
      char choice1 = choice.charAt(0);
      
      while(choice1 != 'd' && choice1 != 'D'&& choice1 != 'g' && choice1 != 'G'){
         System.out.println("It is your turn to draw a card. The card on top of the discard pile is a " + gameDiscardPile.list.get(0).getValue() +
      ", Or you can choose a face down card off the game deck. Type (D)iscard Pile or (G)ame Deck: ");
         choice = keyboard.nextLine();
         choice1 = choice.charAt(0);
         }// end of while
      
      if(choice1 == 'd' || choice1 == 'D'){
      
            //currentCard
            Card currentCard = gameDiscardPile.getTopCard();
            if(checkPowerCard(currentCard,player) == false){
            
               System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
               int choice2 = keyboard.nextInt();
         
               //error checking 
               while(choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4){
               System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
               choice2 = keyboard.nextInt();
               }// end of while
               
               choice2 = choice2 - 1; 
            
               Hand temp = player.getHand();
               Card swapCard1 = temp.hand.get(choice2);
               gameDiscardPile.setTopCard(swapCard1);
               player.hand.remove(choice2);
               player.hand.add(currentCard);
               //player.hand.add(choice2,currentCard);
            }else{
                gameDiscardPile.setTopCard(currentCard);
            }
     }else{
            Card currentCard = gameDeck.getTopCard();
            
            System.out.println("The card that you drew is a "+ currentCard.getValue());
            System.out.println("Do you want to swap this card with a card in your hand or do you want to place it in the discard pile? Type (S)wap or (D)iscard: ");
            
            choice = keyboard.nextLine();
            char choice3 = choice.charAt(0);
      
            while(choice3 != 's' && choice3 != 'S'&& choice3 != 'd' && choice3 != 'D'){
                System.out.println("Do you want to swap this card with a card in your hand or do you want to place it in the discard pile? Type (S)wap or (D)iscard: ");
                choice = keyboard.nextLine();
                choice3 = choice.charAt(0);
            }// end of while
            
            if(choice3 == 'd' || choice3 == 'D'){
                gameDiscardPile.setTopCard(currentCard);
                System.out.println("You have decided to take the card you have drawn and added it to the dicard pile.");
            }else{
               
               if(checkPowerCard(currentCard,player) == false){
                  System.out.println("You have decided you want to swap the card from the game deck into your hand.");
                  System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
                  int choice4 = keyboard.nextInt();
            
                  //error checking 
                  while(choice4 != 1 && choice4 != 2 && choice4 != 3 && choice4 != 4){
                  System.out.println("Which card in your hand do you want to use in your swap 1, 2, 3, or 4: ");
                  choice4 = keyboard.nextInt();
                  }// end of while
                  
                  choice4 = choice4 - 1; 
               
                  Hand temp = player.getHand();
                  Card swapCard1 = temp.hand.get(choice4);
                  gameDiscardPile.setTopCard(swapCard1);
                  player.hand.remove(choice4);
                  player.hand.add(currentCard);
                  //player.hand.add(choice4,currentCard);
                }//end of if 
                else{
                gameDiscardPile.setTopCard(currentCard);
                }
           }//end of else
     
           
     }//end of else  


   }//end of draw card 
   
   
//////////////////////////////////////////////////// Call Rat  /////////////////////////////////////////////////////////////   
 
 
 
//This method is going to give the player the option to turn the round over variable to true to end the round 

   public boolean callRat(Player player){
   
   
   // create a Scanner object for keyboard
   Scanner keyboard = new Scanner(System.in);
      
   System.out.println("Do you want to call rat-a-tat-cat to end the round? Type (Y)es or (N)o: "); 
   
   String choice = keyboard.nextLine();
   char choice1 = choice.charAt(0);
      
      while(choice1 != 'y' && choice1 != 'Y'&& choice1 != 'n' && choice1 != 'N'){
         System.out.println("Do you want to call rat-a-tat-cat to end the round? Type (Y)es or (N)o: ");
         choice = keyboard.nextLine();
         choice1 = choice.charAt(0);
         }// end of while
      
      if(choice1 == 'y' || choice1 == 'Y'){
         roundOver = true;
      }
      
      
    System.out.println("Next players turn!");
   
   }//End of call rat 



//////////////////////////////////////////////////// Called Rat-a-tat-cat  /////////////////////////////////////////////////////////////


   
}//end of class 
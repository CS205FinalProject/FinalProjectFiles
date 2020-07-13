/*
make instantiation include numbers of players for simple ownership.

*/


public class swapTo{

private boolean p1Card1 = false;
private boolean p1Card2 = false;
private boolean p1Card3 = false;
private boolean p1Card4 = false;

private boolean p2Card1 = false;
private boolean p2Card2 = false;
private boolean p2Card3 = false;
private boolean p2Card4 = false;

private boolean p3Card1 = false;
private boolean p3Card2 = false;
private boolean p3Card3 = false;
private boolean p3Card4 = false;

private boolean p4Card1 = false;
private boolean p4Card2 = false;
private boolean p4Card3 = false;
private boolean p4Card4 = false;

private Card[] knownList = new Card[16];
private int[] sortedList = new int[16];




   public void swapTo()
   {
  
   
   
   }
   public void setTrue(int p, Card c)//int p is player Number
   {
      
      if (player.getNumber == 1)
      {
         if (c.isInPosition1 == true)
         {
            p1Card1 = true;
            knownList[0] = c;
         
         }
         else if (c.isInPostion2 == true)
         {
            p1Card2 = true;
            knownList[1] = c;
            
         }
         else if (c.isInPosition3 == true)
         {
            p1Card3 = true;
            knownList[2] = c;
         }
         else if (c.isInPosition4 == true)
         {
            p1Card4 = true;
            knownList[3] = c;
         }      
      
      }

      else if (player.getNumber ==2)
      {
         if (c.isInPosition1 == true)
         {
            p2Card1 = true;
            knownList[4] = c;
         }
         else if (c.isInposition1 == true)
         {
            p2Card2 = true;
            knownList[5] = c;
         }
         else if (c.isInPostition == true)
         {
            p2Card3 = true;
            knownList[6] = c;
         }
         else if (c.isInPosition == true)
         {
            p2Card4 = true;
            knownList[7] = c;
         }
      }
      
      else if (player.getNumber ==3)
      {
         if (c.isInPosition1 == true)
         {
            p3Card1 = true;
            knownList[8] = c;
         }
         else if (c.isInposition1 == true)
         {
            p3Card2 = true;
            knownList[9] = c;
         }
         else if (c.isInPostition == true)
         {
            p3Card3 = true;
            knownList[9] = c;
         }
         else if (c.isInPosition == true)
         {
            p3Card4 = true;
            knownList[10] = c;
         }
      }
      else if (player.getNumber ==4)
      {
         if (c.isInPosition1 == true)
         {
            p4Card1 = true;
            knownList.add(p4.getCard(0));
         }
         else if (c.isInposition1 == true)
         {
            p4Card2 = true;
            knownList.add(p4.getCard(1));
         }
         else if (c.isInPostition == true)
         {
            p4Card3 = true;
            knownList.add(p4.getCard(2));
         }
         else if (c.isInPosition == true)
         {
            p4Card4 = true;
            knownList.add(p4.getCard(3));
         }
      }      
   }  
   public void setFalse(Player p, Card c)
   {
      
      if (player.getNumber == 1)
      {
         if (c.isInPosition1 == true)
         {
            p1Card1 = false;
         
         }
         else if (c.isInPostion2 == true)
         {
            p1Card2 = false;
         }
         else if (c.isInPosition3 == true)
         {
            p1Card3 = false;
         }
         else if (c.isInPosition4 == true)
         {
            p1Card4 = false;
         }      
      
      }

      else if (player.getNumber ==2)
      {
         if (c.isInPosition1 == true)
         {
            p2Card1 = false;
         }
         else if (c.isInposition1 == true)
         {
            p2Card2 = false;
         }
         else if (c.isInPostition == true)
         {
            p2Card3 = false;
         }
         else if (c.isInPosition == true)
         {
            p2Card4 = false;
         }
      }
      
      else if (player.getNumber ==3)
      {
         if (c.isInPosition1 == true)
         {
            p3Card1 = false;
         }
         else if (c.isInposition1 == true)
         {
            p3Card2 = false;
         }
         else if (c.isInPostition == true)
         {
            p3Card3 = false;
         }
         else if (c.isInPosition == true)
         {
            p3Card4 = false;
         }
      }
      else if (player.getNumber ==4)
      {
         if (c.isInPosition1 == true)
         {
            p4Card1 = false;
         }
         else if (c.isInposition1 == true)
         {
            p4Card2 = false;
         }
         else if (c.isInPostition == true)
         {
            p4Card3 = false;
         }
         else if (c.isInPosition == true)
         {
            p4Card4 = false;
         }
      }      
   }
   public void sortList()
   {
      
   
   }
   

}


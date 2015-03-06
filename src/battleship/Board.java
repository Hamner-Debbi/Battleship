/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @authors Debbi
 * Aaron Taylor
 * L08 Individual Assignment edits by Aaron Taylor
 */
public class Board {
    
    public static int Empty = 0;
    public static int Hit = 1;
    public static int Miss = 2;
    public static int Ship = 3;
  
    public int location;

    
    public void main() {
        int Board[] = new int [100];
            Board[location] = HitOrMiss(location);
    }
    
    public void HitOrMiss(location) {
        if (location == 3) {
            location == 1};
        if (location == 0) {
            location == 2);
        }
        
        }
    }
   public class score {     
    public void ScoreCalc() {
        for (i = 0; i < Board.length; i++) {
            if (board[i] > 0) {
                if (board = 1) {
                    score += 5
                    }
                if (board = 2) {
                    score -= 0.5
                    }
                if (board = 3) {
                    score -= 5
                    }
                }
            }
        }
    }
    
       public int score; 
       public int scoreDisplay = "Your score is" + score + "points! The Computer says \" Boo, Hiss!\" "
    }
     
    
}
public class blankSpaceCount {
    
    public static void ExchangeSort ( int [ ] num )
{
  int[] computerBoard = new int[99];
  int blankSpaceCount = 0;
  
  int i;
  for ( i = 0; i < computerBoard.length; i ++ )  
  {
  if (computerBoard[i] == 0) {
      blankSpaceCount += 1;
  }
  }
  
  System.out.println (blankSpaceCount);
}
}
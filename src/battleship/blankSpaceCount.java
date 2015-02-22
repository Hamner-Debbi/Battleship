/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Aaron Taylor
 */
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

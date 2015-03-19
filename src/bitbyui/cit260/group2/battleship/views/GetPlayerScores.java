/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* we may not need to use this but did not remove it 
*in case we need to use the sort function
 */
package bitbyui.cit260.group2.battleship.views;

/**
 *
 * @author King Aaron, Lord of Pancakes and stuff
 * Edited by Emily for Individual programming assignment.
 */
public class GetPlayerScores {
    
    public static void ExchangeSort ( int [ ] num )
{
  int scores[] = {1, 2, 3, 100, 5, 7, 11, 13, 17, 19, 23};  
  int i, j, temp; //be sure that the temp variable is the same "type" as the array
  for ( i = 0; i < num.length - 1; i ++ )  
  {
  for ( j = i + 1; j < num.length; j ++ )
  {
  if( num[ i ] < num[ j ] ) //sorting into descending order
  {
  temp = num[ i ]; //swapping
  num[ i ] = num[ j ];
  num[ j ] = temp; 
  }  
  }
  }
}
}

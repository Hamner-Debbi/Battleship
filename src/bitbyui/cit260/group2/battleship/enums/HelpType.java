/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.enums;

/**
 *
 * @author Debbi
 */
public class HelpType {
    
        INSTRUCTION ("\t The object of the game is to guess the location of your opponent's five ships." 
                +"\non their opponent's board, attempting to mark a square containing enemy ships." 
                +"\nOnce all positions of a ship is hit it is destroyed (sunk)."  
                +"\nWhen you have sunk all of your opponent's battleships then you win the game."),
        
        BOARD ("\tBattleship is played on a 10x10 space board.\n"
                +"The player's five ships are placed on their board.\n"
                +"The computer has another board for their five ships." ),
          
        ONE_PERSON_GAME ("In a one person game, you will play against the computer."),

        TWO_PERSON_GAME ("In a two person game, you will play against another real player."), 

        PLAYER_A ("\t player_A  manually takes their turn by placing their mark"
                + "\nin an unused location on the board."),

        Player_B"\t player_B manually takes their turn by placing their mark "
                + "\n n an unused location on the board after the player_A."
        
        MARKER ("A symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "\n\nThe default markers are \"X\" and \"O\".");
        
        String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
    
    

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author emilylowder
 * MAY BE ABLE TO DELETE THIS CLASS
 */
public class HelpMenuControl {
    
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tBattleship is played on a 10x10 space board.\n"
                +"The player's five ships are placed on their board.\n"
                +"The computer has another board for their five ships."    
        );
        displayHelpBorder();
    }
   
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe object of the game is to guess the location of your opponent's five ships\n" +
                "which are hidden on your opponent's board. Players take turns marking a space\n" +
                "on their opponent's board, attempting to mark a square containing enemy ships. \n" +
                "Once all positions of a ship is hit it is destroyed (sunk). \n" +
                "When you have sunk all of your opponent's battleships then you win the game."
                ); 
        displayHelpBorder();
    }
            
    public void displayNamedPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA named player manually takes their turn by placing their mark "
                + "\nin an unused location on the board."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tThe computer player automatically takes its turn "
                + "\n after the human player in a single player game."
                ); 
        displayHelpBorder();
    }
             
    public void displayLocationHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA location on the board, denoted by row and column, where a player can place their marker."
                ); 
        displayHelpBorder();
    }
                 
    public void displayShipHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tPlayers are able to place their ships vertically or horizontally on the grid. Ships can \n"
            +"touch each other but may not overlap. Both you and the computer have\n"
                +"five ships each. The game begins once your ships are placed."    
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}

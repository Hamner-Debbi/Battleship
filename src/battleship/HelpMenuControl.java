/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author emilylowder
 */
public class HelpMenuControl {
    
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Battleship.\n"
                +"A 10x10 board is used in the game to place your five ships.\n"
                +"The computer also has a 10x10 board for their five ships."    
        );
        displayHelpBorder();
    }
   
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe object of the game is to guess the location of five ships\n" +
                "your opponent has hidden on a grid. Players take turns calling out a \n" +
                "row and column, attempting to name a square containing enemy ships. \n" +
                "Once all positions of a ship is hit it is destroyed (sunk)."     
                ); 
        displayHelpBorder();
    }
            
    public void displayNamedPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA named player manually takes their turn by placing their mark "
                + "\n\tin an unused location on the board."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer based player automatically takes its turn "
                + "\n\timmediatly after a real player in a single player game."
                ); 
        displayHelpBorder();
    }
             
    public void displayLocationHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA location on the board where a player can place their marker."
                ); 
        displayHelpBorder();
    }
                 
    public void displayShipHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tPlace your ships vertically or horizontally on the grid. Ships can \n"
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

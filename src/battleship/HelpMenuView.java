/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Scanner;

/**
 *
 * @author emilylowder
 * Aaron Taylor - Paired Programming 09
 */
public class HelpMenuView extends Menu {
    
    public static final String BOARD = "BOARD";
    public static final String GAME = "GAME";
    public static final String NAMED_PLAYER = "NAMED_PLAYER";
    public static final String COMPUTER_PLAYER = "COMPUTER_PLAYER";
    public static final String LOCATION = "LOCATION";
    public static final String SHIPS = "SHIPS";
    
    private final static String[][] menuItems = {
        {"B", "The board"},
        {"C", "Computer player"}, 
        {"G", "The Battleship game"},
        {"L", "A location"},
        {"S", "Ships"},
        {"P", "Named player"},        
        {"Q", "Quit Help"}        
    };
        
    
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    } 
    
     @Override
    public String executeCommands(Object object) {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "B":
                    this.displayHelp(HelpMenuView.BOARD);
                    break;
                case "C":
                    this.displayHelp(HelpMenuView.COMPUTER_PLAYER);
                    break;
                case "G":
                    this.displayHelp(HelpMenuView.GAME);
                    break;                  
                case "L":
                    this.displayHelp(HelpMenuView.LOCATION);
                    break;
                case "S":
                    this.displayHelp(HelpMenuView.SHIPS);
                    break;
                 case "P":
                    this.displayHelp(HelpMenuView.NAMED_PLAYER);
                    break; 
                case "Q": 
                    return Game.QUIT;
            }
        } while (!gameStatus.equals(Game.QUIT));  
        
         return gameStatus;
    }
    
    private void displayHelp(String helpType) {

        String helpText = null;
        switch (helpType) {
            case HelpMenuView.BOARD: helpText = 
                "\tBattleship is played on a 10x10 space board.\n"
                +"The player's five ships are placed on their board.\n"
                +"The computer has another board for their five ships." ;
                break;
                
            case HelpMenuView.GAME: helpText = 
                "\tThe object of the game is to guess the location of your opponent's five ships\n" +
                "which are hidden on your opponent's board. Players take turns marking a space\n" +
                "on their opponent's board, attempting to mark a square containing enemy ships. \n" +
                "Once all positions of a ship is hit it is destroyed (sunk). \n" +
                "When you have sunk all of your opponent's battleships then you win the game.";
                break; 
                
            case HelpMenuView.NAMED_PLAYER: helpText = 
                "\tA named player manually takes their turn by placing their mark "
                + "\nin an unused location on the board.";
                break;
                
            case HelpMenuView.COMPUTER_PLAYER: helpText = 
                "\tThe computer player automatically takes its turn "
                + "\n after the human player in a single player game.";
                break;
                
            case HelpMenuView.LOCATION: helpText = 
               "\tA location on the board, denoted by row and column, where a player can place their marker.";
                break;
                
            case HelpMenuView.SHIPS: helpText = 
                "\tPlayers are able to place their ships vertically or horizontally on the grid. Ships can \n"
            +"touch each other but may not overlap. Both you and the computer have\n"
                +"five ships each. The game begins once your ships are placed.";    
                break;
        }   
        
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText);
        System.out.println("\t" + dividerLine.toString());
    }
    
}

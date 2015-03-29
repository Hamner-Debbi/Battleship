/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.views;


import bitbyui.cit260.group2.battleship.controls.GamePreferencesMenuControl;
import bitbyui.cit260.group2.battleship.controls.Battleship;
import bitbyui.cit260.group2.battleship.enums.ErrorType;
import bitbyui.cit260.group2.battleship.enums.StatusType;
import bitbyui.cit260.group2.battleship.exceptions.GameException;
import bitbyui.cit260.group2.battleship.exceptions.BattleshipException;
import bitbyui.cit260.group2.battleship.intefaces.EnterInfo;
import bitbyui.cit260.group2.battleship.models.Game;
import bitbyui.cit260.group2.battleship.models.Player;
import java.awt.Dimension;
import java.util.Scanner;
/**
 *
 * @author Debbi Individual Programming Assignment L11
 */


public class GamePreferencesMenuView extends Menu  implements EnterInfo {
    
    private Game game;
    private GamePreferencesMenuControl gamePreferenceCommands;

    private final static String[][] menuItems = {
        {"1", "Change Marker of the first Player"},
        {"2", "Change Marker of the second Player"},
        {"Q", "Return to game menu"}
    };

    public GamePreferencesMenuView() {
        super(GamePreferencesMenuView.menuItems);
        gamePreferenceCommands = new GamePreferencesMenuControl();
    }
    
    @Override
    public StatusType getInput(Object object){       
        this.game = (Game) object;
        this.gamePreferenceCommands.setGame(game);
        
        StatusType gameStatus = StatusType.PLAYING;
        do {
            try {
                this.display();

                // get commaned entered
                String command = this.getCommand();

                switch (command) {
                    case "1":
                        getMarker(this.game.getPlayerA());
                        break;
                    case "2":
                        getMarker(this.game.getPlayerB());
                        break;
                    case "Q":
                        return StatusType.QUIT;
                }
            } catch (BattleshipException tex) {
                System.out.println("\n\t" + tex.getMessage());
                continue;
            }
        } while (gameStatus != StatusType.QUIT);

        return gameStatus;
    }
    
    
    public void getMarker(Player player)  {
        String marker = null;
                
        boolean valid = false;
        do {
            System.out.println("\n\t" + player.getName() 
                + ", enter a single character that will be used to mark your squares in the game.");
            Scanner in = Battleship.getInputFile();
            marker = in.nextLine();
            if (marker == null  || marker.length() < 1) {
                continue;
            }
            
            marker = marker.trim().substring(0, 1);
            marker = marker.toUpperCase();
            try {
                this.gamePreferenceCommands.saveMarker(player, marker);
                valid = true;
            } catch (BattleshipException ex) {
                continue;
            }
        } while (!valid);
   
    }
        
}
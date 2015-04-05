/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.controls;

import bitbyui.cit260.group2.battleship.models.Game;
import bitbyui.cit260.group2.battleship.models.Player;

/**
 *
 * @author Debbi L12 Individual Programming Assignment
 */
public class PlayerNameMenuControl {

    public static void savePlayersNames(Game game, String playerAName, String playerBName) {
       if (game == null 
               || playerAName == null
               || playerBName == null) {
           throw new IllegalArgumentException("savePlayersNames - parameter value is null");
       }
       Player playerA = game.getPlayerA();
       Player playerB = game.getPlayerB();
       playerA.setName(playerAName);
       playerB.setName(playerBName);
    }
    
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.controls;

/**
 *
 * @author Debbi
 */
public class Battleship {
        String name;
        String instructions = "The Player take turns firing on the opponent \n\n"
        + "They call a Location on the board trying to guess where \n\n"
        + "the opponent Ship is. \n\n"
        + "The object is to hit and sink all 5 Ships.\n\n";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Battleship myGame = new Battleship();
        myGame.getName();
        myGame.displayHelp();
        
       // TODO code application logic here

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.views;

import bitbyui.cit260.group2.battleship.controls.BattleshipError;
import bitbyui.cit260.group2.battleship.models.Board;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Debbi
 * Jeff Olsen Individual Programming Assignment L10
 */
public class GetLocationView implements EnterInfo {
  private Game game;
    
    public GetLocationView(Game game) {
        this.game = game;
    }
    
    /*
     * Prompt the user to enter the location (row and column) to place their 
     * marker on the board
     * @Param game the object representing the game
     */
    public Point getInput() {

       @Override
    public Object getInput(Object object) {
        this.game = (Game) object;
        Scanner inFile = Battleship.getInputFile(); // get input file    
        String[] coordinates;
        Point location = null;
        
        boolean valid = false;
        

        // prompt the use to enter the locaton to placeread the row and column coordinates
        while (!valid) {
            // prompt for the row and column numbers
            System.out.println("\n\n\t" + this.game.currentPlayer.name + " it is your turn."
                + "Enter a number for the column and row  (For example: 1 1)");
            
            // get the value entered by the user 
            String strRowColumn = inFile.nextLine(); 
            
            // trim off all extra blanks from the input
            strRowColumn = strRowColumn.trim();  
            
            // replace any commas enter with blanks
            strRowColumn = strRowColumn.replace(',', ' '); 
            
            // tokenize the string into an array of words
            coordinates = strRowColumn.split("\\s"); 

            if (coordinates.length < 1) { // the value entered was not blank?
                new BattleshipError().displayError(
                        "You must enter a number for the column and row, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }    

            else if (coordinates.length == 1) { // only one coordinate entered?
                if (coordinates[0].toUpperCase().equals("Q")) { // Quit?
                    return null;
                } else { // wrong number of values entered.
                    new BattleshipError().displayError(
                        "You must enter a number for the column and row, "
                        + "or a \"Q\" to quit. Try again.");
                    continue;
                }
            }

            
            // user java regular expression to check for valid integer number 
            // for both numbers
            String regExpressionPattern = ".*\\d.*";
            if (!coordinates[0].matches(regExpressionPattern) ||
                !coordinates[1].matches(regExpressionPattern)) {
                new BattleshipError().displayError(
                        "You must enter a number for the column and row,"
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }
            
            // convert each of the cordinates from a String type to 
            // an integer type
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
                     
            Board board = this.game.board; // get the game board
            
            // Check for invalid row and column entered
            if (row < 1   ||  row > board.rowCount ||
                column < 1  ||  column > board.columnCount) {
                new BattleshipError().displayError(
                        "You must enter a number for the column and row. Try again.");
                continue;
            }
            
            // create a Point object to store the row and column coordinates in
            location = new Point(row-1, column-1);
            
            // check to see if the location entered is already occupied
            if ( board.boardLocations[row-1][column-1].player != null ) {
                new BattleshipError().displayError(
                    "The current location is taken. Select another location");
                continue;
            }

            valid = true; // a valid location was entered

        }
        
        return location; 
            
    }

}
   

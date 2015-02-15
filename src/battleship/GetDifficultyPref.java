/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Aaron Taylor
 */
public class GetDifficultyPref {
  private Game game;
    
    public GetLocationView(Game game) {
        this.game = game;
    }
    
    /*
     * Prompt the user to enter their difficulty preference. 
     */
    public int getInput() {

        Scanner inFile = new Scanner(System.in); // get input file      
        String[] playerInput;
        Point location = null;
        
        boolean valid = false;
        

        // prompt the use to enter the locaton to placeread the row and column coordinates
        while (!valid) {
            // prompt for the row and column numbers
            System.out.println("\n\n\t" + this.game.currentPlayer.name + ", enter a value for difficulty."
                + "\n enter \"E\" for Easy, \"M\" for Moderate, and \"H\" for Hard, or \"Q\" to quit.");
            
            // get the value entered by the user 
            String DifficultyPref = inFile.nextLine(); 
            
            // trim off all extra blanks from the input
            DifficultyPref = DifficultyPref.trim();
           
                if (DifficultyPref.toUpperCase().equals("Q")) { // Quit?
                    return null;
                } 
                else if (DifficultyPref.toUpperCase().equals("E")) { // Easy?
                    return 1;
                } 
                else if (DifficultyPref.toUpperCase().equals("M")) { // Moderate?
                    return 2;
                }
                else if (DifficultyPref.toUpperCase().equals("H")) { // Hard?
                    return 3;
                } 
                        
                    new BattleshipError().displayError(
                        "You must enter an \"E\" for Easy, \"M\" for Moderate, or \"H\" for Hard "
                        + "You can also input a \"Q\" to quit. Try again.");
                }
            }
            
           
            // create a Point object to store the input in
            DifficultyPref = GetDifficultyPref();          
            }

            valid = true; // a valid input was entered

        }
        
        return DifficultyPref; 
            
    }

}
   

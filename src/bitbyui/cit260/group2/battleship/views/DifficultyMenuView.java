/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.views;

import bitbyui.cit260.group2.battleship.controls.BattleshipError;
import bitbyui.cit260.group2.battleship.controls.DifficultyMenuControl;
import java.util.Scanner;

/**
 *
 * @author ATaylor
 */
public class DifficultyMenuView {
    
    private final static String[][] menuItems = {
        {"E", "Easy"},
        {"M", "Moderate"}, 
        {"H", "Hard"},       
        {"Q", "Quit difficulty menu"}        
    };
    
    private DifficultyMenuControl difficultyMenuControl = new DifficultyMenuControl();
    
    public DifficultyMenuView() {
        
    } 
    
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); 
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "E":
                    this.difficultyMenuControl.displayEasy();
                    break;
                case "M":
                    this.difficultyMenuControl.displayModerate();
                    break;
                case "H":
                    this.difficultyMenuControl.displayHard();
                    break;                  
                case "Q": 
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));  
        
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the options to view the difficulty options:");

        for (String[] menuItem : DifficultyMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
}

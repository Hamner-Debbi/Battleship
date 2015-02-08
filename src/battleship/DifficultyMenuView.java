/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

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
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the options to view the difficulty options:");

        for (int i = 0; i < DifficultyMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}

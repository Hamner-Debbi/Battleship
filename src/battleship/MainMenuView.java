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
 */
public class MainMenuView {

    private final static String [] [] menus = {
        {"I", "Input name"},
        {"S", "Start game"},
        {"H", "Access help menu"},
        {"Q", "Quit"},
    };
    
    private HelpMenuView helpMenuView = new helpMenuView();
    private Player player = new Player();
    private Battleship battleship = new Battleship();
    
    public void getInput() {
        String command;
        Scanner inFile = newScanner(System.in);
        
        do{
            this.display(); //display menu
            
            //get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
                switch(command) {
                    case "I":
                        this.player.displayPlayer();
                        break;
                    case "S":
                        this.battleship.displayBattleship();
                        break;
                    case "H":
                        this.helpMenuView.displayHelpMenuView();
                    case "Q":
                        break;
                    default:
                        new BattleshipError().displayError("Invalid command. Please enter a valid command.")
                    continue;
                }
        }while (!command.equals("Q"));
        return;
                }
        }
    
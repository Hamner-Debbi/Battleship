/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.io.InputStream;
import java.util.Scanner;


/**
 *
 * @author emilylowder
 * Aaron Taylor - Paired Programming Assignment 09
 */
public class MainMenuView extends Menu {
    
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"Q", "Quit Battleship"}
    }; 
  
    MainMenuControl mainCommands = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
    
    @Override
    public String executeCommands(Object object) {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "1":
                    this.startGame(1);
                    break;
                case "2":
                    this.startGame(2);
                    break;
                case "H":
                    HelpMenuView helpMenu = Battleship.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "Q":
                    return Game.EXIT;
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }

    private void startGame(long noPlayers) {
                
        if (noPlayers != 1  &&  noPlayers != 2) {
            new Battleship().displayError("startGame - invalid number of players specified.");
            return;
        }
        
        Game game;
        if (noPlayers == 1) {
            game = this.mainCommands.create(Game.ONE_PLAYER);
        }
        else {
            game = this.mainCommands.create(Game.TWO_PLAYER);
        }
        
        SelectPlayersView sekectPlayersView = new SelectPlayersView(game);
        String status = (String) sekectPlayersView.selectPlayers(Battleship.getNameList());
        if (status.equals(Game.QUIT)) {
            return;
        }

        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.executeCommands(game);
    }

    private String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return Game.PLAYING;
    }
    
}
    
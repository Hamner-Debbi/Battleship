/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.views;

import bitbyui.cit260.group2.battleship.controls.Battleship;
import bitbyui.cit260.group2.battleship.controls.GameMenuControl;
import bitbyui.cit260.group2.battleship.models.Player;
import java.awt.Point;

/**
 * @author Debbi
 * Aaron Taylor - Paired Programming Assignment 09
 * Aaron Taylor Individual Programming Assignment L10
 * Paired Programming Assignment L11 line 94-139
 */
public class GameMenuView extends Menu {
    
    private Game game;
    private GameMenuControl gameCommands; 
    private GetLocationView getLocation = new GetLocationView();
    private BoardView displayBoard = new BoardView();

    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"P", "Change game preferences"},
        {"H", "Help"},
        {"Q", "Quit"}
    };

    public GameMenuView(Game game) {
        super(GameMenuView.menuItems);
        this.gameCommands = new GameMenuControl(game);
    }

    public BoardView getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(BoardView displayBoard) {
        this.displayBoard = displayBoard;
    }

    

    @Override
    public Object getInput(Object object) {
        this.game = (Game) object;

        String gameStatus = Game.CONTINUE;
        do {
     
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "T":
                    this.takeTurn();
                    break;
                case "D":
                    this.displayBoard.display(game.getBoard());
                    break;
                case "N":
                    gameCommands.startNewGame(game);
                    this.displayBoard.display(game.getBoard());
                    break;
                case "R":
                    this.displayStatistics();
                    break;
                case "P":
                    GamePreferencesMenuView gamePreferencesMenu = battleship.getGamePreferencesMenu();
                    gamePreferencesMenu.display();
                    gamePreferencesMenu.executeCommands(this.game);
                    break;
                case "H":
                    HelpMenuView helpMenu = Battleship.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "Q":
                    gameStatus = Game.QUIT;
                    break;
            }
        } while (!gameStatus.equals(Game.QUIT));

        return Game.PLAYING;
    }
    
    
   private void takeTurn() throws GameException,BattleshipException {
        String playersMarker;
        Point selectedLocation;

        if (!this.game.getStatus() != StatusType.NEW_GAME &&
            this.game.getStatus() !=  StatusType.PLAYING)
            throw new MenuException(ErrorType.ERROR206.getMessage());
            return;    
            
            //.equals(Game.NEW_GAME) && 
            //!this.game.getStatus().equals(Game.PLAYING)) {
            //new Battleship().displayError(
            
        }
        //This is our throwing and catching exception section.  
        //It may be a trow away code.
   
        try{
            do{
                try{
                    valid = game.getStatus().occupyLocation(this, coordinates);
                }catch (MenuException be){
                    Error.displayErrorMsg(be.getMessage());
                }
             }
         } while (!valid);
         
         //end of throwing catching code
         //begining of graceful exception
         
         try{
            Battleship battleship = new Battleship();
            MainMenu MainMenu = new ManiMenu();
            
            battleship.display();
            mainMenu.getInput(null);
}
         catch (Throwable ex) {
         Error.displayErrorMsg("Unexpected error: " + ex.getMessage());
         Error.displayErrorMsg(ex.getStackTrace().toString());
}
         finally{
            Battleship.infile.close()
            );
            //end graceful exceptions
   
        Player currentPlayer = this.game.getCurrentPlayer();
        Player otherPlayer = this.game.getOtherPlayer();

        // get location for first player
        selectedLocation = (Point) getLocation.getLocation(this.game);
        if (selectedLocation == null) {
            return;
        }

        // regular players turn
        Point locationMarkerPlaced = 
                this.gameCommands.playerTakesTurn(currentPlayer, selectedLocation);

        if (this.gameOver()) { // game won or tied?  
            return;
        }

        if (this.game.getGameType() == Game.ONE_PLAYER) {
            // computers turn
            locationMarkerPlaced = this.gameCommands.playerTakesTurn(otherPlayer, null);

            if (this.gameOver()) { // game won or tied?
                return;
            }
        }


        // display board and prompt for next player's turn
        this.displayBoard.display(game.getBoard());
        String promptNextPlayer = getNextPlayerMessage(otherPlayer);
        System.out.println("\n\n\t" + promptNextPlayer);


    }

    private boolean gameOver() {
        boolean done = false;
        if (this.game.getStatus().equals(Game.TIE)) { // a tie?
            System.out.println("\n\n\t" + this.game.getTiedMessage());
            done = true;
        } else if (this.game.getStatus().equals(Game.WINNER)) { // a win?
            System.out.println("\n\n\t" + this.game.getWinningMessage());
            done = true;
        }
        
        if (done) {
            this.displayBoard.display(this.game.getBoard());
        }
        

        return done;
    }
    
        
    private String getNextPlayerMessage(Player player) {
        if (this.game.getGameType().equals(Game.ONE_PLAYER)) {
            return "The computer took it's turn. It is now your turn. "
                    + player.getName();
        } else {
            return "It is now your turn "
                    + player.getName();
        }
    }
    
    
    private void displayStatistics() {
        String playerAStatistics = this.game.getPlayerA().getPlayerStastics();
        String playerBStatistics = this.game.getPlayerB().getPlayerStastics();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + playerAStatistics);
        System.out.println("\n\t " + playerBStatistics);
        System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


   
}
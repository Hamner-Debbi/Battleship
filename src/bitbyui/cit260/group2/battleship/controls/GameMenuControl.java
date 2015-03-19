/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.controls;

import bitbyui.cit260.group2.battleship.models.Board;
import bitbyui.cit260.group2.battleship.views.HelpMenuView;

/**
 *
 * @author Debbi
 * MAY BE ABLE TO DELETE THIS CLASS
 */
public class GameMenuControl {

    private Game game;
    private Board board;

    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.board;
    }
  
   public void takeTurn() {
        System.out.println("\n\ttakeTurn()called");
    }
          
   public void displayBoard() {
        System.out.println("\n\tdisplayBoard()called");
    }
   
    public void startNewGame() {
        System.out.println("\n\tstartNewGame()called");
    }     
            
    public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferencesMenu = new GamePreferencesMenuView(this.game);
        gamePreferencesMenu.getInput();
    }
    
    public void displayStatistics() {
        String NamedPlayerStatistics = this.game.NamedPlayer.getNamedPlayerStastics();
        String ComputerStatistics = this.game.Computer.getComputerStastics();
        System.out.println("\t " + NamedPlayerStatistics);
        System.out.println("\n\t " + ComputerStatistics);
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }

    private static class Game {
        private Board board;
       
    }
}
private class Sort{
 
  private static final Random generator = new Random();  
 
  private static void sort(int[] array)  {  
    while (!isSorted(array)) {  
      for (int i = 0; i < array.length; i++){  
        int randomPosition = generator.nextInt(array.length);  
        int temp = array[i];  
        array[i] = array[randomPosition];  
        array[randomPosition] = temp;  
      }  
    }  
  }  
 
  public static void main(String[] args) {
    int [] array = {5,3,0,2,4,1,0,5,2,3,1,4}; 
    System.out.println("Before: " + Arrays.toString(array));
    sort(array);
    System.out.println("After:  " + Arrays.toString(array));
  }
}
 
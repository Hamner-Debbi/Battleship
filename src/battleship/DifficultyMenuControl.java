/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author ATaylor
 */
public class DifficultyMenuControl {
    
    public DifficultyMenuControl() {
        
    } 

    public void displayEasy() {
        System.out.println();
        this.displayDifficultyBorder();             
        System.out.println( 
                "\tThe easy computer player fires completely at random.\n"
                +"You should have no problem playing against an easy computer." 
        );
        displayDifficultyBorder();
    }
   
        
    public void displayModerate() {
        System.out.println();
        displayDifficultyBorder();     
        System.out.println( 
                 "\tThe moderate computer player fires semi-randomly.\n" +
                "The moderate computer player starts by firing 34 shots at random.\n" +
                "After its random shooting the computer will start to shoot down the ships it has uncovered. \n" +
                "Work fast! The first shots are random but uncover a large area for the computer!"
                ); 
        displayDifficultyBorder();
    }
            
    public void displayHard() {
        System.out.println();
        displayDifficultyBorder();     
        System.out.println( 
                "\tA hard computer player attacks your ships as soon as it uncovers them. "
                + "\n Like the other computers the hard computer fires randomly. \n"
                + "Unlike the other computers the hard computer will attack your ships as soon as it finds them! \n"
                + "Play your best! If the hard computer gets lucky then you are in trouble!"
                ); 
        displayDifficultyBorder();
    }                      
   
    public void displayDifficultyBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}

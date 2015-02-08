/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Scanner;

/**
 *
 * @author Emily
 */
public class Player {   
    String name1;
    String welcome = "Let's play Battleship!";
    
    
    public void getName1()   {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Player 1 name: ");
        this.name1 = input.next();
            
        }
    
        public void displayHelp()   {
        System.out.println("Hello " + this.name1);
        System.out.println(this.welcome);
    }
    
}

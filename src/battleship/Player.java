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
    String name2;
    String welcome = "The goal is to sink all of the computer ships by \n"
            +"by correctly guessing their location. \n\n"
            +"Place your ships vertically or horizontally on the grid.Ships can \n"
            +"touch each other but may not overlap.\n\n"
            +"Take turns with the computer firing a shot to attack enemy ships.\n"
            +"On your turn call out a letter and a number of a row and \n"
            +"column on the grid. The first player to sink all opposing ships wins.";
    
    
    public void getName1()   {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Player 1 name: ");
        this.name1 = input.next();
            
        }
    
    public void getName2()  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Computer name");
        this.name2 = input.next();
        
    }
    
        public void displayHelp()   {
        System.out.println("Hello " + this.name1 + "\n");
        System.out.println(this.welcome);
    }
    
}

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
    String welcome = "Welcome to Battleship! You will be playing against \n"
            +"the computer. Get ready, and good luck!";
    
    
    public static void main(String[] args) {
        Battleship myGame = new Battleship();
        myGame.getName1();
        myGame.getName2();
        // TODO code application logic here
    }
    
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

Public void getName1() {
        if getName1 && getName2
}
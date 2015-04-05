/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitbyui.cit260.group2.battleship.exceptions;

/**
 *
 * @author Debbi
 */
public class BattleshipException extends Exception {

    public BattleshipException() {
    }

    public BattleshipException(String message) {
        super(message);
    }

    public BattleshipException(String message, Throwable cause) {
        super(message, cause);
    }

    public BattleshipException(Throwable cause) {
        super(cause);
    }
    
}

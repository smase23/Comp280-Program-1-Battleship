/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp280_program.pkg1;

/**
 *
 * @author Dontavius Hopkins
 * Date:08/27/2017
 * Assignment:Program#1-Battleship
 * File: Comp280_Program1.java
 * Description:I used this file to test my addShip and displayBoard methods
 * 
 */
public class Comp280_Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // created a new Board object
        Board b = new Board();
   
        // Just adding diffrent ships and displaying them on the game board
        b.displayBoard();// displays empty game 
        b.addShip("submarine","E7", "horizontal");// places a 2 unit sub at location E7
        b.displayBoard();// displays sub on the game board
        b.addShip("cruiser", "A5", "vertical");
        b.displayBoard();
        b.addShip("destroyer", "F1", "vertical");
        b.displayBoard();
//         b.addShip("battleship", "A1", "horizontal");
//        b.displayBoard();
        
    }
    
}

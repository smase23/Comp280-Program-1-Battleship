/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp280_program.pkg1;

/**
 *
 * @author Dontavius Hopkins
 */
public class Comp280_Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Board b = new Board();
   
        
        b.displayBoard();
        b.addShip("submarine","E7", "horizontal");
        b.displayBoard();
        b.addShip("cruiser", "A5", "vertical");
        b.displayBoard();
        b.addShip("destroyer", "F1", "vertical");
        b.displayBoard();
         b.addShip("battleship", "A1", "horizontal");
        b.displayBoard();
        
    }
    
}

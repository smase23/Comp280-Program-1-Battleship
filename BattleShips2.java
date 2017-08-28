/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Steven Mason
// Comp 280 - 11 am
// 8/27/2017

package battleships2;

import java.util.Scanner;

/**
 *
 * @author Steven J. Mason
 */
public class BattleShips2 {
// declaration of all variables to be used within program
    public static int numLoops = 3;
    public static char [][] board;
    private static int [] ships;
    private static boolean [] chosenShip;
// i set these variables to the specific lengths given in the directions    
    private static int aircraft = 6;
    private static int battle = 5;
    private static int cruiser = 4;
//    private int destroyer = 3;
//    private int submarine = 2;
    String direction = "";
    String coordinates = "";
    private int xCord;
    private int yCord;
    

 public static void createBoard(char[][] board) {
// this for loop creates the board. r and c are for the rows and colums
      for (int r = 0; r < board.length; r++)
      {
      //System.out.print(" ");
      for (int c = 0; c < board[0].length; c++)
        {
        board[r][c] = '~';
     }
     //System.out.print("  ");
       
      }
 }
    
    private static void showBoard(char[][] board){
// for loop to print length of board (numbers)
        char letter = 'A';
         System.out.println("");
         System.out.print("  ");
     for(int i = 0; i < board.length; i++){
         System.out.print( (i+1) + " " );
     }
        System.out.print("\n");
        
        
    
     for (int r = 0; r < 7; r++) {
// for loop to print the letters on the board
       
        
        System.out.print(letter + " ");
        letter += 1;
        
//       for (char letter = 'A'; letter <= 'G'; letter++){
//       System.out.print(letter);
//       }
        
//       for (int i = 0; i < 7; i++){
//       System.out.println("char");
//        }
       for (int c = 0; c < 7; c++) {
            
        System.out.print(board[r][c] + " ");
       }
       System.out.println();
       }
     
    }
    
    public static void createShip(){
// here I am declaring the three ships that i am using for the program        
     ships = new int[3];
     int j = 2;
     for(int i=0; i<3;i++){
         ships[i] = j;
         j++;
        }
    } 
     public static void chosenShip(){
        chosenShip = new boolean[3];
    
     for(int i=0; i<3;i++){
         chosenShip[i] = true;
         
     }
     } 
     
    public static void shipDirection(){
    
    }
    
    public static void initShips(String coordinates, String direction, char[][] board, int size){
      int xCord = coordinates.charAt(0)-'A';
      int yCord = Integer.parseInt(coordinates.substring(1))-1;
        
        if (direction.equals("horizontal")){
            for(int i = 0; i < size + 2; i++ ){
            board[xCord][yCord] = '#';
            yCord++; 
        }
            
        } else if (direction.equals("vertical")){
            for(int i = 0; i < size + 2; i++ )
            board[xCord][yCord] = '#'; 
            xCord++;
    }      
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       char[][] board = new char[7][7];
       createBoard(board);
       System.out.print("Personal Grid");
       showBoard(board);
       System.out.print("Opponent Grid");
       showBoard(board);
       
       Scanner keyboard = new Scanner(System.in);
       
// enter for loop for 3 times
     while(true){
        
       System.out.println("Enter your coordinate here");
       String coordinate = keyboard.next();
       
       System.out.println("horizontal or vertical");
       String direction = keyboard.next();
       
       System.out.println("Choose ship 2,1,0"); // tell them what ship they are choosing
       System.out.println("Pick number"); // the numbers represent either a destroyer, cruiser, or battleship 
       
       int size = keyboard.nextInt();
       
       initShips(coordinate,direction,board,size);
       showBoard(board);
       
       for (int i=0; i<3; i++){
           if (chosenShip[i] == false){
       }
        // TODO code application logic here
    }
    }
    
    }
}


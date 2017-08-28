/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp280_program.pkg1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dontavius Hopkins
 */
public class Board {
    private int rows;
    private int cols;
    // Created a 8x8 game board
    private char[][]game =  {
        {' ','1','2','3','4','5','6','7'},
        {'A','~','~','~','~','~','~','~'},
        {'B','~','~','~','~','~','~','~'},
        {'C','~','~','~','~','~','~','~'},
        {'D','~','~','~','~','~','~','~'},
        {'E','~','~','~','~','~','~','~'},
        {'F','~','~','~','~','~','~','~'},
        {'G','~','~','~','~','~','~','~'}};
    
    public Board(){
        rows =8;
        cols=8;

    }
    
    // addShip method requires a ship type, location, and a direction in order to place ship on game board.
    public boolean addShip(String ship, String location, String direction){
//        Scanner input = new Scanner(System.in);
//        System.out.println("What type of ship? Submarine:2 units, Destroyer:3 units, Cruiser:4 units");
//        ship = input.next().toLowerCase();
//        System.out.println("What location will the ship be placed? Ex) A5");
//        location = input.next().toUpperCase();
        char x = location.charAt(0);//takes first character in the location string and assigns it to x
        char y = location.charAt(1);//takes second character in the location string and assigns it to y
        int xCord = 0;
        int yCord = 0;
        
        //This switch statement allows me to assign an xCoordinate based on the first character of the location string variable
        switch(x){
            case 'A':// if x is equal to 'A' then xCord == 1
            
                xCord = 1;
            
            break;
            case 'B':// if x is equal to 'B' then xCord == 2
            
                xCord = 2;
            
            break;
            case 'C':// if x is equal to 'C' then xCord == 3
            
                xCord = 3;
            
            break;
            case  'D':// if x is equal to 'D' then xCord == 4
            
                xCord = 4;
            
            break;
            case 'E':// if x is equal to 'E' then xCord == 5
            
                xCord = 5;
            
            break;
            case 'F':// if x is equal to 'F' then xCord == 6
            
                xCord = 6;
            
            break;
            case  'G':// if x is equal to 'G' then xCord == 7
    
                xCord = 7;}
                
          //This switch statement allows me to assign an yCoordinate based on the second character of the location string variable      
          switch(y){
            case '1':// if y is equal to '1' then yCord == 1
            
                yCord = 1;
            
            break;
            case '2':// if y is equal to '2' then yCord == 2
            
                yCord = 2;
            
            break;
            case '3':// if y is equal to '3' then yCord == 3
            
                yCord = 3;
            
            break;
            case  '4':// if y is equal to '4' then yCord == 4
            
                yCord = 4;
            
            break;
            case '5':// if y is equal to '5' then yCord == 5
            
                yCord = 5;
            
            break;
            case '6':// if y is equal to '6' then yCord == 6
            
                yCord = 6;
            
            break;
            case  '7':// if y is equal to '7' then yCord == 7
            
                yCord = 7;}

        //This if statement takes user input and places '#' in the appropiate place
          if("submarine".equals(ship) && "horizontal".equals(direction) && game[xCord][yCord]== '~'){
              game[xCord][yCord]= '#';
              if(xCord==7){
                 game[xCord+11][yCord] ='#'; }
              else{
              game[xCord][yCord - 1] ='#';
                return true;
            }}
          if("submarine".equals(ship) && "vertical".equals(direction) && game[xCord][yCord]== '~'){
              game[xCord][yCord]= '#';
              if(xCord==7){
                 game[xCord-1][yCord] ='#'; 
              }
               else if(xCord==1){
                 game[xCord+1][yCord] ='#'; }
                 
              else{
                  game[xCord+1][yCord] ='#';
              }
                return true;
            }
           if("destroyer".equals(ship) && "horizontal".equals(direction) && game[xCord][yCord]== '~'){
              game[xCord][yCord]= '#';
              if(xCord==7){
                 game[xCord+1][yCord] ='#';
                 game[xCord+2][yCord] ='#';}
              else{
              game[xCord][yCord - 1] ='#';
              game[xCord][yCord - 2] ='#';
                return true;
            }}
          if("destroyer".equals(ship) && "vertical".equals(direction) && game[xCord][yCord]== '~'){
              game[xCord][yCord]= '#';
              if(xCord==7){
                 game[xCord-1][yCord] ='#'; 
                 game[xCord-2][yCord] ='#';
              }
              else if(xCord==1){
                 game[xCord+1][yCord] ='#'; 
                 game[xCord+2][yCord] ='#';
              }
              else{
                  game[xCord+1][yCord] ='#';
                  game[xCord-1][yCord] ='#';
              }
                return true;
            }
          if("cruiser".equals(ship) && "horizontal".equals(direction) && game[xCord][yCord]== '~'){
              game[xCord][yCord]= '#';
              if(xCord==7){
                 game[xCord+1][yCord] ='#';
                 game[xCord+2][yCord] ='#';
                 game[xCord+3][yCord] ='#';                           }
              else{
              game[xCord][yCord - 1] ='#';
              game[xCord][yCord - 2] ='#';
              game[xCord][yCord - 3] ='#';
                return true;
            }}
          if("cruiser".equals(ship) && "vertical".equals(direction) && game[xCord][yCord]== '~'){
              game[xCord][yCord]= '#';
              if(xCord==7){
                 game[xCord-1][yCord] ='#'; 
                 game[xCord-2][yCord] ='#';
                 game[xCord-3][yCord] ='#';
              }
              else if(xCord==1){
                 game[xCord+1][yCord] ='#'; 
                 game[xCord+2][yCord] ='#';
                 game[xCord+3][yCord] ='#';
              }
              else{
                  game[xCord+1][yCord] ='#';
                  game[xCord-1][yCord] ='#';
                  game[xCord-2][yCord] ='#';
              }
                return true;
            }
          
//          if("battleship".equals(ship) && "horizontal".equals(direction) && game[xCord][yCord]== '~'){
//              game[xCord][yCord]= '#';
//              if(xCord==7){
//                 game[xCord+1][yCord] ='#';
//                 game[xCord+2][yCord] ='#';
//                 game[xCord+3][yCord] ='#';
//                 game[xCord+4][yCord] ='#';
//                 }
//              else{
//              
//              game[xCord][yCord - 1] ='#';
//              game[xCord][yCord - 2] ='#';
//              game[xCord][yCord - 3] ='#';
//              
//                return true;
//            }}
//          if("battleship".equals(ship) && "vertical".equals(direction) && game[xCord][yCord]== '~'){
//              game[xCord][yCord]= '#';
//              if(xCord==7){
//                 game[xCord-1][yCord] ='#'; 
//                 game[xCord-2][yCord] ='#';
//                 game[xCord-3][yCord] ='#';
//                 game[xCord-4][yCord]= '#';
//              }
//              else if(xCord==1){
//                 game[xCord+1][yCord] ='#'; 
//                 game[xCord+2][yCord] ='#';
//                 game[xCord+3][yCord] ='#';
//                 game[xCord+4][yCord] ='#';
//              }
//              else{
//                  game[xCord+1][yCord] ='#';
//                  game[xCord-1][yCord] ='#';
//                  game[xCord-2][yCord] ='#';
//                  game[xCord-3][yCord] ='#';
//              }
//                return true;
//            }
          
          
        System.out.println ("FALSE MOVE");
        return false;
        
    } 
         
        
    
    
    
    // this method just goes through the 2D array and prints each valaue.
    public void displayBoard(){
       
        for(int i=0;i<game.length;i++){
            for(int j=0;j<game[i].length;j++){

               System.out.print(game[i][j]+ " ");
               
            }  
            System.out.println();
        }
        
        
        
    }
}
    


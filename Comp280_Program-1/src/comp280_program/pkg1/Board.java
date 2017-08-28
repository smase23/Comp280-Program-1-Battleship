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
    
    public boolean addShip(String ship, String location, String direction){
//        Scanner input = new Scanner(System.in);
//        System.out.println("What type of ship? Submarine:2 units, Destroyer:3 units, Cruiser:4 units");
//        ship = input.next().toLowerCase();
//        System.out.println("What location will the ship be placed? Ex) A5");
//        location = input.next().toUpperCase();
        char x = location.charAt(0);
        char y = location.charAt(1);
        int xCord = 0;
        int yCord = 0;
        
        
        switch(x){
            case 'A':
            
                xCord = 1;
            
            break;
            case 'B':
            
                xCord = 2;
            
            break;
            case 'C':
            
                xCord = 3;
            
            break;
            case  'D':
            
                xCord = 4;
            
            break;
            case 'E':
            
                xCord = 5;
            
            break;
            case 'F':
            
                xCord = 6;
            
            break;
            case  'G':
    
                xCord = 7;}
                
                
          switch(y){
            case '1':
            
                yCord = 1;
            
            break;
            case '2':
            
                yCord = 2;
            
            break;
            case '3':
            
                yCord = 3;
            
            break;
            case  '4':
            
                yCord = 4;
            
            break;
            case '5':
            
                yCord = 5;
            
            break;
            case '6':
            
                yCord = 6;
            
            break;
            case  '7':
            
                yCord = 7;}

        
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
         
        
    
    
    
    
    public void displayBoard(){
       
        for(int i=0;i<game.length;i++){
            for(int j=0;j<game[i].length;j++){

               System.out.print(game[i][j]+ " ");
               
            }  
            System.out.println();
        }
        
        
        
    }
}
    


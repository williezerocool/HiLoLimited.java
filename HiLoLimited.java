/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilolimited;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class HiLoLimited {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int myNum, userGuess, tries;
        myNum = 1 + r.nextInt(100);
        tries = 0;
        
        System.out.print("I'm thinking of a number between 1-100.  You have 7 guesses.\n guess 1: ");
        userGuess = keyboard.nextInt();
        tries++;
        
        while(tries != 7){
           
            if(userGuess < myNum){
                System.out.print("To low, try again \n" + "guess " + (tries + 1) + ": ");
                userGuess = keyboard.nextInt();
                myNum = 1 + r.nextInt(100);
                tries++;
            }else if(userGuess > myNum){
                System.out.print("To high, try again \n" + "guess " + (tries + 1) + ": ");
                userGuess = keyboard.nextInt();
                myNum = 1 + r.nextInt(100);
                tries++;
            } 
            
         }
        if(tries == 7){
                System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
            }else if(userGuess == myNum){
                System.out.println("You got it and it only took " + (tries + 1) + ".");
            }
   
    
    }
    
}

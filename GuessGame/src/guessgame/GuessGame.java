
package guessgame;

import java.util.Scanner;


public class GuessGame {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int randomNumber=(int)(Math.random() *10);
         int chance=3;
        boolean win=false;
        
        
        System.out.println(" guess number between 0-9");
       
        
       
        
        while(chance>=1){
            System.out.println("enter your guiees number("+ chance+" chances left):");
            int gueesNumber=input.nextInt();
            
            if(gueesNumber==randomNumber){
                System.out.println("you win Bucket taka");
                win=true;
                break;
            
            }else if(gueesNumber>randomNumber){
                System.out.println("number larger");
                
            }else if(gueesNumber<randomNumber){
                System.out.println("yor number is smaller");
                
            }
            
            chance--;
            
            
        
        }
        if(!win){
            System.out.println("better luck next time");
        }
    }
    
}

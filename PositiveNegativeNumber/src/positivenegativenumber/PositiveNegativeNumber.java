
package positivenegativenumber;

import java.util.Scanner;


public class PositiveNegativeNumber {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter number");
        int number=input.nextInt();
        
        if(number<0){
            System.out.println("it is negative number");
        }
        
        else if(number<=0){
            System.out.println("it is zero");
        }
        
        else if(number>0){
        
            System.out.println("it is positive number");
        }
    }
    
}

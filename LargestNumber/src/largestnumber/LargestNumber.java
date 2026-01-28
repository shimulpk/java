
package largestnumber;

import java.util.Scanner;


public class LargestNumber {

    
    public static void main(String[] args) {
        
        
        
//                *********2number against largest number*********

//        Scanner input=new Scanner(System.in);
//        
//        System.out.println("pls enter number");
//        int number1=input.nextInt();
//        
//        System.out.println("pls enter another number");
//        int number2=input.nextInt();
//        
//        
//        if(number1>number2){
//            System.out.println("largest number is "+number1);
//        
//        }
//        else{
//            System.out.println("largest number is "+number2);
//        }
    
    
//            ****multiple number largest number*****
    
    Scanner input=new Scanner(System.in);
    
        System.out.println("enter number 1");
        int number1=input.nextInt();
        
        System.out.println("enter number 2");
        int number2=input.nextInt();
        
        System.out.println("enter number 3");
        int number3=input.nextInt();
        
        
        if(number1>number2 && number1>number3){
            System.out.println("largest number is "+number1);
        }
        
        else if(number2>number1 && number2>number3){
        
            System.out.println("largest number is "+number2);
        }
        
        else{
            System.out.println("largest number is "+number3);
        }
        
            
    
    
    
            
            
            
   } 
    
    
}

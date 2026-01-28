
package oddeven;

import java.util.Scanner;


public class OddEven {

    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
        System.out.println("pls input number");
        int number=input.nextInt();
        
        if(number%2==0){
            System.out.println("it is a even number");
        }
        else{
         System.out.println("it is a odd number");
        }
       
        
        
                
    }
    
}

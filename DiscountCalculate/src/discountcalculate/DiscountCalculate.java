
package discountcalculate;

import java.util.Scanner;


public class DiscountCalculate {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your purchase amount");
        int amount=input.nextInt();
       
        if(amount>=5000){
            System.out.println("discount "+amount*20/100);
        }
        
        else if(amount>=2000){
            System.out.println("discount "+amount * 20/100);
        }
        
        else{
            
            System.out.println("no discount");
        }
        
        
        
        
        
    }
    
}

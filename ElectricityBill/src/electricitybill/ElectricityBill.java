
package electricitybill;

import java.util.Scanner;


public class ElectricityBill {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your unit");
        
        int unit=input.nextInt();
        
        if(unit<100){
            System.out.println(unit*5);
        }
        
        else if(unit<200){
        
            System.out.println(unit*8);
        }
        else{
            System.out.println(unit*10);
        }
    }
    
}

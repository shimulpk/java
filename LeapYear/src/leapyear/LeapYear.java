
package leapyear;

import java.util.Scanner;


public class LeapYear {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter the year");
        int year=input.nextInt();
        
        if(year%4==0){
            System.out.println("Leap year");
        }
        
        else{
            System.out.println("Not Leap year");
        }
        
        
    }
    
}

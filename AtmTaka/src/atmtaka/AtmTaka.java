
package atmtaka;

import java.util.Scanner;


public class AtmTaka {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your balance");
        int ballance=input.nextInt();
        
        System.out.println("Enter your widthdrawal");
        int withdrawal=input.nextInt();
        
        if(ballance>withdrawal){
            System.out.println("Allow");
        }
        
        else{
            System.out.println("insufficient ballace");
        
        }


            
    }
    
}


package evidence1st;

import java.util.Scanner;


public class Evidence1st {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int number=s.nextInt();
       
         if(number%2==0){
            System.out.println("prime");
        }
        else{System.out.println("not prime");}
        }
    
}

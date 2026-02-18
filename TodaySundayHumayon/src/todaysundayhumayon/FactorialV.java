
package todaysundayhumayon;

import java.util.Scanner;


public class FactorialV {
    
    public static void main(String[] args) {
//       int factorial=1;
//        for(int i=1;i<=5;i++){
//        factorial *=i;
//        }
//        System.out.println("Factorial of 5 is "+factorial);
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int input=s.nextInt();
        int factorial=1;
        
        for(int i=1;i<=input;i++){
        factorial *=i;
        }
        System.out.println("factorial is "+factorial);
        
    }
}

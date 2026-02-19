
package evidence1sthome;

import java.util.Scanner;


public class FactorialNumber {
    public static void main(String[] args) {
//        int number=5;
//        int factorial=1;
//        for(int i=1;i<=5;i++){
//        factorial *=i;
//        }
//        System.out.println("factorial is "+factorial);

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int number=s.nextInt();
        int factorial=1;
        for(int i=1;i<=number;i++){
        factorial *=i;
        }
        System.out.println("factorial is "+factorial);
    }
}

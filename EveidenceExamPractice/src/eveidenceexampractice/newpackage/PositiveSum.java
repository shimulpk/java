
package eveidenceexampractice.newpackage;

import java.util.Scanner;


public class PositiveSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int input=s.nextInt();
        int sum=0;
        while(input>=0){
        sum +=input;
            System.out.println("enter number");
        input=s.nextInt();
        }
        s.close();
        System.out.println("Sum is "+sum);
    }
}

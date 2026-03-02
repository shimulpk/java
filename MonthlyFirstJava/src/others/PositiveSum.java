
package others;

import java.util.Scanner;


public class PositiveSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter intiger Number");
        int number=s.nextInt();
        int sum=0;
        while(number>=0){
        sum +=number;
            System.out.println("Enter intiger Number");
            number=s.nextInt();
        }
        System.out.println("Sum is "+sum);


    }
}

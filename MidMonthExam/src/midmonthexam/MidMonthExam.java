
package midmonthexam;

import java.util.Scanner;


public class MidMonthExam {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            
            if (number % i == 0) {
                count += 1;
            }

        }

        if (count == 2) {
            System.out.println(number + " is pime number");
        } else {
            System.out.println(number + " is not prime number");
            
        }
    }
    
}

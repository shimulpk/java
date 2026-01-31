package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        int number =input.nextInt();
        int count = 1;
        int i = 1;

        while (i <= number) {

            count *= i;
            i++;

        }
        System.out.println(count);
    }

}

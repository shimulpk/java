package learnmethod;

import java.util.Scanner;

public class LearnMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        System.out.println(checkFactorialNumber(userInput));

    }

    public static int checkFactorialNumber(int number) {

        int count = 1;

        for (int i = 1; i <= number; i++) {
            count *= i;
           
        }

        return count;

    }

}

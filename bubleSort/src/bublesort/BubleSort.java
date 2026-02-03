package bublesort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.InputMap;

public class BubleSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numbers[] = new int[number];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter value");
            int userInput = input.nextInt();

            numbers[i] = userInput;

        }
//        int[] numbers = {50, 70, 80, 100};
        int[] newArray = sort(numbers);
        System.out.println(Arrays.toString(newArray));

    }

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
        return array;

    }

}

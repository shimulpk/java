package createusermulti;

import java.util.Arrays;
import java.util.Scanner;

public class CreateUSerMulti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Row Size");
        int rowSize = input.nextInt();

        System.out.println("Enter col size");
        int colSize = input.nextInt();

        int[][] numbers = new int[rowSize][colSize];
        int sum = 0;
        int avg=0;
        int max=0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {

                System.out.println("Enter value for row " + (row + 1) + " Enter value for col " + (col + 1));
                int userInput = input.nextInt();
                numbers[row][col] = userInput;

            }
        }
        for (int[] item : numbers) {
            for (int single : item) {
                sum += single;
                avg=sum/single;
                
               
                    if(single>max){
                        max=single;
                    
                    }
                
            

                System.out.println(single + "\tab");
            }

        }
         System.out.println("");   
        System.out.println("sum is "+sum);
        System.out.println("Avg number is " +avg);

        System.out.println(Arrays.deepToString(numbers));
    }

}

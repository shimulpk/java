package searchinarray;

import java.util.Scanner;

public class SearchinArray {

    public static void main(String[] args) {
//        int numbers[] = {50, 60, 10, 45, 89};

        Scanner input= new Scanner(System.in);
        System.out.println("Enter Size");
        int size=input.nextInt();
        int  numbers[] =new int [size];
        
        for(int i=0; i<size;i++){
            System.out.println("Enter Number ");
            int userInput = input.nextInt();
            numbers[i]=userInput;
        }
         System.out.println(" user search ");
        int search = input.nextInt();
        int result = LinearSearh(numbers, search);
        System.out.println(result);

    }

    public static int LinearSearh(int[] array, int searhNumber) {
        int result = -1;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == searhNumber) {
                result = index;
                break;

            }

        }
        return result;

    }

}

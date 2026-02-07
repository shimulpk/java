package multidimentionalarrayhome05.pkg02.pkg26;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDiSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give row for 1st matrix");
        int rows1 = input.nextInt();
        System.out.println("give col for 1st matrix");
        int cols1 = input.nextInt();

        System.out.println("give row for 2nd matrix");
        int rows2 = input.nextInt();
        System.out.println("give col for 2nd matrix");
        int cols2 = input.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        
        inputMatrix(rows1, cols1, matrix1, "Matrix 1");
        inputMatrix(rows2, cols2, matrix2, "Matrix 2");
        
        int [][]sumMatrix=new int [rows1][cols2];
        for(int i=0; i<rows1; i++){
        for(int j=0; j<cols2;j++){
        sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
        }
        }
        System.out.println(Arrays.deepToString(sumMatrix));
        

    }

    public static void inputMatrix(int row, int col, int[][] array,String name) {
        System.out.println("give value for "+name);
        Scanner input =new Scanner(System.in);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Give a value for " + (i + 1) + "row and " + (j + 1) + "for column");
            array[i][j]=input.nextInt();
            }
            
        }
        System.out.println("the array is \n "+Arrays.deepToString(array));
    }

}

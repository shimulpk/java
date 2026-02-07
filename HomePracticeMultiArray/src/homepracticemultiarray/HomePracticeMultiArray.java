
package homepracticemultiarray;

import java.util.Arrays;
import java.util.Scanner;


public class HomePracticeMultiArray {

   
    public static void main(String[] args) {
      
      Scanner input=new Scanner(System.in);
        System.out.println("input the size for row");
        int row=input.nextInt();
        System.out.println("input col size");
        int col=input.nextInt();
        int numbers[][]=new int[row][col];
        
        System.out.println("Enter matrix element");
        for(int i=0; i<row;i++){
            System.out.println("Enter value for "+(i+1)+"row");
        for(int j=0; j<col; j++){
            System.out.println("Enter value for "+(j+1)+"col");
            numbers[i][j]=input.nextInt();
        }
        }
      
        
      int sum=SumArray(numbers);
        System.out.println(sum);
        
        
    }
    
    public static int SumArray(int [][]array){
        int sum=0;
        for(int i=0; i<array.length;i++){
        for(int j=0; j<array[i].length; j++){
        sum +=array[i][j];
        }
        }
        return sum;
    }
     
}

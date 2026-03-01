
package others;

import java.util.Arrays;

import java.util.Scanner;
import javax.crypto.AEADBadTagException;


public class Bublesort {
    public static void main(String[] args) {
        

    
//    int numbers[]={12,3,6};
//    for(int i=0;i<numbers.length-1;i++){
//    for(int j=0;j<numbers.length-1-i;j++){
//    if(numbers[j]>numbers[j+1]){
//    int temp=numbers[j];
//    numbers[j]=numbers[j+1];
//    numbers[j+1]=temp;
//    }
//    }
//    }
//        System.out.println(Arrays.toString(numbers));



    Scanner s=new Scanner(System.in);
        System.out.println("how many number you sorted");
        int n=s.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter Number "+(i+1));
            int userInput=s.nextInt();
            numbers[i]=userInput;
        }
        System.out.println(Arrays.toString(numbers));
        
        for(int i=0;i<numbers.length-1;i++){
        for(int j=0;j<numbers.length-1-i;j++){
        if(numbers[j]>numbers[j+1]){
        int temp=numbers[j];
        numbers[j]=numbers[j+1];
        numbers[j+1]=temp;
        }
        }
        }
        System.out.println("Sorted Numbers are "+Arrays.toString(numbers));

    
    }
}



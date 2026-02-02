
package arrayinitialized;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialized {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How manay number do u want");
        int n=input.nextInt();
        int numbers[]=new int[n];
        System.out.println("begining of loop "+Arrays.toString(numbers));
        
        for(int i=0;i<n;i++){
            
            System.out.println("Enter ur  "+(i+1)+" number");
            int userInput=input.nextInt();
            numbers[i]=userInput;
           
        }
        System.out.println("Ending loop "+Arrays.toString(numbers));
        
        findMaxNumber(numbers);
        findMinNumber(numbers);
        
    }
    
    public static void findMaxNumber(int[] numbers){
        
        int max=0;
        for(int item:numbers){
            if(item>=max){
                max=item;
            
            }
        
        }
        System.out.println("max number is "+max);
    
    }
    
    
    public static void findMinNumber(int[] numbers){
    
        int min=numbers[0];
                
        for(int item:numbers){
            if(item<=min){
            min=item;
            }
           
        }
        System.out.println("number is "+min);
        
        
    }
    
    public static void findAvgNumber(int[] numbers){
            int size=numbers.length;
            float avg=0;
            int sum=0;
            for(int item:numbers){
                sum += item;
            }
            avg=sum/size;
            System.out.println("Average is "+avg);
            
        
        }
    
    
}


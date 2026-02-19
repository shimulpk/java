
package evidence1sthome.veichle.largesrt;

import java.util.Arrays;
import java.util.Scanner;


public class LargestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] numbers=new int[5];
        
        for(int i=0; i<numbers.length;i++){
            System.out.println("Enter number "+(i+1));
            numbers[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
        if(numbers[i]>max){
        max=numbers[i];
        }
        if(numbers[i]<min){
        min=numbers[i];
        }
        }
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
        
    }
            
}

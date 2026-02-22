
package evidence1sthome;

import java.util.Arrays;
import java.util.Scanner;


public class Evidence1stHome {

    
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter number");
//        int input=s.nextInt();
//        int sum=0;
//        
//        while(input>=0){
//        sum +=input;
//            System.out.println("Enter integer number");
//        input=s.nextInt();
//        }
//        System.out.println("sum is "+sum);


    Scanner s=new Scanner(System.in);
    int numbers[]=new int[5];
    for(int i=0;i<numbers.length;i++){
        System.out.println("Enter Number "+(i+1));
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
        System.out.println("Max numbers "+max);
        System.out.println("Min numbers "+min);
}
    
        
        
        
  
    }
        


        
    
    


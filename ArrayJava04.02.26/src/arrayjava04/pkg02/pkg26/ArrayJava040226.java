
package arrayjava04.pkg02.pkg26;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayJava040226 {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int []numbers=new int[7];
       //user 7 ti number dibe segular question
       //avg r cheye boro number gulo dekhate hobe**
        System.out.println("Enter 7 numbers");
        for(int i=0;i<numbers.length;i++){
        numbers[i]=input.nextInt();
        }
        int sum=0;
        int avg;
        for(int i=0;i<numbers.length;i++){
        sum +=numbers[i];
        }
        avg=sum/numbers.length;
        System.out.println(sum);
        System.out.println("avg is "+avg);
        
        for(int val:numbers){
        if(avg<val){
            System.out.println(val + " is big avg");
        }
        }
        }
     
        }
        
   
    


package arrayhome02.pkg02.pkg26;

import java.util.Scanner;



public class ArrayHome020226 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //user array size dite bola
        System.out.println("how many numbers you want sum");
        int size=input.nextInt();
        
        // Array create 
        int [] numbers=new int[size];
        
        // User theke number input neoa
        System.out.println(size+" inputs number");
        for(int i=0;i<size;i++){
        numbers[i]=input.nextInt();
        }
        
        // Sum ber kora
        int sum=0;
        for(int num:numbers){
        sum +=num;
        }
        double avg=0;
        avg=sum/numbers.length;
        
        int max=numbers[0];
        for(int val:numbers){
        if(val>max){
        max=val;
        }
        }
        
        
        //output
        System.out.println("sum is " +sum);
        System.out.println("Average is "+avg);
        System.out.println("max number is "+max);
    }
        }
      
        
        
  
        
        
        
    
    
   
    
    



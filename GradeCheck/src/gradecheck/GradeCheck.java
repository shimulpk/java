
package gradecheck;

import java.util.Scanner;


public class GradeCheck {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input your marks");
        int marks=input.nextInt();
       
        if(marks<40){
            System.out.println("F");
        
        }
        else if(marks<=49){
            System.out.println("C");
        }
        else if(marks<=59){
            System.out.println("B");
        }
        else if(marks<=69){
            System.out.println("A-");
        }
        else if(marks<=79){
            System.out.println("A");
        }
        else if(marks<=100){
            System.out.println("A++");
        }
        else{
            System.out.println("invalid number");
        
        }
        
    }
    
}

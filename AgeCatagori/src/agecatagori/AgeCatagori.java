
package agecatagori;

import java.util.Scanner;


public class AgeCatagori {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        
        if(age<13){
            System.out.println("Child");
     
        }
        else if(age<=19){
            System.out.println("Teenager");
        }
        else if(age<=59){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        
        }
        
        
        
        
        
        
        
    }
    
}

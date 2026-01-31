
package name;

import java.util.Scanner;


public class Name {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        
        String name=input.next();
         String first=name.substring(0, 1).toUpperCase();
         String last=name.substring(1).toLowerCase();
         
         String newName=first+last;
         System.out.println(newName);
        
       
        
        
        
    }
    
}

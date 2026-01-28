
package loginsystem;

import java.util.Scanner;


public class LogInSystem {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your username");
        String username=input.nextLine();
        System.out.println("enter your password");
        String password=input.nextLine();
        
       if(username.equalsIgnoreCase("admin") && password.equals("1234")){
       
           System.out.println("Login successful");
       } 
       
       else{
           System.out.println("Invalid");
       }
       
       
       
       
       
       
       
    }
    
}

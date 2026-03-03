
package loginsystem;

import java.util.Scanner;


public class LogInSystem {

    
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter your username");
//        String username=input.nextLine();
//        System.out.println("enter your password");
//        String password=input.nextLine();
//        
//       if(username.equalsIgnoreCase("admin") && password.equals("1234")){
//       
//           System.out.println("Login successful");
//       } 
//       
//       else{
//           System.out.println("Invalid");
//       }

   Scanner s=new Scanner(System.in);
        System.out.println("Enter username");
        String userName=s.nextLine();
        System.out.println("Enter password");
        String password=s.nextLine();
        
        if(userName.equalsIgnoreCase("shimul")&& password.equals("12345")){
            System.out.println("Welcome");
        }
        else{System.out.println("Invalid username or password");}
       
       
       
       
       
       
       
    }
    
}

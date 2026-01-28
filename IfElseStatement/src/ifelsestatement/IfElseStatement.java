
package ifelsestatement;

import java.util.Scanner;





public class IfElseStatement {

    
    public static void main(String[] args) {
        
//        Scanner input=new Scanner(System.in);
//        System.out.println("Pls Enter your name");
//        String name=input.nextLine();
//       
//        
//        if(name.equalsIgnoreCase("Shimul")){
//           
//            System.out.println("Pls enter your password");
//            String password=input.nextLine();
//            
//            if(password.equals("Shimul2580")){
//                System.out.println("Welcome our team "+name);
//            }
//            else{
//                System.out.println("pls input correct password");
//            }
//        }
//        else{
//            
//            System.out.println("pls enter correct username "); 
//            
//        }
     
        Scanner scanner= new Scanner(System.in);
        System.out.println("pls Enter username");
        String name=scanner.nextLine();
        
        if(name.equalsIgnoreCase("sumi")){
            
            System.out.println("pls enter your password");
            String password=scanner.nextLine();
            if(password.equals("sumi7575")){
                System.out.println("Congratulation "+name);
            }
            else{
                System.out.println("pls enter your correct password");
            }
            
            
        
        }
        else{
        
            System.out.println("pls enter correct username");
        }
        
        
        
            
        }
    
}

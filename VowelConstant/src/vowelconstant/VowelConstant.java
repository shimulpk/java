
package vowelconstant;

import java.util.Scanner;


public class VowelConstant {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter letter");
        
     
     String letter=input.nextLine();
     if(letter.equalsIgnoreCase("a")){
         System.out.println(letter+"vowel");
     
     }
     
     else if(letter.equalsIgnoreCase("e")){
         System.out.println(letter+"vowel");
     
     }
     else if(letter.equalsIgnoreCase("i")){
         System.out.println(letter+"vowel");
     
     }
     else if(letter.equalsIgnoreCase("o")){
         System.out.println(letter+"vowel");
     
     }
     else if(letter.equalsIgnoreCase("u")){
         System.out.println(letter+"vowel");
     
     }
     else{
         System.out.println(letter+" Consonant");
     }
     
                
                
    }
    
    
}


package plaindrome;

import java.util.Scanner;


public class Plaindrome {

    
    public static void main(String[] args) {
//            create scanner
        Scanner input=new Scanner(System.in);
        
//                prompt the user to enter string
        
        System.out.println("Enter a string");
        String s=input.nextLine();
        
//        the index of the first caracter in string

        int low=0;
        
//        the index of the last character in the string

        int high=s.length()-1;
        
        boolean isPalindrome=true;
        
        while(low<high){
            
            if(s.charAt(low)!=s.charAt(high))
        
                isPalindrome=false;
            break;
        }
    }
    
}

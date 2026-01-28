
package calculator;

import java.util.Scanner;


public class Calculator {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enput number1");
        double number1=input.nextDouble();
        
        System.out.println("chose operator + - * /");
        String operator=input.next();
        
         System.out.println("enput number2");
        double number2=input.nextDouble();
        
        if(operator.equals("+")){
            System.out.println(number1+number2);
        }
        
        else if(operator.equals("-")){
        
            System.out.println(number1-number2);
        }
        else if(operator.equals("*")){
        
            System.out.println(number1*number2);
        }
        else if(operator.equals("/")){
        
            System.out.println(number1/number2);
        }
        
        
                
    }
    
}

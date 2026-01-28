package nestedif;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your Weight");
//        float weight = input.nextFloat();

//        if (weight < 18.5) {
//            System.out.println("Under Weight");
//
//        } else if (weight < 25.0) {
//            System.out.println("normal");
//        } else if (weight < 30.0) {
//            System.out.println("overweight");
//        } else {
//
//            System.out.println("obease");
//        }


//        Scanner input=new Scanner(System.in);
//        System.out.println("enter number");
//        
//        
//        int number=input.nextInt();
//        
//        if(number %2== 0){
//            System.out.println("even ");
//        
//        }
//        else{
//            System.out.println("odd");
//        }
        
        

Scanner input=new Scanner(System.in);
        System.out.println("enter number 1");
        int number1=input.nextInt();
        
        System.out.println("enter number 2");
        int number2=input.nextInt();
        
        System.out.println(" enter + - / * ");
        String op=input.next();
                
        
//        if(op.equals("+")){
//            
//        System.out.println(number1+number2);
//        }
        
//        else if(op.equals("-")){
//            System.out.println(number1-number2);
//        }
//        else if(op.equals("/")){
//            System.out.println(number1/number2);
//        }
//        else if(op.equals("*")){
//            System.out.println(number1*number2);
//        }

switch(op){
    case("+") :System.out.println(number1+number2);
    break;
    case("-"): System.out.println(number1-number2);
    break;
    case("/"): System.out.println(number1/number2);
    break;
    case("*"): System.out.println(number1*number2);
    break;
    
    default : System.out.println("wrong");

}
        
       
    
    
        
        
        
       
        
        
        
        
    }

}

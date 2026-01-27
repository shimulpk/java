
package ifelse;

import java.util.Scanner;


public class IfElse {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" enter radius");
        float radius=scanner.nextFloat();
        float areaOfCircle;
        
        if(radius<=0){
            System.out.println("Incorrect Radius");
        }
        
        
        else{
            areaOfCircle=(float)(Math.PI * Math.pow(radius, 2));
//            areaOfCircle=(float)(3.1416* radius * radius);
            System.out.println("Area of circle is "+areaOfCircle);
        }
        
       
        
        
        
       
        
                
      
    }
    
}

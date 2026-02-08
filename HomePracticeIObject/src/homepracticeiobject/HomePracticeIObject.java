
package homepracticeiobject;

import getArea.Circle;
import getArea.Rectangle;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicTextUI;


public class HomePracticeIObject {

   
    public static void main(String[] args) {
        
        
       Rectangle angle=new Rectangle();
       Scanner input=new Scanner(System.in);
        System.out.println("Enter height");
       double height=input.nextDouble();
       
        System.out.println("Enter Width");
       double width=input.nextDouble();
        System.out.println("area "+angle.getArea(height, width));
        System.out.println("Perimeter is "+angle.getPerimeter(height, width));
        
        System.out.println("Enter the another height");
        double height1=input.nextDouble();
        System.out.println("Enter the another width");
        double width1=input.nextDouble();
        System.out.println("the are h1 is "+angle.getArea(height, width));
        System.out.println("the perimeter w1 is "+angle.getPerimeter(height, width));
        
    }
    
    
}

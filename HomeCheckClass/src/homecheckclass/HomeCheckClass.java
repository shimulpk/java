
package homecheckclass;

import gemati.Circle;
import gemati.Rectangle;
import java.util.Arrays;


public class HomeCheckClass {

    
    public static void main(String[] args) {
       
        Rectangle angle=new Rectangle();
        angle.height=15;
        angle.width=20;
        System.out.println(angle.getArea());
        System.out.println(angle.perimeter());
        
        Circle circle=new Circle();
        circle.radius=15;
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
        Circle circle1=new Circle();
        circle1.radius=25;
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        
        Rectangle angle1=new Rectangle();
        angle1.height=10;
        angle1.width=5;
        System.out.println(angle1.getArea());
        System.out.println(angle1.perimeter());
        
        
        
    }
    
}


package learnobjectclass;

import java.awt.geom.Rectangle2D;
import learnobjectclass.geometry.Circle;
import learnobjectclass.geometry.Rectangle;


public class LearnObjectClass {

   
    public static void main(String[] args) {
       Circle circle=new Circle();
       circle.radius=15;
       
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
        
        Circle circle1=new Circle();
       circle1.radius=5;
       
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        
        
        
        Rectangle angle=new Rectangle();
        angle .height=12;
        angle.width=15;
        
        System.out.println(angle.getArea());
        System.out.println(angle.getPerimeter());
        
        
        
    }
    
}



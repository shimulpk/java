
package gemati;


public class Circle {
    public double radius;
    
    public double getArea(){
    double result=Math.PI*Math.pow(radius, 2);
    return result;
    }
    
    public double getPerimeter(){
    double result=Math.PI*radius;
    return result;
    }
}

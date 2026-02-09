
package gemati;


public class Circle {
     double radius=1; 
    public Circle() {
    }
    public Circle(double newRadius) {
        radius=newRadius;
    }
    
    
    
  
  public double getArea(){
   double result=Math.PI*Math.pow(radius, 2);
   return result;
   }
   
 public  double getPerimeter(){
   double result=2*radius*Math.PI;
   return result;
   }
   
  public void setRadius(double radius){
  this.radius=radius;
  }
    
}

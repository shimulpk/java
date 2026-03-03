
package sorok;


public class  ImplementsInterface {
    public double regularPrice;
    public int speed;
    public String color;

    public ImplementsInterface(double regularPrice, int speed, String color) {
        this.regularPrice = regularPrice;
        this.speed = speed;
        this.color = color;
    }
    
    
    public double getSalePrice(){
    return regularPrice;
    }
    
   
}

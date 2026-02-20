
package evidence1sthome.veichle;


public class Truck extends Veichle{
    int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(weight>2000){
        return regularPrice-(regularPrice*0.10);
        }
        else{return regularPrice;} 
    
    
    }
    
    
   
    }
    
    
    
    

    
    
    
    


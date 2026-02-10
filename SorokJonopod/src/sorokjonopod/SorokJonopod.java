
package sorokjonopod;

import sorok.Truck;


public class SorokJonopod {

    public static void main(String[] args) {
        Truck truck =new Truck();
        truck.setWeight(2005);
        truck.setRegularPrice(100);
              
        System.out.println(truck.getSalePrice());
    }
    
}

package checkcalcutap;

public class POS {

    public double CalCulatorSum(double unitPrice, double quanTity) {
        double finalPrice = 0;
       double  discount=0;
        
        double GrossPrice=unitPrice*quanTity;

        if (finalPrice < 100) {
            GrossPrice = discount * 0.2;
        } else if (unitPrice < 200) {
            GrossPrice = discount * 0.3;
        } else if (unitPrice < 400) {
            GrossPrice = discount * 0.4;
        } else {
            GrossPrice = discount * 0.5;
        }
      return finalPrice;
      
    }
}

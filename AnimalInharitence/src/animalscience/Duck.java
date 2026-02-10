
package animalscience;


public class Duck extends Hen{
    private  String quack;
    private  String stayWater;
    private String eatSnails;

    public Duck() {
    }

    public Duck(String quack, String stayWater, String eatSnails) {
        this.quack = quack;
        this.stayWater = stayWater;
        this.eatSnails = eatSnails;
    }

    public Duck(String quack, String stayWater, String eatSnails, String laysEgg, String meat, String fin) {
        super(laysEgg, meat, fin);
        this.quack = quack;
        this.stayWater = stayWater;
        this.eatSnails = eatSnails;
    }

    public String getQuack() {
        return quack;
    }

    public void setQuack(String quack) {
        this.quack = quack;
    }

    public String getStayWater() {
        return stayWater;
    }

    public void setStayWater(String stayWater) {
        this.stayWater = stayWater;
    }

    public String getEatSnails() {
        return eatSnails;
    }

    public void setEatSnails(String eatSnails) {
        this.eatSnails = eatSnails;
    }

    @Override
    public String toString() {
        super.duckMethod();
        return "Duck{" + "quack=" + quack + ", stayWater=" + stayWater + ", eatSnails=" + eatSnails + '}';
    }

   
    
    
}

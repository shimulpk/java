
package animalscience;


public class Hen {
    private String laysEgg;
    private String meat;
    private String fin;

    public Hen() {
    }

    public Hen(String laysEgg, String meat, String fin) {
        this.laysEgg = laysEgg;
        this.meat = meat;
        this.fin = fin;
    }

    public String getLaysEgg() {
        return laysEgg;
    }

    public void setLaysEgg(String laysEgg) {
        this.laysEgg = laysEgg;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "hen{" + "laysEgg=" + laysEgg + ", meat=" + meat + ", fin=" + fin + '}';
    }
    
    public void cowMethod(){
        System.out.println("meat= "+meat);
    }
    
    public void duckMethod(){
        System.out.println("lays egg= "+laysEgg +"meat = "+meat +"fin + "+fin);
    }

    
    
}

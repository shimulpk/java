
package animalscience;


public class Cow extends Hen{
   private String eatGrass;
   private String toMow;
   private String giveMilk;

    public Cow() {
    }

    public Cow(String eatGrass, String toMow, String giveMilk) {
        this.eatGrass = eatGrass;
        this.toMow = toMow;
        this.giveMilk = giveMilk;
    }

    public Cow(String eatGrass, String toMow, String giveMilk, String laysEgg, String meat, String fin) {
        super(laysEgg, meat, fin);
        this.eatGrass = eatGrass;
        this.toMow = toMow;
        this.giveMilk = giveMilk;
    }

    public String getEatGrass() {
        return eatGrass;
    }

    public void setEatGrass(String eatGrass) {
        this.eatGrass = eatGrass;
    }

    public String getToMow() {
        return toMow;
    }

    public void setToMow(String toMow) {
        this.toMow = toMow;
    }

    public String getGiveMilk() {
        return giveMilk;
    }

    public void setGiveMilk(String giveMilk) {
        this.giveMilk = giveMilk;
    }

    @Override
    public String toString() {
        super.cowMethod();
        return "Cow{" + "eatGrass=" + eatGrass + ", toMow=" + toMow + ", giveMilk=" + giveMilk + '}';
    }

   
   
}

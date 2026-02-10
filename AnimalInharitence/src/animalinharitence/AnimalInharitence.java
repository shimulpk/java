
package animalinharitence;

import animalscience.Cow;
import animalscience.Duck;


public class AnimalInharitence {

    
    public static void main(String[] args) {
        Cow cow=new Cow();
        cow.setEatGrass("20kg everyday");
        cow.setGiveMilk("10 kg everyday");
        cow.setToMow("feel hungry");
        cow.setMeat("per year 150 kg");
        
        Duck duck =new Duck();
        duck.setLaysEgg("lsys egg 6 Month");
        duck.setQuack("while hungry");
        duck.setEatSnails("Eat snails everyday");
        duck.setFin("2 fin");
        duck.setMeat("1.5 kg per duck");
       
        System.out.println(cow.toString());
        System.out.println(duck.toString());
        
                
    }
    
}

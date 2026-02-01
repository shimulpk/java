package practisemethod;

public class PractiseMethod {

    public static void main(String[] args) {

       
//        question kno sout r moddhe kora jasse na
        printGrade(68.9);
        

    }

   
  public static void printGrade(Double score){
  
        if(score>=90.0){
            System.out.println("A");
        }
        else if(score>=80.0){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    
    }
}

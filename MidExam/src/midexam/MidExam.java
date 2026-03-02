package midexam;

import java.util.Arrays;
import java.util.Scanner;

public class MidExam {

    public static void main(String[] args) {

//        Binary IO  1

        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\hp\\Desktop\\pk.dat");
            for (int i = 1; i <= 50; i++) {
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream input = new FileInputStream("C:\\Users\\hp\\Desktop\\pk.dat");
            int value;
            while ((value = input.read()) != -1) {
                System.out.println(value + "");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        buble sort

Scanner s=new Scanner(System.in);
        System.out.println("how many number you sorted");
        int n=s.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter Number "+(i+1));
            int userInput=s.nextInt();
            numbers[i]=userInput;
        }
        System.out.println(Arrays.toString(numbers));
        
        for(int i=0;i<numbers.length-1;i++){
        for(int j=0;j<numbers.length-1-i;j++){
        if(numbers[j]>numbers[j+1]){
        int temp=numbers[j];
        numbers[j]=numbers[j+1];
        numbers[j+1]=temp;
        }
        }
        }
        System.out.println("Sorted Numbers are "+Arrays.toString(numbers));

//        factorial number 2

Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=s.nextInt();
       int factorial=1;
        for(int i=1;i<=number;i++){
        factorial *=i;
        }
        System.out.println("Factorial number is "+factorial);
        
//        prime number 3

Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int primeNumber = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
               
                    primeNumber +=1;
            }
        }
        if (primeNumber == 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
    }
        
//        Vehicle class 4
public class Vehicle {
    int speed;
    double regularPrice;
    String color;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    public double getSalePrice(){
    return regularPrice;
    }
}

//    Truck class
public class Truck extends Vehicle{
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

// Vehicle main method
public class MonthlyFirstJava {

    
    public static void main(String[] args) {
        Truck truck=new Truck(2005, 500);
        System.out.println(truck.getSalePrice());
    }
    
}
    }


// maxmin number 5

Scanner s=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter Number "+(i+1));
        numbers[i]=s.nextInt();
      
        }
        System.out.println(Arrays.toString(numbers));
        
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
        if(numbers[i]>max){
        max=numbers[i];
        }
        if(numbers[i]<min){
        min=numbers[i];
        }
            
        }
        System.out.println("Max Number is "+max);
        System.out.println("Min Number is "+min);


      
    }



}

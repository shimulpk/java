
package evidence1st;

import java.util.Arrays;
import java.util.Scanner;


public class HighestLowest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int [] numbers= new int[5];
        
        for(int i=0;i<numbers.length;i++){
            System.out.println("enter number: "); 
            numbers[i]=s.nextInt();
        }
        System.out.println("All Numbers: "+Arrays.toString(numbers));
        
//        initialize with first number
int max=numbers[0];
int min=numbers[0];

for(int i=0;i<numbers.length;i++){
if(numbers[i]>max){
max =numbers[i];
}
if(numbers[i]<min){
min =numbers[i];
}

}
        System.out.println("Max: "+max); 
        System.out.println("Min: "+min);
       
       
    }
}

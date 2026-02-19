
package evidence1sthome;

import java.util.Scanner;


public class Evidence1stHome {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int input=s.nextInt();
        int sum=0;
        
        while(input>=0){
        sum +=input;
            System.out.println("Enter integer number");
        input=s.nextInt();
        }
        System.out.println("sum is "+sum);


        }
    }
    


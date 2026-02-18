
package todaysundayhumayon;

import java.util.Scanner;


public class TodaySundayHumayon {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter intiger number");
        int input=s.nextInt();
        int sum=0;
        
        while(input>=0){
        sum +=input;
            System.out.println("enter intiger nmumber");
            input=s.nextInt();
        
        }
        s.close();
        System.out.println("sum is "+sum);
    }
    
}

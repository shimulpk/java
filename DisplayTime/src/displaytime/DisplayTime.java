
package displaytime;

import java.util.Scanner;




public class DisplayTime {

    
    public static void main(String[] args) {
       
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Second");
        int second= input.nextInt();
        int minutes=second/60;
        int seconds=second%60;

String minMessage=" Minutes ";
if(minutes>1){
    minMessage=" Minutes ";
}
else{
minMessage=" Minute ";
}

        System.out.println(minutes+minMessage+second"seconds");
                
    }
        
}             
                
                
                

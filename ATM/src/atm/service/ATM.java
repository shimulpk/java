
package atm.service;

import Model.Account;
import Model.SavingAccount;
import java.util.Scanner;


public class ATM {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        AccountUtil account=new SavingAccount("34567", 20000);
        
        int choice;
        
        do{
            System.out.println("Welcome \n "+
                    "for withdraw press 1 \n "+
                    "for deposit press 2 \n "+
                    "for checkbalance press 3 \n "+
                    "for exit press 4 \n"
                    );
           choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount");
                   account.withdraw(s.nextDouble());
                   account.checkBalance();
                   break;
                   
                case 2:
                    System.out.println("enter deposit amount");
                    account.deposit(s.nextDouble());
                    account.checkBalance();
                    break;
                    
                case 3:
                    System.out.println("check balance");
                    account.checkBalance();
                    break;
                   
                case 4:
                    System.out.println("thanks");
                    s.close();
                     break;
                    
                default:
                    System.out.println("invalid choice");
                    break;
            }
        
        }
        while(choice !=4);



}
    
}

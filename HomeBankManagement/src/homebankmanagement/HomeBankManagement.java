
package homebankmanagement;

import homebankmanagement.i.CurrentAccount;
import homebankmanagement.i.SavingAccount;



public class HomeBankManagement {

    
    public static void main(String[] args) {
        SavingAccount saving=new SavingAccount();
        saving.accountNumber=1254678;
        saving.accountHolderName="Shimul";
        saving.balance=13000;
        saving.interestRate=5;
        
        saving.deposit(5000);
        saving.accountInfo();
        saving.addInterest();
        
        System.out.println("........................");
        
        CurrentAccount current=new CurrentAccount();
        current.accountHolderName="shimul";
        current.accountNumber=4357899;
        current.balance=25000;
        
        current.accountInfo();
        current.withdraw(10000);
        
        
        
    }
    
}

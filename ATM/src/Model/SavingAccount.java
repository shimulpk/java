
package Model;


public class SavingAccount extends Account{
    private final double Min_Balance=500;

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
       balance +=amount;
        System.out.println("deposited: "+amount);
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount>=Min_Balance){
        balance -=amount;
            System.out.println("WithDrawal: "+amount);
        }
        else{System.out.println("withdrawal: "+Min_Balance);}
    }
    
    
}

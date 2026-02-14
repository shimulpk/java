
package homebankmanagement.i;


public class Account {
  

     public int accountNumber;
     public String accountHolderName;
     public double balance;

    public Account() {
    }

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
     
     public void deposit(double amount){
     balance +=amount;
         System.out.println("deposit is "+amount);
     }
     
     public void accountInfo(){
         System.out.println("Account Number: "+accountNumber);
         System.out.println("Account Holder Name: "+accountHolderName);
         System.out.println("balance: "+balance);
     }
     
    }


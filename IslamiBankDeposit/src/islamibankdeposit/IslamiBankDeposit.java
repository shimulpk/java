
package islamibankdeposit;


public class IslamiBankDeposit {

    
    public static void main(String[] args) {
       AccountDetails account=new AccountDetails();
       
        account.setDeposit(1500);
        account.deposit();
        
        
       
        System.out.println("you have successfully deposit "+account.getDeposit()); 
        account.setWithdraw(2500);
               account.withdraw();

        System.out.println(account.getBalance());
        
        

    }  
            
    
}

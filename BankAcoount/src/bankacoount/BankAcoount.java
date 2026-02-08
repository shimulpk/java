
package bankacoount;


public class BankAcoount {

   
    public static void main(String[] args) {
       AccountStatus1 as1= new AccountStatus1();
      as1.setDeposit(1000);
       as1.deposit();
       
        System.out.println(as1.getBalance());
        
        as1.setWithdraw(800);
        as1.withdraw();
        System.out.println(as1.getBalance());
    }
    
}

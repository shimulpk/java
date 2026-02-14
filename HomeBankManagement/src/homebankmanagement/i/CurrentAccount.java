
package homebankmanagement.i;


public class CurrentAccount extends Account{
     double overDraftLimit;
     public void withdraw(double amount){
     if((overDraftLimit+balance)>=amount){
     balance -=amount;
         System.out.println("withdraw: "+amount);
     }
     else{System.out.println("Insufficient  balance");}
     }
   }



package homebankmanagement.i;


public class SavingAccount extends Account{
  public double interestRate;
  public double interest;
  
  public void addInterest(){
   interest=balance*interestRate/100;
   balance +=interest;
      System.out.println("interest is "+interest);
  }
}

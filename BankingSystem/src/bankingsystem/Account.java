
package bankingsystem;


public class Account {
    private int acountNumber;
    private String aacountHolderName;
    private double balance ;

    public Account() {
    }

    public Account(int aacountNumber, String aacountHolderName, double balance) {
        this.acountNumber = aacountNumber;
        this.aacountHolderName = aacountHolderName;
        this.balance = balance;
    }

    public int getAacountNumber() {
        return acountNumber;
    }

    public void setAacountNumber(int aacountNumber) {
        this.acountNumber = aacountNumber;
    }

    public String getAacountHolderName() {
        return aacountHolderName;
    }

    public void setAacountHolderName(String aacountHolderName) {
        this.aacountHolderName = aacountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(){
    balance +=acountNumber;
    }
    
    public void displayAccountInfo(int acountNumber,String aacountHolderName,double balance){
     
    }
}

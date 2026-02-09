package islamibankdeposit;

public class AccountDetails {

    private int accountNo;
    private double balance;
    private double deposit;
    private double withdraw;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
       
    }

    public double deposit() {

        balance += getDeposit();
        return balance;
    }

    public double withdraw() {
        if (balance >= getWithdraw()) {
            System.out.println("Successfully withdraw " + getWithdraw());
            balance -= getWithdraw();
        } else {
            System.out.println("Insufficient balance");
        }

        return balance;
    }

}

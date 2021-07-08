package MPP.assignment4.probleme;

public class SavingsAccount extends Account {

    private String acctId;
    private double balance;
    private double interestRate;

    public SavingsAccount(String acctId, double interestRate, double balance){
        this.acctId = acctId;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountId(){
        return this.acctId;
    }

    @Override
    public double getBalance(){
        return this.balance;
    }

    @Override
    public double computeUpdatedBalance(){
        return this.getBalance() + (this.interestRate * this.balance);
    }

}

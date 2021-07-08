package MPP.assignment4.probleme;

public class CheckingAccount extends Account {

    private String acctId;
    private double balance;
    private double monthlyFee;

    public CheckingAccount(String acctId, double monthlyFee, double balance){
        this.acctId = acctId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
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
        return this.getBalance() - this.monthlyFee;
    }

}

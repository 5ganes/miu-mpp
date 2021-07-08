package MPP.assignment4.problemc;

public final class Paycheck {

    private double grossPay;
    private double fica = 0.23;
    private double state = 0.05;
    private double local = 0.01;
    private double medicare = 0.03;
    private double socialSecurity = 0.075;
    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getNetPay() {
        return this.grossPay - this.grossPay * (this.fica + this.state + this.local + this.medicare + this.socialSecurity);
    }

}

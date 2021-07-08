package MPP.assignment4.problemc;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

    private double commission;
    private double baseSalary;
    private List<Order> orderList = new ArrayList<>();

    Commissioned(double commission, double baseSalary){
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    public double getCommission() {
        return commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setOrder(Order o){
        this.orderList.add(o);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalCommission = 0;
        for (Order o : this.orderList){
            totalCommission += o.getOrderAmount() * this.commission;
        }
        return totalCommission + baseSalary;
    }

}

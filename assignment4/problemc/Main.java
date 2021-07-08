package MPP.assignment4.problemc;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Salaried s = new Salaried(3000);

        Hourly h = new Hourly(15.5, 30);

        Commissioned c = new Commissioned(0.1, 1000);
        c.setOrder(new Order("O123", new Date(), 124));
        c.setOrder(new Order("O124", new Date(), 80));
        c.setOrder(new Order("O125", new Date(), 90));

        System.out.println("Salary Employee Compensation = " + s.calcCompensation(7, 2020).getNetPay());
        System.out.println("Hourly Employee Compensation = " + h.calcCompensation(7, 2020).getNetPay());
        System.out.println("Commissioned Employee Compensation = " + c.calcCompensation(7, 2020).getNetPay());

    }
}

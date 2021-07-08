package MPP.assignment4.problemc;

public abstract class Employee {

    private String empId;

    public void print() {
        System.out.println("Emp ID : "+ this.empId);
    }

    public Paycheck calcCompensation(int month, int year) {
        double grossSalary = this.calcGrossPay(month, year);
        return new Paycheck(grossSalary);
    }
    public abstract double calcGrossPay(int month, int year);

}

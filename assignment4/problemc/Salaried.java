package MPP.assignment4.problemc;

public class Salaried extends Employee {

    private double salary;

    Salaried(double salary){
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }

}

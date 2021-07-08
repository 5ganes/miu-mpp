package MPP.assignment3.problem4;

public class Condo extends Properties {

    private int numberOfFloors;
    private double rent;

    Condo(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
        this.rent = 400 * this.numberOfFloors;
    }

    public void setAddress(Address address) {
        super.setAddress(address);
    }

    @Override
    public double computeRent(){
        return this.rent;
    }

}

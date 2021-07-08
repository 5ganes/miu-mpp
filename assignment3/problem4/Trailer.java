package MPP.assignment3.problem4;

public class Trailer extends Properties {

    double rent = 500;

    public void setAddress(Address address) {
        super.setAddress(address);
    }

    @Override
    public double computeRent(){
        return this.rent;
    }

}

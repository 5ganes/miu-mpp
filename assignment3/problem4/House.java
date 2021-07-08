package MPP.assignment3.problem4;

public class House extends Properties {

    private double lotSize;
    private double rent;

    House(double lotSize){
        this.lotSize = lotSize;
        this.rent = 0.1 * this.lotSize;
    }

    public void setAddress(Address address) {
        super.setAddress(address);
    }

    @Override
    public double computeRent(){
        return this.rent;
    }

}

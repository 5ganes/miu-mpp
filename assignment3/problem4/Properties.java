package MPP.assignment3.problem4;

public abstract class Properties {

    private Address address;

    public abstract double computeRent();

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress(){
        return this.address;
    }

}

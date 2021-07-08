package MPP.assignment3.problem4;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ Street - " + this.getStreet() + ", City - " + this.city + ", State - " + this.state + ", Zip - " + this.zip);
        return sb.toString();
    }

}

package MPP.assignment3.problem2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    private List<Apartment> apartmentList = new ArrayList<>();

    Building(double maintenanceCost){
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Apartment a){
        this.apartmentList.add(a);
    }

    public double getTotalRent(){
        double totalRent = 0;
        for (Apartment a : this.apartmentList){
            totalRent += a.getRent();
        }
        return totalRent;
    }

    public double getTotalProfit(){
        return this.getTotalRent() - this.maintenanceCost;
    }

}

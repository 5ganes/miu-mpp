package MPP.assignment3.problem2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {

    private String fullName;
    private List<Building> buildingList = new ArrayList<>();

    LandlordInfo(String fullName){
        this.fullName = fullName;
    }

    public void addBuilding(Building b){
        this.buildingList.add(b);
    }

    public String getFullName() {
        return fullName;
    }

    public double calcProfits(){
        double totalProfit = 0;
        for (Building b : this.buildingList){
            totalProfit += b.getTotalProfit();
        }
        return totalProfit;
    }

}

package Intermediate.PaintWizard;

import java.util.ArrayList;

public class PaintWizard {
    int numberOfDifferentTins;
    int tinsForFullCoverage=0;

    double waste=0;
    double leastWaste=1000000;
    String leastWasteName = "";

    double roomPrice;
    double bestRoomPrice=10000000;
    String bestRoomPricePaint ="";
    ArrayList<PaintTin> Tins = new ArrayList<>();
    PaintWizard(double roomSize){
        Tins.add(new PaintTin("CheapoMax",20,19.99,10));
        Tins.add(new PaintTin("AverageJoes",15,17.99,11));
        Tins.add(new PaintTin("DuluxourousPaints",10,25.00,20));
        numberOfDifferentTins = Tins.size();

        for (int i = 0; i < numberOfDifferentTins; i++) {
            PaintTin tin = Tins.get(i);
            tinsForFullCoverage = findTinsForFullCoverage(tin, roomSize);
            isBestWaste(tin, roomSize);
            isBestRoomPrice(tin);
        }

        System.out.println(leastWasteName + " wastes the least paint on a room of size " + roomSize + " using " + tinsForFullCoverage + " tins, with " + leastWaste + " litres left over.");
        System.out.println(bestRoomPricePaint + " is the cheapest on a room of size " + roomSize + " using " + tinsForFullCoverage + " tins, costing £" + bestRoomPrice + ".");
    }

    public int findTinsForFullCoverage (PaintTin tin, double roomSize){
        return tinsForFullCoverage = (int) (Math.ceil(roomSize / tin.getCoveragePerTin()));
    }

    public void isBestWaste (PaintTin tin, double roomSize){
        waste = findWaste(tin, roomSize);
        if (waste < leastWaste){
            System.out.println(leastWaste);
            leastWaste = waste;
            leastWasteName = tin.getName();
        }
    }

    public void isBestRoomPrice(PaintTin tin){
        roomPrice = findRoomPrice(tin);
        if(roomPrice < bestRoomPrice){
            bestRoomPrice = roomPrice;
            bestRoomPricePaint = tin.getName();
        }

    }public double findWaste(PaintTin tin, double roomSize){
        return waste = ((( tinsForFullCoverage * tin.getCoveragePerTin() ) - roomSize) / tin.getCoveragePerLitre() );
    }

    public double findRoomPrice (PaintTin tin) {
        return roomPrice = tin.getPrice() * tinsForFullCoverage;
    }
}

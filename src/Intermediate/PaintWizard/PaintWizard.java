package Intermediate.PaintWizard;

import Intermediate.Garage.PaintTin;
import java.util.ArrayList;

public class PaintWizard {
    PaintWizard(double size){
        ArrayList<PaintTin> Tins = new ArrayList<>();
        Tins.add(new PaintTin("CheapoMax",20,19.99,10));
        Tins.add(new PaintTin("AverageJoes",15,17.99,11));
        Tins.add(new PaintTin("DuluxourousPaints",10,25.00,20));

        int numTins = Tins.size();
        int tinsForFullCoverage=0;

        double waste=0;
        double leastWaste=1000000;
        String leastWasteName = "";

        double roomPrice;
        double bestRoomPrice=10000000;
        String bestRoomPricePaint ="";

        for (int i = 0; i < numTins; i++) {
            waste = size % Tins.get(i).getCoveragePerTin();
            tinsForFullCoverage = (int) (Math.ceil(size / (Tins.get(i).getCoveragePerTin())));
            roomPrice = Tins.get(i).getPrice() * tinsForFullCoverage ;

            if (waste < leastWaste){
                leastWaste = waste/Tins.get(i).getCoveragePerLitre();
                leastWasteName = Tins.get(i).getName();
            }
            if(roomPrice < bestRoomPrice){
                bestRoomPrice = roomPrice;
                bestRoomPricePaint = Tins.get(i).getName();
            }
        }
        System.out.println(leastWasteName + " wastes the least paint on a room of size " + size + " using " + tinsForFullCoverage + " tins, with " +leastWaste + " litres left over.");
        System.out.println(bestRoomPricePaint + " is the cheapest on a room of size " + size + " using " + tinsForFullCoverage + " tins, costing £" + bestRoomPrice + ".");
    }
}

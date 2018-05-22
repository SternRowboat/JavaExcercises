package Intermediate.PaintWizard;

public class PaintTin {
    String name;
    int volume;
    double price;
    int coveragePerLitre;
    int coveragePerTin;
    double pricePerArea;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public int getCoveragePerLitre() {
        return coveragePerLitre;
    }

    public int getCoveragePerTin() {
        return coveragePerTin;
    }

    public double getPricePerArea() {
        return pricePerArea;
    }

    public PaintTin(String name, int volume, double price, int coveragePerLitre) {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.coveragePerLitre = coveragePerLitre;
        this.coveragePerTin = volume * coveragePerLitre;
        this.pricePerArea = coveragePerTin / price;
    }
}

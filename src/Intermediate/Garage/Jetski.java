package Intermediate.Garage;

public  class Jetski extends Vehicle {
    double propellerSize;

    public Jetski(int ID, String color, int wheels, int seats, double currentSpeed, double propellerSize) {
        super(ID, color, wheels, seats, currentSpeed);
        this.propellerSize = propellerSize;
    }

    public int getBill(){
        int price = 40;
        return price;
    }
    @Override
    public String toString() {
        return super.toString ()+ "Propeller Size: " + propellerSize + "\n";
    }
}
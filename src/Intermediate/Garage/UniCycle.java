package Intermediate.Garage;

public  class UniCycle extends Vehicle {
    int seatHeight;

    public UniCycle(int ID, String color, int wheels, int seats, double currentSpeed, int seatHeight) {
        super(ID, color, wheels, seats, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public int getBill(){
        int price = 12;
        return price;
    }

    @Override
    public String toString() {
        return super.toString ()+ "Seat Height: " + seatHeight + "\n";
    }
}
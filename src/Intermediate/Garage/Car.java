package Intermediate.Garage;

public  class Car extends Vehicle {
    int doors;

    public Car(int ID, String color, int wheels, int seats, double currentSpeed, int doors) {
        super(ID, color, wheels, seats, currentSpeed);
        this.doors = doors;
    }

    public int getBill(){
        int price = 25;
        return price;
    }

    @Override
    public String toString() {
        return super.toString ()+ "Number of doors: " + doors + "\n";
    }
}
package Intermediate.Garage;

class Vehicle {
     private int ID;
     private String color;
     private int wheels;
     private int seats;
     private double topSpeed;

     public Vehicle(int id, String color, int wheels, int seats, double topSpeed) {
         this.ID = id;
         this.color = color;
         this.wheels = wheels;
         this.seats = seats;
         this.topSpeed = topSpeed;
     }

    public int getID() {
        return ID;
    }

    public int getBill(){
        int price = 20;
        return price;
    }

     @Override
     public String toString() {
         return ("Vehicle type is: " + this.getClass().getSimpleName() + "\n" +
                 "ID is: " + this.ID + "\n" +
                 "Color is: " + this.color + "\n" +
                 "Number of wheels is: " + this.wheels + "\n" +
                 "Number of Seats are: " + seats + "\n" +
                 "Top Speed is: " + topSpeed + "\n");
     }
 }
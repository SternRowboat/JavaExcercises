package Intermediate.Garage;

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
     private int ID;
     private String color;
     private int wheels;
     private int seats;
     private double currentSpeed;

     public Vehicle(int id, String color, int wheels, int seats, double currentSpeed) {
         this.ID = id;
         this.color = color;
         this.wheels = wheels;
         this.seats = seats;
         this.currentSpeed = currentSpeed;

     }

     public static void main(String[] args) {
         ArrayList<Vehicle> vehicles = new ArrayList<>();
         vehicles.add(new Car(0, "red", 4, 5, 6.5, 4));
         vehicles.add(new Car(1, "white", 3, 5, 3.5, 4));
         vehicles.add(new Jetski(2, "red", 4, 5, 0, 2.2));
         vehicles.add(new Jetski(3, "red", 4, 5, 0, 2.5));
         vehicles.add(new UniCycle(4, "red", 4, 5, 20.8, 3));
         vehicles.add(new UniCycle(5, "red", 4, 5, 3, 1));
        Garage collection = new Garage();
         collection.billCalc(vehicles);
         collection.addVehicle(vehicles);


     }

//     @Override
//     public String toString() {
//         return ("ID is: " + this.ID + "\n" +
//                 "Color is: " + this.color + "\n" +
//                 "Number of wheels is: " + this.wheels + "\n" +
//                 "Number of Seats are: " + seats + "\n" +
//                 "Current speed is: " + currentSpeed + "\n");
//     }
 }
 class Car extends Vehicle {
     int doors;

     public Car(int ID, String color, int wheels, int seats, double currentSpeed, int doors) {
         super(ID, color, wheels, seats, currentSpeed);
         this.doors = doors;
     }
 }


 class Jetski extends Vehicle {
     double propellerSize;

     public Jetski(int ID, String color, int wheels, int seats, double currentSpeed, double propellerSize) {
         super(ID, color, wheels, seats, currentSpeed);
         this.propellerSize = propellerSize;
     }
 }

 class UniCycle extends Vehicle {
     int seatHeight;

     public UniCycle(int ID, String color, int wheels, int seats, double currentSpeed, int seatHeight) {
         super(ID, color, wheels, seats, currentSpeed);
         this.seatHeight = seatHeight;
     }
 }

 class Garage {
     public void billCalc(ArrayList<Vehicle> vehicles){
         for (Vehicle element: vehicles){
             switch (element.getClass().getSimpleName()){
                 case "Car":
                     System.out.println("Bill for Car is £25");
                     break;
                 case "Jetski":
                     System.out.println("Bill for Jetski: £40");
                     break;
                 case "UniCycle":
                     System.out.println("Bill for UniCycle is £8");
                     break;
             }

         }
     }
     public static void list(ArrayList<Vehicle> vehicles) {
         for (Vehicle element: vehicles){
             System.out.println(element);
         }
     }

     public void addVehicle(ArrayList<Vehicle> vehicles) {
         String vehicleType = null;

         Scanner sc = new Scanner(System.in);
         do {
             System.out.println("What is the new vehicle type; Car, Jetski, or Unicycle?");
             vehicleType = sc.nextLine();
         }while (!(((vehicleType).toLowerCase().equals("car"))||
                 ((vehicleType).toLowerCase().equals("jetski"))||
                 ((vehicleType).toLowerCase().equals("unicycle"))));
         
         System.out.println("created new " + vehicleType);
     }

     public void removeVehicle(int ID) {
     }

     public void removeVehicle() {
     }

     public void fixVehicle(int ID) {
     }

     public void emptyGarage() {
     }
 }
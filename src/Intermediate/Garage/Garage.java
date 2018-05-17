package Intermediate.Garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    void populateGarage() {
        vehicles.add(new Car(0, "red", 4, 5, 30.5, 4));
        vehicles.add(new Car(1, "white", 3, 5, 90, 2));
        vehicles.add(new Jetski(2, "red", 0, 2, 70, 2.2));
        vehicles.add(new Jetski(3, "red", 4, 2, 100.2, 2.5));
        vehicles.add(new UniCycle(4, "red", 1, 1, 20.8, 3));
        vehicles.add(new UniCycle(5, "red", 1, 2, 3, 1));
    }

    private ArrayList<Vehicle> getVehicles(){
            return this.vehicles;
    }

    void billCalc(){
        double total = 0;
        for (Vehicle element: vehicles){
            total = total + element.getBill();
            System.out.println("Price for " + element.getClass().getSimpleName() + " " + element.getID()
                    + " is: £" + element.getBill() + ".");
        }
        System.out.println("Total is " + total);
    }

    void listVehicles() {
        for (Vehicle element: vehicles){
            System.out.println(element);
        }
    }

    void addVehicle() {
        String vehicleType = null;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What is the new vehicle type; Car, Jetski, or Unicycle?");
            vehicleType = sc.nextLine().toLowerCase();
        } while (!((vehicleType).matches("car|jetski|unicycle")));

        switch (vehicleType){
            case ("car"):
                vehicles.add(new Car(8, "white", 3, 5, 3.5, 4));
                break;
            case ("jetski"):
                vehicles.add(new Jetski(9, "red", 4, 5, 0, 2.5));
                break;
            case ("unicycle"):
                vehicles.add(new UniCycle(7, "red", 4, 5, 20.8, 3));
                break;
        }
        System.out.println("created new " + vehicleType);
    }

    void removeVehicle(int ID) {
        for (int i = 0; i <vehicles.size() ; i++) {
            if (vehicles.get(i).getID() == ID){
                vehicles.remove(i);
            }
        }
    }

    void removeVehicle(String vehicleType) {
        for (int i = 0; i <vehicles.size() ; i++) {
            if (vehicles.get(i).getClass().getSimpleName().toLowerCase().equals(vehicleType)){
                vehicles.remove(i);
                i--;
            }
        }
    }

    void emptyGarage() {
        vehicles.clear();
    }
}
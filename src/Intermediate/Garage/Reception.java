package Intermediate.Garage;

import java.util.Scanner;

public class Reception {
    public Reception(Garage garage) {
        garage.populateGarage();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Watsons Garage, which service do you require?");
        Boolean anotherService = null;
        do {
            Boolean validService = null;
            do {
                System.out.println("Available services: list, add/remove, fix, empty.");
                String input = sc.nextLine();
                validService = true;
                switch (input.toLowerCase()) {
                    case ("list"):
                        garage.listVehicles();
                        break;
                    case ("add"):
                        garage.addVehicle();
                        break;
                    case ("remove"):
                        remove(garage);
                        break;
                    case ("fix"):
                        garage.billCalc();
                        break;
                    case ("empty"):
                        garage.emptyGarage();
                        break;
                    default:
                        System.out.println("Please try again.");
                        validService = false;
                        break;
                }
            } while (!validService);
            String another;
            System.out.println("Do you require another service?");
            do {

                another = sc.nextLine().toLowerCase();
                if (another.matches("y|yes")) {
                    anotherService = true;
                } else if (another.matches("n|no")) {
                    anotherService = false;
                } else {
                    System.out.println("Please Try again.");
                }
            } while (!another.matches("n|no|y|yes"));
        }while (anotherService);
    }
    public void remove(Garage garage) {
        String removeByAttribute;
        do {
            Scanner sc = new Scanner(System.in);
            removeByAttribute = sc.nextLine().toLowerCase();

            if (removeByAttribute.matches("/d")) {
                System.out.println("1st one");
                garage.removeVehicle(Integer.parseInt(removeByAttribute));
                System.out.println("Removed vehicle with ID " + removeByAttribute);

            }else if (removeByAttribute.matches("car|jetski|unicycle")) {
                System.out.println("me");
                garage.removeVehicle(removeByAttribute);
                System.out.println("Removed all " + removeByAttribute + "'s.");

            } else {
                System.out.println("Please Try again.");
            }
        } while (!removeByAttribute.matches("/d|car|jetski|unicycle"));
    }
}

package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    Dealership dealership;

    private static void displayMenu() {
        System.out.printf("""
                  =======================================
                       WELCOME TO D & B USED CARS
                  =======================================
                  (1) FIND A VEHICLE
                  (2) LIST ALL VEHICLES
                  (3) ADD A VEHICLE
                  (4) REMOVE A VEHICLE
                  (5) EXIT DEALERSHIP
                """);
    }

    private static void searchMenu(Scanner scanner) {
        System.out.printf("""
                  =======================================
                            SEARCH FOR A VEHICLE
                  =======================================
                  (1) SEARCH BY MAKE
                  (2) SEARCH BY MODEL
                  (3) SEARCH BY COLOR
                  (4) SEARCH BY VIN
                  (5) SEARCH BY VEHICLE TYPE
                  (6) SEARCH BY MILEAGE
                  (7) SEARCH BY PRICE
                  (8) SEARCH BY YEAR
                """);
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealerShip("inventory.csv");
    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        init();
        displayMenu();
        int userInput = scanner.nextInt();
        scanner.nextLine();
        switch (userInput) {
            case 1:
                searchMenu(scanner);
                break;
            case 2:

                break;
            case 3:
                addCar(scanner);
                break;

            case 4:
                removeCar(scanner);
                break;

            case 5:
                return;

            default:
                System.out.println("\nSORRY WRONG INPUT TRY AGAIN!");
        }

    }

    public void searchByMake() {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
    }


    // method to add a new car
    private void addCar(Scanner scanner) {
        System.out.println("VIN: ");
        int vin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Make: ");
        String make = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Mileage: ");
        int mileage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Vehicle Type: ");
        String vehicleType = scanner.nextLine();
        System.out.println("Price: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, mileage, price);
        dealership.addVehicle(vehicle);
    }


    // method to remove car
    private void removeCar(Scanner scanner) {
        System.out.println("Enter the vin of the vehicle you would like to remove: ");
        int vin = scanner.nextInt();
        scanner.nextLine();
        for (Vehicle v : dealership.getAllVehicles()) {
            dealership.removeVehicle(v);
        }
    }


    public String toString() {
        return String.format("%s | %s | %s");
    }
}





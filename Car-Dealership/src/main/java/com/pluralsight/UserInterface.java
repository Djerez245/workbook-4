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
        boolean appRunning = true;
        while (appRunning) {
            switch (userInput) {
                case 1:
                    searchMenu(scanner);
                    break;
                case 2:
                    dealership.getAllVehicles();
                    break;
                case 3:
                    addCar(scanner);
                    break;

                case 4:
                    //removeCar(scanner);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("\nSORRY WRONG INPUT TRY AGAIN!");
            }
        }

    }

    public void searchMenu(){
        Scanner scanner = new Scanner(System.in);
        init();
        searchMenu();
        int userInput = scanner.nextInt();
        scanner.nextLine();
        switch (userInput){
            case 1:
                searchByMake(scanner);
                break;
            case 2:
                searchByModel(scanner);
                break;
            case 3:
                searchByColor(scanner);
                break;
            case 4:
                searchByVin(scanner);
                break;
            case 5:
                searchByVehicleType(scanner);
                break;
            case 6:
                searchByMileage(scanner);
                break;
            case 7:
                searchByPrice(scanner);
                break;
            case 8:
                searchByYear(scanner);
                break;
            default:
                System.out.println("SORRY INVALID INPUT TRY AGAIN!");
                return;
        }
    }

    // method to search for car by make
    public void searchByMake(Scanner scanner) {
        System.out.println("Please enter the make of the car you would like to search for: ");
        String make = scanner.nextLine();
        dealership.getVehicleByMake(make);
    }

    // method to search for car by model
    public void searchByModel(Scanner scanner){
        System.out.println("Please enter the model of the car you would like to search for: ");
        String model = scanner.nextLine();
        dealership.getVehicleByModel(model);
    }

    public void searchByColor(Scanner scanner){
        System.out.println("Enter the color of the car that you would like to search for: ");
        String color = scanner.nextLine();
        dealership.getVehicleColor(color);
    }

    public void searchByVin(Scanner scanner){
        System.out.println("Enter the vin of the vehicle you would like to search for: ");
        int vin = scanner.nextInt();
        dealership.getVehicleVin(vin);
    }

    public void searchByVehicleType(Scanner scanner){
        System.out.println("Enter the type of vehicle that you would like to search for: ");
        String type = scanner.nextLine();
        dealership.getVehicleType(type);
    }

    public void searchByMileage(Scanner scanner){
        System.out.println("Enter Maximum mileage: ");
        int miles = scanner.nextInt();
        scanner.nextLine();
        dealership.getVehicleMileage(miles);
    }

    public void searchByPrice(Scanner scanner){
        System.out.println("What is your maximum price: ");
        double price = scanner.nextDouble();
        dealership.getVehiclePrice(price);
    }

    public void searchByYear(Scanner scanner){
        System.out.println("What is the lowest year vehicle that you would like: ");
        int year = scanner.nextInt();
        dealership.getVehicleYear(year);
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
//    private void removeCar(Scanner scanner) {
//        System.out.println("Enter the vin of the vehicle you would like to remove: ");
//        int vin = scanner.nextInt();
//        scanner.nextLine();
//        for (Vehicle v: dealership.getAllVehicles()) {
//            if (v.getVin() == vin){
//                dealership.removeVehicle(v);
//            }
//        }
//    }


    public String toString() {
        return String.format("%s | %s | %s");
    }
}





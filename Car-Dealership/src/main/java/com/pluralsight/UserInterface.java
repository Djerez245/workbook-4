package com.pluralsight;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    Dealership dealership;
    final Scanner scanner = new Scanner(System.in);

    private static void displayMenu() {
        System.out.println("""
                
                                                                                                   =======================================
                                                                                                        WELCOME TO D & B USED CARS
                                                                                                   =======================================
                                                                                                   (0)     TO BUY/LEASE A NEW CAR
                                                                                                   (1)        FIND A VEHICLE
                                                                                                   (2)      LIST ALL VEHICLES
                                                                                                   (3)        ADD A VEHICLE
                                                                                                   (4)       REMOVE A VEHICLE
                                                                                                   (5)       EXIT DEALERSHIP
                """);
    }

    private static void displaySearchMenu() {
        System.out.println("""
                
                                                                                                   =======================================
                                                                                                             SEARCH FOR A VEHICLE
                                                                                                   =======================================
                                                                                                   (1)        SEARCH BY MAKE
                                                                                                   (2)        SEARCH BY MODEL
                                                                                                   (3)        SEARCH BY COLOR
                                                                                                   (4)         SEARCH BY VIN
                                                                                                   (5)     SEARCH BY VEHICLE TYPE
                                                                                                   (6)       SEARCH BY MILEAGE
                                                                                                   (7)        SEARCH BY PRICE
                                                                                                   (8)        SEARCH BY YEAR
                                                                                                   (0)              EXIT
                """);
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealerShip("inventory.csv");
    }

    public void showMainMenu() throws IOException {
        init();

        boolean appRunning = true;
        while (appRunning) {
            displayMenu();
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 0 -> buyOrLeaseCar();
                case 1 -> showSearchMenu();
                case 2 -> printVehicleList(dealership.getAllVehicles());
                case 3 -> addCar(scanner);
                case 4 -> removeCar(scanner);
                case 5 -> appRunning = false;
                default -> System.out.println("\nSORRY WRONG INPUT TRY AGAIN!");
            }
        }

    }

    public void showSearchMenu() {
        boolean inSearchMenu = true;
        while (inSearchMenu) {
            displaySearchMenu();
            int userInput = scanner.nextInt();
            scanner.nextLine();
            // uses a lambda switch statement for cleaner code
            switch (userInput) {
                case 1 -> searchByMake(scanner);
                case 2 -> searchByModel(scanner);
                case 3 -> searchByColor(scanner);
                case 4 -> searchByVin(scanner);
                case 5 -> searchByVehicleType(scanner);
                case 6 -> searchByMileage(scanner);
                case 7 -> searchByPrice(scanner);
                case 8 -> searchByYear(scanner);
                case 0 -> inSearchMenu = false;
                default -> {
                    System.out.println("SORRY INVALID INPUT TRY AGAIN!");
                    return;
                }
            }
        }
    }

    // method to print a list of vehicles
    private void printVehicleList(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    // method to search for car by make
    public void searchByMake(Scanner scanner) {
        System.out.println("\nPlease enter the make of the car you would like to search for: \n");
        String make = scanner.nextLine();
        printVehicleList(dealership.getVehicleByMake(make));
    }

    // method to search for car by model
    public void searchByModel(Scanner scanner) {
        System.out.println("\nPlease enter the model of the car you would like to search for: \n");
        String model = scanner.nextLine();
        printVehicleList(dealership.getVehicleByModel(model));
    }

    public void searchByColor(Scanner scanner) {
        System.out.println("\nEnter the color of the car that you would like to search for: \n");
        String color = scanner.nextLine();
        printVehicleList(dealership.getVehicleByColor(color));
    }

    public void searchByVin(Scanner scanner) {
        System.out.println("\nEnter the vin of the vehicle you would like to search for: \n");
        int vin = scanner.nextInt();
        printVehicleList(dealership.getVehicleByVin(vin));
    }

    public void searchByVehicleType(Scanner scanner) {
        System.out.println("\nEnter the type of vehicle that you would like to search for: \n");
        String type = scanner.nextLine();
        printVehicleList(dealership.getVehiclesByType(type));
    }

    public void searchByMileage(Scanner scanner) {
        System.out.println("\nEnter Maximum mileage: \n");
        int miles = scanner.nextInt();
        scanner.nextLine();
        printVehicleList(dealership.getVehiclesByMileage(miles));
    }

    public void searchByPrice(Scanner scanner) {
        System.out.println("\nEnter Maximum price: \n");
        double price = scanner.nextDouble();
        printVehicleList(dealership.getVehiclesByPrice(price));
    }

    public void searchByYear(Scanner scanner) {
        System.out.println("\nWhat is the lowest year vehicle that you would like: \n");
        int year = scanner.nextInt();
        printVehicleList(dealership.getVehicleByYear(year));
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
        DealershipFileManager fileManager = new DealershipFileManager();
        try {
            fileManager.saveDealership(dealership);
            System.out.println("\nVEHICLE ADDED!");
        } catch (IOException e) {
            System.out.println("sorry can not add vehicle!");
            throw new RuntimeException(e);
        }

    }

    // method to remove car
    private void removeCar(Scanner scanner) throws IOException {
        DealershipFileManager fileManager = new DealershipFileManager();
        System.out.println("Enter the vin of the vehicle you would like to remove: ");
        int vin = scanner.nextInt();
        scanner.nextLine();

        boolean vehicleFound = false;
        for (Vehicle v : dealership.getAllVehicles()) {
            if (v.getVin() == vin) {
                vehicleFound = true;
                dealership.removeVehicle(v);
                fileManager.saveDealership(dealership);
                System.out.println("\nVEHICLE REMOVED!");
            }
        }
        if (!vehicleFound) {
            System.out.println("VEHICLE NOT FOUND!");
        }
    }

    private void buyOrLeaseCar() throws IOException {
        DealershipFileManager fileManager = new DealershipFileManager();
        Contract c = null;
        ContractDataManager dataManager = new ContractDataManager();
        System.out.println("WOULD LIKE TO BUY OR LEASE A VEHICLE: ");
        String leaseOrBuy = scanner.nextLine();
        System.out.println("PLEASE ENTER TODAY'S DATE (YYYYMMDD): ");
        String date = scanner.nextLine();
        System.out.println("PLEASE ENTER YOUR NAME: ");
        String buyerName = scanner.nextLine();
        System.out.println("PLEASE ENTER YOUR EMAIL: ");
        String buyerEmail = scanner.nextLine();
        System.out.println("ENTER THE VIN OF THE VEHICLE WOULD YOU LIKE TO PURCHASE: ");
        int purchasedCar = scanner.nextInt();
        scanner.nextLine();
        if (leaseOrBuy.equalsIgnoreCase("buy")) {
            System.out.println("WOULD YOU LIKE TO FINANCE THE VEHICLE?");
            System.out.println("PLEASE ENTER 'YES' OR 'NO': ");
            String yesOrNo = scanner.nextLine();
            c = new SalesContract(date, buyerName, buyerEmail, dealership.getVehicleByVin(purchasedCar).get(0), yesOrNo);
        } else if (leaseOrBuy.equalsIgnoreCase("lease")) {
            c = new LeaseContract(date, buyerName, buyerEmail, dealership.getVehicleByVin(purchasedCar).get(0));
        }
        dataManager.saveContract(c);
        for (Vehicle v : dealership.getAllVehicles()){
            if(v.getVin() == purchasedCar){
                dealership.removeVehicle(v);
                fileManager.saveDealership(dealership);
            }
        }
    }

}





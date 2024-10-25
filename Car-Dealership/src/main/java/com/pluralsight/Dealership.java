package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String businessName;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> dealershipInventory;

    public Dealership(String businessName, String address, String phoneNumber) {
        this.businessName = businessName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dealershipInventory = new ArrayList<Vehicle>();
    }

    // method to list all vehicles
    public ArrayList<Vehicle> getAllVehicles(){
        return dealershipInventory;
    }

    public void addVehicle(Vehicle vehicle){
        dealershipInventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        dealershipInventory.remove(vehicle);
    }


    // method to make a feature to search by the make
    public void getVehicleByMake() {
        Scanner scanner = new Scanner(System.in);
        Prompts.printPrompt(Prompts.makeSearch);
        String userInput = scanner.nextLine();

        for (Vehicle v : dealershipInventory) {
            if (v.getMake().equalsIgnoreCase(userInput)) {
                System.out.println(v.toString());
            }
        }
    }

    // method to search by VIN
    public Vehicle getVehicleByVin(int vin) {
        int input = scanner.nextInt();
        ArrayList<Vehicle> vehiclesByVin = new ArrayList();

        for (Vehicle v : vehicleInventory) {
            if (v.getVin() == vin) {
                vehiclesByVin.add(v);
                return v;
            }
        }
    return null;
    }



    // method to search by year
    public static void getVehicleYear() {
        Scanner scanner = new Scanner(System.in);
        Prompts.printPrompt(Prompts.yearSearch);
        int input = scanner.nextInt();

        for (Vehicle v : vehicleInventory) {
            if (v.getYear() == input) {
                System.out.println(v.toString());
            }
        }
    }


    // method to search by color
    public static void getVehicleColor() {
        Scanner scanner = new Scanner(System.in);
        Prompts.printPrompt(Prompts.yearSearch);
        String input = scanner.nextLine();

        for (Vehicle v : vehicleInventory) {
            if (v.getColor() == input) {
                System.out.println(v.toString());
            }
        }
    }

    // method to search by mileage
    public static void getVehicleMileage(){}

    // method to search by vehicle type
    public static void getVehicleType(){}

    // method to search by price
    public static void getVehiclePrice(){}


}

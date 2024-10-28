package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private final String businessName;
    private final String address;
    private final String phoneNumber;
    private final ArrayList<Vehicle> dealershipInventory;

    public Dealership(String businessName, String address, String phoneNumber) {
        this.businessName = businessName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dealershipInventory = new ArrayList<>();
    }

    // method to list all vehicles
    public ArrayList<Vehicle> getAllVehicles() {
        return new ArrayList<>(dealershipInventory);
    }

    public void addVehicle(Vehicle vehicle) {
        dealershipInventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        dealershipInventory.remove(vehicle);
    }

    // method to make a feature to search by the make
    public ArrayList<Vehicle> getVehicleByMake(String make) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            if (v.getMake().equalsIgnoreCase(make)) {
                inputMatches = true;
                results.add(v);
            }
        }
       inputMismatch(inputMatches);
        return results;
    }

    // method to search by model
    public ArrayList<Vehicle> getVehicleByModel(String model) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            if (v.getModel().equalsIgnoreCase(model)) {
                inputMatches = true;
                results.add(v);
            }
        }
        inputMismatch(inputMatches);
        return results;
    }

    //method to search by color
    public ArrayList<Vehicle> getVehicleColor(String color) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                inputMatches = true;
                results.add(v);
            }
        }
        inputMismatch(inputMatches);
        return results;
    }

    //method to search by VIN
    public ArrayList<Vehicle> getVehicleVin(int vin) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            if (v.getVin() == vin) {
                inputMatches = true;
                results.add(v);
            }
        }
       inputMismatch(inputMatches);
        return results;
    }

    // method to search by vehicle type
    public ArrayList<Vehicle> getVehicleType(String type) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            if (v.getVehicleType().equalsIgnoreCase(type)) {
                inputMatches = true;
                results.add(v);
            }
        }
        inputMismatch(inputMatches);
        return results;
    }

    //method to search by price
    public ArrayList<Vehicle> getVehiclesByPrice(double price) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            if (v.getPrice() <= price) {
                inputMatches = true;
                results.add(v);
            }
        }
        inputMismatch(inputMatches);
        return results;
    }

    // method to search by mileage
    public ArrayList<Vehicle> getVehiclesByMileage(int miles) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            if (v.getOdometer() <= miles) {
                inputMatches = true;
                results.add(v);
            }
        }
        inputMismatch(inputMatches);
        return results;
    }

    // method to search by year
    public ArrayList<Vehicle> getVehicleYear(int year) {
        ArrayList<Vehicle> results = new ArrayList<>();
        boolean inputMatches = false;
        for (Vehicle v : dealershipInventory) {
            inputMatches = true;
            if (v.getYear() == year) {
                results.add(v);
            }
        }
        inputMismatch(inputMatches);
        return results;
    }


    public String toStringForBusinessFile() {
        return String.format("%s|%s|%.2s", businessName, address, phoneNumber);
    }

    private void inputMismatch(boolean inputMatches){
        if (!inputMatches){
            System.out.println("\nSORRY VEHICLE CAN NOT BE FOUND");
        }

}
}
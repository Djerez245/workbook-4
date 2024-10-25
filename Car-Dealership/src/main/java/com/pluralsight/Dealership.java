package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

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
    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            results.add(v);
        }
        return results;
    }

    public void addVehicle(Vehicle vehicle) {
        dealershipInventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        dealershipInventory.remove(vehicle);
    }


    // method to make a feature to search by the make
    public ArrayList<Vehicle> getVehicleByMake(String make) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getMake().equalsIgnoreCase(make)) {
                results.add(v);
            }
        }
        return results;
    }

    // method to search by model
    public ArrayList<Vehicle> getVehicleByModel(String model) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getModel().equalsIgnoreCase(model)) {
                results.add(v);
            }
        }
        return results;
    }

    //method to search by color
    public ArrayList<Vehicle> getVehicleColor(String color) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                results.add(v);
            }
        }
        return results;
    }

    //method to search by VIN
    public ArrayList<Vehicle> getVehicleVin(int vin) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getVin() == vin) {
                results.add(v);
            }
        }
        return results;
    }

    // method to search by vehicle type
    public ArrayList<Vehicle> getVehicleType(String type) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getVehicleType().equalsIgnoreCase(type)) {
                results.add(v);
            }
        }
        return results;
    }

    //method to search by price
    public ArrayList<Vehicle> getVehiclePrice(double price) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getPrice() <= price) {
                results.add(v);
            }
        }
        return results;
    }

    // method to search by mileage
    public ArrayList<Vehicle> getVehicleMileage(int miles) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getOdometer() <= miles) {
                results.add(v);
            }
        }
        return results;
    }

    // method to search by year
    public ArrayList<Vehicle> getVehicleYear(int year) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for (Vehicle v : dealershipInventory) {
            if (v.getYear() == year) {
                results.add(v);
            }
        }
        return results;
    }

    public String toStringForFile() {
        return String.format("%s | %s | %.2s", businessName, address, phoneNumber);
    }

}
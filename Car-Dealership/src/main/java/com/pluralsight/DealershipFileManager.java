package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    // method to create the header
    public Dealership getDealerShip(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // parsed the first line of the csv file that contains the header
            String input = bufferedReader.readLine();

            String[] part = input.split("\\|");
            String businessName = part[0];
            String address = part[1];
            String phoneNumber = part[2];
            Dealership dealership = new Dealership(businessName, address, phoneNumber);
            while ((input = bufferedReader.readLine()) != null) {
                String[] vPart = input.split("\\|");
                int vin = Integer.parseInt(vPart[0]);
                int year = Integer.parseInt(vPart[1]);
                String make = vPart[2];
                String model = vPart[3];
                String vehicleType = vPart[4];
                String color = vPart[5];
                int odometer = Integer.parseInt(vPart[6]);
                double price = Double.parseDouble(vPart[7]);
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
            }
            return dealership;
        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        }
        return null;
    }
    public void saveDealership(Dealership dealership){}
}

package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    // read each part of each vehicle into memory
    public static void createInventory() throws IOException {
        FileReader fileReader = new FileReader("inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();
        String input;
        while ((input = bufferedReader.readLine()) != null) {
            String[] part = input.split("\\|");
            int vin = Integer.parseInt(part[0]);
            int year = Integer.parseInt(part[1]);
            String make = part[2];
            String model = part[3];
            String vehicleType = part[4];
            String color = part[5];
            int odometer = Integer.parseInt(part[6]);
            double price = Double.parseDouble(part[7]);
            Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
            Dealership.vehicleInventory.add(vehicle);
        }
    }



}

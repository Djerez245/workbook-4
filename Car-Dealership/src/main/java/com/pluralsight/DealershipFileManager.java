package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

    // method to create the header
    public Dealership getDealerShip(String file) {
        Dealership dealership = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // parsed the first line of the csv file that contains the header
            String input = bufferedReader.readLine();

            String[] part = input.split("\\|");
            String businessName = part[0];
            String address = part[1];
            String phoneNumber = part[2];
            dealership = new Dealership(businessName, address, phoneNumber);

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
        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) throws IOException {
        FileWriter fileWriter = new FileWriter("inventory.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String header = dealership.toStringForBusinessFile();
        bufferedWriter.write(header);
        bufferedWriter.newLine();
        for (Vehicle v : dealership.getAllVehicles()) {
            bufferedWriter.write(v.toStringForVehicleFile());
        }
        bufferedWriter.close();
    }


}

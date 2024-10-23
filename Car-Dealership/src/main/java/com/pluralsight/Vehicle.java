package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Vehicle {
    int vin;
    int year;
    String make;
    String Model;
    String vehicleType;
    String color;
    int odometer;
    double price;

    ArrayList<Vehicle> vehicleInventory = new ArrayList<>();

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        Model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;

    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // reads each part of each vehicle into memory
    public void createInventory() throws IOException {
        FileReader fileReader = new FileReader("inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;
        while ((input = bufferedReader.readLine()) != null){
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
            vehicleInventory.add(vehicle);
        }

    }

}

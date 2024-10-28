package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String Model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;


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

    public String toString(){
        return String.format("VIN: %-10d | Year: %-5d | Make: %-8s | Model: %-10s | Type: %-8s | Color: %-8s | Odometer: %-10d | Price: %.2f",
                vin, year, make, Model, vehicleType, color, odometer, price);
    }

    public String toStringForVehicleFile(){
        return String.format("%d|%d|%s|%s|%s|%s|%d|%.2f\n",
                vin, year, make, Model, vehicleType, color, odometer, price);
    }



}



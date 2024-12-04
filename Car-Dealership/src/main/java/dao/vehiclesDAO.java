package dao;

import com.pluralsight.Vehicle;

import java.util.ArrayList;

public interface vehiclesDAO {
    public ArrayList<Vehicle> getVehicleByMake(String make);
    public ArrayList<Vehicle> getVehicleByModel(String model);
    public ArrayList<Vehicle> getVehicleByColor(String color);
    public ArrayList<Vehicle> getVehicleByVin(int vin);
    public ArrayList<Vehicle> getVehiclesByType(String type);
    public ArrayList<Vehicle> getVehiclesByPrice(double price);
    public ArrayList<Vehicle> getVehiclesByMileage(int miles);
    public ArrayList<Vehicle> getVehicleByYear(int year);
}

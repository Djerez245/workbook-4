package dao;

import com.pluralsight.Vehicle;

import javax.sql.DataSource;
import java.util.ArrayList;

public class vehiclesDAOMySqlImpl implements vehiclesDAO {

    DataSource dataSource;

    public vehiclesDAOMySqlImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public ArrayList<Vehicle> getVehicleByMake(String make) {
        ArrayList<Vehicle> vehicleByMake = new ArrayList<>();
        return vehicleByMake;
    }

    @Override
    public ArrayList<Vehicle> getVehicleByModel(String model) {
        ArrayList<Vehicle> vehicleByModel = new ArrayList<>();
        return vehicleByModel;
    }

    @Override
    public ArrayList<Vehicle> getVehicleByColor(String color) {
        ArrayList<Vehicle> vehicleByColor = new ArrayList<>();
        return vehicleByColor;
    }

    @Override
    public ArrayList<Vehicle> getVehicleByVin(int vin) {
        ArrayList<Vehicle> vehicleByVin = new ArrayList<>();
        return vehicleByVin;
    }

    @Override
    public ArrayList<Vehicle> getVehiclesByType(String type) {
        ArrayList<Vehicle> vehicleByType = new ArrayList<>();
        return vehicleByType;
    }

    @Override
    public ArrayList<Vehicle> getVehiclesByPrice(double price) {
        ArrayList<Vehicle> vehicleByPrice = new ArrayList<>();
        return vehicleByPrice;
    }

    @Override
    public ArrayList<Vehicle> getVehiclesByMileage(int miles) {
        ArrayList<Vehicle> vehicleByMileage = new ArrayList<>();
        return vehicleByMileage;
    }

    @Override
    public ArrayList<Vehicle> getVehicleByYear(int year) {
        ArrayList<Vehicle> vehicleByYear = new ArrayList<>();
        return vehicleByYear;
    }
}

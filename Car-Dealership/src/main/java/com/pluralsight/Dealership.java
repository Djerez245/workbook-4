package com.pluralsight;

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
    public void getAllVehicles() {
        for (Vehicle v : dealershipInventory) {
            System.out.println(v);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        dealershipInventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        dealershipInventory.remove(vehicle);
    }


    // method to make a feature to search by the make
    public void getVehicleByMake(String make) {
        for (Vehicle v : dealershipInventory) {
            if (v.getMake().equalsIgnoreCase(make)) {
                System.out.println(v.toString());
            }
        }
    }

    // method to search by model
    public void getVehicleByModel(String model) {
        for (Vehicle v : dealershipInventory) {
            if (v.getMake().equalsIgnoreCase(model)) {
                System.out.println(v.toString());
            }
        }
    }

    //method to search by color
    public void getVehicleColor(String color) {
        for (Vehicle v : dealershipInventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                System.out.println(v.toString());
            }
        }
    }

    //method to search by VIN
    public void getVehicleVin(int vin) {
        for (Vehicle v : dealershipInventory) {
            if (v.getVin() == vin) {
                System.out.println(v.toString());
            }
        }
    }

    // method to search by vehicle type
    public void getVehicleType(String type) {
        for (Vehicle v : dealershipInventory) {
            if (v.getVehicleType().equalsIgnoreCase(type)) {
                System.out.println(v.toString());
            }
        }
    }

    //method to search by price
    public void getVehiclePrice(double price) {
        for (Vehicle v : dealershipInventory) {
            if (v.getPrice() <= price) {
                System.out.println(v.toString());
            }
        }// method to search by mileage
    }

    // method to search by mileage
    public void getVehicleMileage(int miles){
        for (Vehicle v : dealershipInventory) {
            if (v.getOdometer() <= miles) {
                System.out.println(v.toString());
            }
        }
    }

    // method to search by year
    public void getVehicleYear(int year) {
        for (Vehicle v : dealershipInventory) {
            if (v.getYear() == year) {
                System.out.println(v.toString());
            }
        }
    }








}








    // method to search by year
//    public static void getVehicleYear() {
//        Scanner scanner = new Scanner(System.in);
//        Prompts.printPrompt(Prompts.yearSearch);
//        int input = scanner.nextInt();
//
//        for (Vehicle v : vehicleInventory) {
//            if (v.getYear() == input) {
//                System.out.println(v.toString());
//            }
//        }
//    }






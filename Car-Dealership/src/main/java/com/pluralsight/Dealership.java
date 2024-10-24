package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String businessName;
    private String address;
    private String phoneNumber;

    public Dealership(String businessName, String address, String phoneNumber) {
        this.businessName = businessName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return String.format("%s | %s | %s");
    }

    // declare array list
    static ArrayList<Vehicle> vehicleInventory = new ArrayList<>();


    // method to create the header
    public static void createHeader() throws IOException {
        FileReader fileReader = new FileReader("inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // parsed the first line of the csv file that contains the header
        String input = bufferedReader.readLine();
            String [] part = input.split("\\|");
            String businessName = part[0];
            String address = part[1];
            String phoneNumber = part[2];
            Dealership Header = new Dealership(businessName, address, phoneNumber);

            for (String d : part ){
                System.out.println(d);
            }

    }



    // method to make a feature to search by the make
    public static void searchByMake(){
        Scanner scanner = new Scanner(System.in);
        Prompts.printPrompt(Prompts.makeSearch);
        String userInput = scanner.nextLine();

        for (Vehicle v : vehicleInventory){
            if (v.getMake().equalsIgnoreCase(userInput)){
                System.out.println(v.toString());
            }
        }

    }

}

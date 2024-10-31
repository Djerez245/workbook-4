package com.pluralsight;

import java.io.*;

public class ContractDataManager {

//    public Contract Contract(String file){
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String input = bufferedReader.readLine();
//            String[] part = input.split("\\|");
//            String typeOfContract = part[0];
//            int invoiceNumber = Integer.parseInt(part[1]);
//            String customerName = part[2];
//            String email = part[3];
//            int vin = Integer.parseInt(part[4]);
//            int year = Integer.parseInt(part[5]);
//            String make = part[6];
//            String model = part[7];
//            String vehicleType = part[8];
//            String color = part[9];
//            int mileage = Integer.parseInt(part[10]);
//            double price = Double.parseDouble(part[11]);
//            Contract contract = new Contract(typeOfContract, invoiceNumber, customerName, email, vin, year, make, model, vehicleType, color, mileage, price);
//
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    public void saveContract(Contract c){
        // TODO: save contract to the file
        FileWriter fileWriter = new FileWriter("contracts.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // TODO: open contracts file for writing/append
        bufferedWriter.write(c.toString());

        //if it is sales contract write using the following format
        // SALE|20210928|Dana Wyatt|dana@texas.com|10112|1993|Ford|Explorer|SUV|Red|525123|995.00|49.75|100.00|295.00|1439.75|NO|0.00
        //else if it is a lease contract use the following format
        // LEASE|20210928|Zachary Westly|zach@texas.com|37846|2021|Chevrolet|Silverado|truck|Black|2750|31995.00|15997.50|2239.65|18337.15|541.39
    }
}

package com.pluralsight;

import java.io.*;

public class ContractDataManager {

    public void saveContract(Contract c){
        // TODO: save contract to the file
        try {
            FileWriter fileWriter = new FileWriter("contracts.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // TODO: open contracts file for writing/append
            bufferedWriter.write(c.toString());
            bufferedWriter.close();
        }catch (Exception e){
            System.out.println("oops");
        }

        //if it is sales contract write using the following format
        // SALE|20210928|Dana Wyatt|dana@texas.com|10112|1993|Ford|Explorer|SUV|Red|525123|995.00|49.75|100.00|295.00|1439.75|NO|0.00
        //else if it is a lease contract use the following format
        // LEASE|20210928|Zachary Westly|zach@texas.com|37846|2021|Chevrolet|Silverado|truck|Black|2750|31995.00|15997.50|2239.65|18337.15|541.39
    }
}

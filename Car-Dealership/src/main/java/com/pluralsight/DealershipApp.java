package com.pluralsight;

import java.io.IOException;

public class DealershipApp {



    public static void main(String[] args) throws IOException {
        // print header
        Dealership.createHeader();
        // reads the inventory into memory
        DealershipFileManager.createInventory();

    }
}

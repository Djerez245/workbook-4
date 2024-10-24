package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {



    // declare array list
    static ArrayList<Vehicle> vehicleInventory = new ArrayList<>();

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

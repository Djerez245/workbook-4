package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {


    @Test
    void search_make() {

        Vehicle[] vehicleInventory ={
         new Vehicle(1234556, 2022, "Ford", "mustang", "sedan", "blue", 12345, 12000),
                new Vehicle(1234556, 2022, "Honda", "accord", "sedan", "blue", 12345, 12000) };



        for (Vehicle v : vehicleInventory){
            if (v.getMake().equalsIgnoreCase("ford")){
                System.out.println(v.toString());

                assertEquals("Ford", v.getMake());
            }

        }
    }
}
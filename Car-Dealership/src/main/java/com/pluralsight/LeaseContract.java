package com.pluralsight;

import java.util.ArrayList;

public class LeaseContract extends Contract{
double expectedEndingValue;
double leaseFee;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold) {

        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }


    public double getExpectedEndingValue() {
        expectedEndingValue = vehicleSold.getPrice() / 2;
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        leaseFee = vehicleSold.getPrice() + (vehicleSold.getPrice() * .07);
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    public String toString(){
        return String.format("LEASE|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%.2f|%.2f|%.2f|%.2f|%.2f\n", dateOfContract, customerName, customerEmail, vehicleSold.getVin(),
                vehicleSold.getYear(), vehicleSold.getMake(), vehicleSold.getModel(), vehicleSold.getVehicleType(), vehicleSold.getColor(),
                vehicleSold.getOdometer(), vehicleSold.getPrice(), getExpectedEndingValue(), getLeaseFee(), totalPrice, monthlyPayment);
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}

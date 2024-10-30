package com.pluralsight;

import java.time.LocalDate;

public class LeaseContract extends Contract{
double expectedEndingValue;
double leaseFee;
double monthlyPayment;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment,
                         double expectedEndingValue, double leaseFee, double monthlyPayment1) {

        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
        this.monthlyPayment = monthlyPayment1;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}

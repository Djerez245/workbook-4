package com.pluralsight;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private String ifWantToFinance;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold, double totalPrice, double monthlyPayment,
                         double salesTaxAmount, double recordingFee, double processingFee, String ifWantToFinance) {

        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.ifWantToFinance = ifWantToFinance;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public String getIfWantToFinance() {
        return ifWantToFinance;
    }

    public void setIfWantToFinance(String ifWantToFinance) {
        this.ifWantToFinance = ifWantToFinance;
    }

    public String toString(){
       return String.format("%s|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%f|%f|%f|%f|%f|%s|%f");
    }

    @Override
    public void getTotalPrice() {
    }

    @Override
    public void getMonthlyPayment() {
        if(totalPrice >= 10000){


        }
    }
}

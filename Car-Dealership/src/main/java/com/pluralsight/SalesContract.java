package com.pluralsight;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private String ifWantToFinance;
    private double paymentIfFinanced;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment,
                         double salesTaxAmount, double recordingFee, double processingFee, String ifWantToFinance, double paymentIfFinanced) {

        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.ifWantToFinance = ifWantToFinance;
        this.paymentIfFinanced = paymentIfFinanced;
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

    public double getPaymentIfFinanced() {
        return paymentIfFinanced;
    }

    public void setPaymentIfFinanced(double paymentIfFinanced) {
        this.paymentIfFinanced = paymentIfFinanced;
    }

}

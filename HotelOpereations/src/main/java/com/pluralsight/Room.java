package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable(){
        return !isOccupied && !isDirty;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void checkIn(){
        setDirty(true);
        setOccupied(true);
    }

    public void checkOut(Room room){
        HouseKeeper h = new HouseKeeper();
        h.cleanRoom(room);
        setDirty(false);
        setOccupied(false);
    }

    public boolean checkedIn(){
        return isDirty && isOccupied;
    }

    public boolean checkedOut(){
      return !isDirty && !isOccupied;
    }
}

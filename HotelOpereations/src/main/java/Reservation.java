public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;


    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        if (roomType.equalsIgnoreCase("king")){
            price = 139.00;
        }
        if (roomType.equalsIgnoreCase("double")){
            price = 124.00;
        }
        if (isWeekend){
             price *= 1.1;
        }
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double ReservationTotal(){
        return price * numberOfNights;
    }
}

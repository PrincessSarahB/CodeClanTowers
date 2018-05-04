package rooms;

import java.util.ArrayList;

public class Bedroom extends Room {

    public int roomNumber;
    private RoomType type;
    private double rate;

    public Bedroom(int capacity, int roomNumber, double rate, RoomType roomType) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.rate = rate;
        this.type = roomType;
        this.guest = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public double getRate() {
        return rate;
    }

}

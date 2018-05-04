package rooms;


import guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    public int capacity;
    protected ArrayList<Guest> guest;

    public Room (int capacity) {
        this.capacity = capacity;
        this.guest = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuest() {
        return guest;
    }
}

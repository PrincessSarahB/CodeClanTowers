package rooms;


import guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    public int capacity;
    public ArrayList<Guest> guest;

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

    public void addGuest(Guest guest){
        int remainingCapacity = this.capacity - this.guest.size();
        if(remainingCapacity > 0){
        this.guest.add(guest);
        }
    }

    public int numberOfGuestsInRoom(){
       return this.guest.size();
    }


}

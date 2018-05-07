package rooms;


import guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    public int capacity;
    public ArrayList<Guest> guests;

    public Room (int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        ArrayList<Guest> copy = new ArrayList<>(guests);
        return copy;
    }

    public void addGuest(Guest guest){
        int remainingCapacity = this.capacity - this.guests.size();
        if(remainingCapacity > 0){
        this.guests.add(guest);
        }
    }

    public int numberOfGuestsInRoom(){
       return this.guests.size();
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }






}

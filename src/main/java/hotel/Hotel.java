package hotel;

import guests.Guest;
import rooms.*;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> rooms;
    private ArrayList<DiningRoom> diningRooms;


    public Hotel() {
        this.conferenceRooms = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();

    }


    public void addBedroom(Bedroom bedroom){
        this.rooms.add(bedroom);
    }

    public int countBedrooms(){
        return this.rooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int countConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.add(diningRoom);
    }

    public int countDiningRooms(){
        return this.diningRooms.size();
    }

    public void checkIn(Room room, Guest guest){
            room.addGuest(guest);
        }

    public void checkOut(Room room, Guest guest){
        room.removeGuest(guest);
    }

    public ArrayList listGuestsInRoom(Room room) {
      return room.getGuests();
    }

    public ArrayList listVacantRooms() {
        ArrayList vacantRooms = new ArrayList<>();
        for (Room room : this.rooms) {
            if (room.guests.size() == 0) {
                vacantRooms.add(room);
            }
        }
        return vacantRooms;
    }




    }


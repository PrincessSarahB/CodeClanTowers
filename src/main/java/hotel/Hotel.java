package hotel;

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

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<Bedroom> getRooms() {
        return rooms;
    }

    public ArrayList<DiningRoom> getDiningrooms() {
        return diningRooms;
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
}

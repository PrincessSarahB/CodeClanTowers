package hotel;

import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.RoomType;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> rooms;
    private ArrayList<DiningRoom> diningrooms;

    public Hotel() {
        this.conferenceRooms = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<Bedroom> getRooms() {
        return rooms;
    }

    public ArrayList<DiningRoom> getDiningrooms() {
        return diningrooms;
    }

    public void addRoom(Bedroom room){
        this.rooms.add(room);
    }

    public int countBedrooms(){
        return this.rooms.size();
    }
}

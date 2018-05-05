import guests.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceroom1;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;



    @Before
    public void before(){
        hotel = new Hotel();
        conferenceroom1 = new ConferenceRoom(20, "Alpha", 150.00);
        bedroom1 = new Bedroom(RoomType.DOUBLE.getValue(), 123, 200.00, RoomType.DOUBLE);
        bedroom2 = new Bedroom(RoomType.TWIN.getValue(), 124, 300.00, RoomType.TWIN);
        bedroom3 = new Bedroom(RoomType.SINGLE.getValue(), 125, 100.00, RoomType.SINGLE);
        bedroom4 = new Bedroom(RoomType.FAMILY.getValue(), 126, 400.00, RoomType.FAMILY);
        diningRoom = new DiningRoom(100, "Alfonso's");
        guest1 = new Guest("Bob Miller");
        guest2 = new Guest("Jean Miller");
        guest3 = new Guest("Gary Miller");
        guest4 = new Guest("Clare Miller");
    }

    @Test
    public void hasBedrooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);
        assertEquals(4, hotel.countBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        hotel.addConferenceRoom(conferenceroom1);
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void hasDiningRooms(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void canCheckInBedroom(){
         hotel.checkIn(bedroom1, guest1);
         hotel.checkIn(bedroom1, guest2);
        assertEquals(2, bedroom1.numberOfGuestsInRoom());
    }

    @Test
    public void cannotCheckInBedroomFull(){
        hotel.checkIn(bedroom1, guest1);
        hotel.checkIn(bedroom1, guest2);
        hotel.checkIn(bedroom1, guest3);
        assertEquals(2, bedroom1.numberOfGuestsInRoom());
    }

    @Test
    public void canCheckInConferenceRoom(){
        hotel.checkIn(conferenceroom1, guest1);
        hotel.checkIn(conferenceroom1, guest2);
        assertEquals(2, conferenceroom1.numberOfGuestsInRoom());
    }

    @Test
    public void cannotCheckInConferenceRoomFull(){
        for (int i = 0; i<21; i++){
            hotel.checkIn(conferenceroom1, guest1);
        }
        assertEquals(20, conferenceroom1.numberOfGuestsInRoom());
    }

    @Test
    public void canCheckInDiningRoom(){
        hotel.checkIn(diningRoom, guest1);
        assertEquals(1, diningRoom.numberOfGuestsInRoom());
    }

    @Test
    public void cannotCheckInDiningRoomFull(){
        for (int i = 0; i<101; i++){
            hotel.checkIn(diningRoom, guest1);
        }
        assertEquals(100, diningRoom.numberOfGuestsInRoom());
    }

    @Test
    public void canCheckGuestOutOfBedroom(){
        bedroom4.addGuest(guest1);
        bedroom4.addGuest(guest2);
        bedroom4.addGuest(guest3);
        bedroom4.addGuest(guest4);
        hotel.checkOut(bedroom4, guest2);
        assertEquals(3, bedroom4.numberOfGuestsInRoom());

    }

    @Test
    public void canCheckGuestOutOfConferenceRoom(){
        conferenceroom1.addGuest(guest1);
        conferenceroom1.addGuest(guest2);
        conferenceroom1.addGuest(guest3);
        hotel.checkOut(conferenceroom1, guest2);
        assertEquals(2, conferenceroom1.numberOfGuestsInRoom());

    }

    @Test
    public void canCheckGuestOutOfDiningRoom(){
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        diningRoom.addGuest(guest3);
        diningRoom.addGuest(guest4);
        hotel.checkOut(diningRoom, guest3);
        assertEquals(3, diningRoom.numberOfGuestsInRoom());

    }

    @Test
    public void guestsInRoom(){
        hotel.checkIn(bedroom2, guest1);
        hotel.checkIn(bedroom2, guest2);
        assertEquals(2, hotel.listGuestsInRoom(bedroom2).size());
    }

    @Test
    public void vacantRooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom4);
        hotel.checkIn(bedroom1, guest3);
        hotel.checkIn(bedroom3, guest4);
        assertEquals(2, hotel.listVacantRooms().size());
    }


}

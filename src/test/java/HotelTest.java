import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceroom1;
    ConferenceRoom conferenceroom2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    DiningRoom diningRoom;



    @Before
    public void before(){
        hotel = new Hotel();
        conferenceroom1 = new ConferenceRoom(20, "Alpha", 150.00);
        conferenceroom2 = new ConferenceRoom(50, "Bravo", 300.00);
        bedroom1 = new Bedroom(RoomType.DOUBLE.getValue(), 123, 200.00, RoomType.DOUBLE);
        bedroom2 = new Bedroom(RoomType.TWIN.getValue(), 124, 300.00, RoomType.TWIN);
        bedroom3 = new Bedroom(RoomType.SINGLE.getValue(), 125, 100.00, RoomType.SINGLE);
        bedroom4 = new Bedroom(RoomType.FAMILY.getValue(), 126, 400.00, RoomType.FAMILY);
        diningRoom = new DiningRoom(100, "Alfonso's");
    }

    @Test

    public void hasBedrooms(){
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(bedroom3);
        hotel.addRoom(bedroom4);
        assertEquals(4, hotel.countBedrooms());
    }

    @Test

    public void hasConferenceRooms(){
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test

    public void hasDiningRooms(){
        assertEquals(0, hotel.getDiningrooms().size());
    }


}

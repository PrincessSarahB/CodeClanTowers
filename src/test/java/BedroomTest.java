import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
//    RoomType double

    @Before

    public void before(){

        bedroom = new Bedroom(RoomType.DOUBLE.getValue(), 123, 200.00, RoomType.DOUBLE);
        guest = new Guest("Jim Miller");
    }

    @Test

    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(123, bedroom.getRoomNumber());
    }

    @Test
    public void roomHasRate(){
        assertEquals(200.00, bedroom.getRate(), 0.01);
    }

    @Test
    public void roomHasType(){
        assertEquals(RoomType.DOUBLE, bedroom.getType());
    }

    @Test

    public void canCheckInGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }
}

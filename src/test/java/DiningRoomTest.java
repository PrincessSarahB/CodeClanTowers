import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before(){
        diningRoom = new DiningRoom(50, "Alfonso's");
        guest = new Guest("Jim Miller");
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Alfonso's", diningRoom.getName());
    }

    @Test
    public void canCheckInGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.numberOfGuestsInRoom());
    }
}
